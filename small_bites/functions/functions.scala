// Implicit functions
def id(x: Int): Int = x
println(s"id(5) == ${id(5)}")

// Anonymous funcitons
val hello = (firstName: String, lastName: String) => {
  s"Hello $firstName $lastName"
}
println(s"Calling hello == ${hello("Vladimir", "Ivic")} ")

// Class with apply method (think JavaScript)
class Identity {
  def apply(x: Int) = x
}

val myIdObject = new Identity
myIdObject.apply(123)
println(s"Calling myIdObject.apply(123) == ${myIdObject.apply(123)}")

// Object with apply method
object Id {
  def apply(n: Int) = n
}

Id.apply(456)
println(s"Calling Id.apply(456) == ${Id.apply(456)}")

// Anonymous class with apply method
val anotherIdObject = new {
  def apply(n: Int) = n * 10
}
anotherIdObject.apply(10)
println(s"Calling anotherIdObject.apply(10) == ${anotherIdObject.apply(10)}")

// Case block as an anonymous funciton
val myCase: Int => String = {
  case x => f"${x * 10}%.2f"
}
println(s"Calling myCase(9) == ${myCase(9)}")

// Multi argument funcitons
def add(y: Int, x: Int): Int = x + y
println(s"Calling add(9, 8) == ${add(9, 8)}")

// Curried multi argument functions
def addCurried(x: Int)(y: Int): Int = x + y
println(s"Calling addCurried(9)(8) == ${addCurried(9)(8)}")

val added9 = addCurried(9)_
println(s"Calling added9(8) == ${added9(8)}")

// Procedures
def proc(a: Int) { // Implicitly returns Unit
  println("I'm a procedure!")
}
println(s"Caling procedure proc(5) ${proc(5)}")

// Function without arguments
def noargs: Unit = println("I have no arguments!")
println(s"Calling procedure noargs $noargs")

// Lazy fields that cache their return vals (thinik ruby `return @result if @result`)
class LazyClass{
  lazy val n = {
    println("Evaluating only once")
    3.14
  }
}

val l = new LazyClass
println("Calling lazy field 3 times")
println(s"  1st time: ${l.n}")
println(s"  2nd time: ${l.n}")
println(s"  3rd time: ${l.n}")
