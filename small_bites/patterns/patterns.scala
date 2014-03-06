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
