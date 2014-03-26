Chapter 3: Arrays
=================

Some key points:
- Use an `Array` if the length is fixed. Use an `ArrayBuffer` if the length can vary.
- Do not use `new` when creating an initial collection.
- Use `()` to access elements.
- Use `for (elem <- array)` to traverse the elements of a collection.
- Use `for (elem <- array if ...) ... yield ...` to transform into a new array.

Fixed length arrays
-------------------
A couple of examples. The code should be self explainatory. 

```scala 
// an array of 10 Ints all values init to val 0
val nums = new Array[Int](10) 

// an array of 10 strings all values init to null
val words = new Array[String](10)

// an array with initial values, the type is inferred; NOTE: there's no new keyword for this construct
val cities = Array("Belgrade", "Los Angeles", "Paris", "New York")

// accessing elements using () instead of [] like in other languages
println(cities(1))
```

Variable length arrays
----------------------
```scala
import scala.collection.mutable.ArrayBuffer

// Empty array buffer
val buffer = ArrayBuffer[Int]()
```

Multidimensional arrays
-----------------------
```scala
// 3 x 4 matrix of Doubles
val matrix = Array.ofDim[Double](3, 4)

// 10 x 10 matrix of Ints
val matrix2 = new Array[Array[Int]](10)
for (i <- 0 until matrix2.length) {
  matrix(i) = new Array[Int](10)
}
```

Traversing
----------

Transforming
------------
