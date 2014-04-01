Objects
=======
Objects can come handy when we need to work with a singleton or we need to make a utility object. 

```scala 
object ID {
  private var lastNumber = 0 
  
  def next() = {
    lastNumber += 1
    lastNumber
  }
}

ID.next()
// 1
```

The constructor of this object will be executed first time the object is used. If the object is never used during the program execution the constructor will never be executed. Objects can esentially have all the features of a class, it can extend other classes or traits - the only exception is that we cannot provide constructor parameters. 

Companion objects
-----------------
In other languages sometimes we have a class with static methods. In Scala, this condition is achieved by having a class and it's companion object.

```scala 
class ID {
  val id = ID.next()
}

object ID {
  private var lastNumber = 0 
  
  def next() = {
    lastNumber += 1
    lastNumber
  }
}
```

The companion object must be in the same source file as the class if we want them to have access of their private variables.

Object extending a class or trait
---------------------------------
An object can extend another class and/or multiple traits. The result is an object of a class that extends the given class and/or the given traits.

```scala 
abstract class SteeringWheel {
  def left()
  def right()
}

object Vehicle extends SteeringWheel {
  override def left() {}
  override def right() {}
}
```

The `apply` method
------------------
Objects usually have implemented their `apply` method. The `apply` method is oftenly called for expressions of the form `Object(arg1, arg2, ... argN)`. We will see later this form is very handy, especially when working with nested expressions such as `Array(Array(1, 2), Array(3, 4))`.

```scala
// let's have a class
class BarCode(country: String, productId: Int) {
  def code: String = country + "-" + productId.toString
}

// companion object with the `apply` method
object BarCode {
  def apply(country: String, productId: Int): BarCode = new BarCode(country, productId)
}

val b = BarCode("US", 998123445)
b.code
// String = US-998123445
```

Next
----
[Inheritance](inheritance.md)
