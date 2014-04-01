Objects
=======
Objects can come handy when we need to work with a singleton or we need to make a utility object. 

```scala 
object ID {
  private var lastNumber = 0 
  
  def next = {
    lastNumber += 1
    lastNumber
  }
}
```

The constructor of this object will be executed first time the object is used. If the object is never used during the program execution the constructor will never be executed. Objects can esentially have all the features of a class, it can extend other classes or traits - the only exception is that we cannot provide constructor parameters. 

Companion objects
-----------------
