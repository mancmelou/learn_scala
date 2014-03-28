Chapter 5: Classes
==================
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

Properties with getters only
----------------------------
