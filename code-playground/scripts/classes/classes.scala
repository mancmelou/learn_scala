// an empty class
class A


// an empty extended class
class B extends A


// a class with an immutable field
class C {
  val field: String = "FIELD_VALUE"
}
val c = new C
println("Printing filed: " + c.field)


// class with params (note: `name` is not a field)
class Human(name: String) {
  def hi() = println("Hi! My name is " + name)
}
val p = new Human("Vladimir")
p.hi
// this wouldn't work
// println("Printing filed: " + p.name)


class Alien(val name: String)
// class with params that are also fields
// in this case this will work
val a = new Alien("ET")
println("Alien name is " + a.name)


// fields through parameters can also be mutable
class Machine(var name: String = "")
val m = new Machine
println(s"Machine has no name: ${m.name}")
m.name = "Cylon"
println(s"Machine has name: ${m.name}")


// params and fields can also be private
class Number(private val n: Int) {
  private var myPrivate = n
}


// fields can be artificial i.e. have setter and getter (think ruby)
class RubyLike {
  private var theValue = "Ruby"

  def field = theValue
  def field_=(newValue: String) = {
    this.theValue = newValue
  }
}
val r = new RubyLike
r.field // Ruby
r.field = "Scala"
r.field // Scala


// case classes allow patter matching
class NumericOrWord
case class Numeric(n: Int) extends NumericOrWord
case class Word(s: String) extends NumericOrWord

val n: NumericOrWord = Numeric(123) // note the lack of `new`

n match {
  case Word("foo")   => println("foo")
  case Numeric(89)   => println("89")
  case Numeric(n)    => println(n * 100)
}
// prints 12300


// classes can extend multiple traits
trait Left {
  def l() = {
    "left"
  }
}

trait Right {
  def r() = {
    "right"
  }
}

class Sides extends Left with Right
val s = new Sides
s.l()  // "left"
s.l() // "right"


// fields can be lazy (think ruby `return @field if field`)
class Lazy {
  lazy val x = {
    println("Evaluating the filed")
    val x = 9
    val y = 8
    y + y
  }
}
val l = new Lazy
l.x // will print out "Evaluating the filed" before it returns the result
l.x // will just return the result
l.x // will just return the result


// Class and its companion object (think class with static methods and fields)
class Greeter(name: String) {
  def greet() = {
    val greeting = Greeter.getGreeting(name) // object Greeter
    println(greeting)
  }
}

object Greeter {
  def getGreeting(name: String) = "Hello " + name + "!"
}

val g = new Greeter("Vladimir")
g.greet() 


// companion objects can inherit from class
class Person {
  def hi = println("Hi!")
}

object vladimir extends Person
vladimir.hi


// case objects (not classes) work in patter matching
class Bool

case object TRUE extends Bool
case object FALSE extends Bool

val b: Bool = TRUE

b match {
  case FALSE => println("False!")
  case TRUE  => println("True!")
}
// prints "True!"