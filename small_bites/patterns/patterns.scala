// pattern matching usually replaces conditionals
val n = 10
n match {
  case 10 => println("It's 10!!")
}

val f = "foo"
f match {
  case "foo" => println("It's foo!")
}

val x: Any = 3
x match {
  case "foo" => println("It's foo!")
  case 10    => println("It's 10!")
}

// match by type
val y: Any = 10
y match {
  case _: String => println("It's a string")
  case _: Int    => println("It's an integer")
}

// case classes are matchable
object StringCons {
  def apply(c: Char, s: String) = c + s
  def unapply(s: String): Option[(Char, String)] = s match {
    case "" => None
    case _  => Some((s.charAt(0)), s.substring(1))
  }
}

// operator over loading for sugar
object :+: {
  def apply(c: Char, s: String) = c + s
  def unapply(s: String): Option[(Char, String)] = s match {
    case "" => None
    case _  => Some((s.charAt(0)), s.substring(1))
  }
}

"foo" match {
  case 'f' :+: "ooo" => println("Not me!")
  case 'f' :+: 'o' :+: rest => println("The rest is " + rest)
}

// multy arity extractions
object Factor {
  def factor(n: Int): List[Int] = n match {
    case 1 => List.empty
    case n => {
      for (i <- 2 to n) {
        if (n % i == 0) {
          return i :: factor(n / i)
        }
      }

      return List(n, 1)
    }
  }

  def unapplySeq(n: Int): Option[List[Int]] = {
    return Some(factor(n))
  }
}

// 120 =  2 * 2 * 2 * 3 * 5
120 match {
  case Factor(a, b, c) => println("Not me!")
  case Factor(a, b, c, d, e) => println((a, c, e))
}

// pattern matchable lists can be created from scratch
abstract class MyList[+A] {
  def :*: [B >: A] (head: B) = new `:*:`(head, this)
}

case class :*:[A](val head: A, val tail: MyList[A]) extends MyList[A]
case object MyNil extends MyList[Nothing]

val l: MyList[Int] = 3 :*: 4 :*: 5 :*: MyNil

l match {
  case hd :*: tl => print(hd)
}