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
Traversing using the `for` loop. 

```scala
val a = Array(1, 2, 3)

// traverse the elements 
for (i <- 0 until a.length) { //NOTE: until goes till a.length - 1
  println(a(i))
}

// traverse every second element
for (i <- 0 until (a.length, 2)) println(a(i))

// traverse in reverse order
for (i <- (0 until a.lenght).reverse) println(a(i))
```

If you don't need the index or don't know the actuall size of the collection, you can access the elements directly using the `for` loop. 

```scala 
val numbers = Array(1, 1, 3, 4, 2)

// access elements directly 
for (element <- numbers) println(element)
```

Transforming
------------
Array transformations can be achieved with the `yield` keyword. The idea is when transforming an array we don't want to modify the existing array but yield a new one. 

```scala
val collection = Array(1, 2, 3, 9, 8, 7)

// transform the elements so each of them is multiplied by 10
for (elem <- collection) yield elem * 10

// Array[Int] = Array(10, 20, 30, 90, 80, 70)
```

Sometimes when traversing the collection we want to add some restrictions to the elements we are traversing through.

```scala
val nums = Array(1,2,3,4)

// take only even numbers and multiply them by 100
for (n <- nums if n % 2 == 0) yield n * 100

//Array[Int] = Array(200, 400)
```

Next
----
Chapter 4: Maps and Tuples
