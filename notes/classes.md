Classes
=======
Fields in classes automatically come with setters and getters. All fields withing a class are public by default.

Simple classes 
--------------
```scala
class Abcd {
  // values must be initialized
  private val abcd     = "abcdefghijklmnopqrstuvwxyz"
  private var position = 0 
  
  // methods
  def next() = {
    val letter = abcd(position)
    position   = if (position >= abcd.length - 1) 0 else position + 1 
    
    letter
  }
}
```

Properties with setters and getters 
-----------------------------------
```scala
class Person {
  private var privAge = 0;
  
  // getter
  def age = privAge
  
  // setter
  def age_=(newValue: Int) {
    if (newValue > privAge) privAge = newValue
  }
}
```

Constructors
------------
Every class in scala has a primary constructor that is a part of the class defitnition. Any statement in the class definition is a part of the constructor. 
```scala 
class Car {
  println("Building a Car object!")
  
  def startEngine { 
    println("Brrm!")
  }
}

val c = new Car
// Building a Car object!
// c: Car = Car@48cac17

c.startEngine
// Brrm!
```

The parameters of the class will turn into the fields of the constructed object depending on how we use them. Here are a couple of examples:

With public fields:
```scala
class Car (val make: String, val year: Int)

val honda = new Car("Honda", 2014)

honda.make
// String = Honda

honda.year
// Integer = 2014
```

With public and a private field:
```scala
class Car (val make: String, private val year: Int)

val honda = new Car("Honda", 2014)

honda.make
// String = Honda

honda.year
// Error
```

Construction parameters can be regular method parameters, without `val` or `var`. We can use them inside the class body to build other fields using the parameters. If any of the parameters gets used in a method, that parameter automatically becomes a field, otherwise - the parameter won't be saved as a field.
```scala 
class Car (m: String, y: Int) {
  println("Building " + m + " " + y)
  
  def make = m
  def year = y
}
```

Auxilary constructors
---------------------
In addition to primary constructor, classes can have none or more auxilary constructors. The auxilary constructor is Scala is called `this` and each of them must start with either a call to a previously declared auxilary constructor or the primary constructor.

```scala 
class Car {
  private var make = ""
  private var year = 0
  
  def this (make: String) { // an auxilary constructor
    this() // calls primary constructor
    this.make = make
  }
  
  def this (make: String, year: Int) { // another auxilary constructor
    this(make) // calls the previous aux constructor
    this.year = year
  }
}

val honda1 = new Car // calls the primary constructor 
val honda2 = new Car("Honda") // calls the first aux constructor 
val honda3 = new Car("Honda", 2014) // calls the second aux constructor
```

To make the primary constructor private use the `private` keyword after the class name, right before the parameter list. This will enforce using auxilary constructor over the primary one when its needed.

```scala
class Car private (make: String, year: Int)
```

Next
----
[Objects](objects.md)
