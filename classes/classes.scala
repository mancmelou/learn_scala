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

