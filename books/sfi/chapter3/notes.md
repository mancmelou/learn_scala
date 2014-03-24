Chapter 3: Working with arrays
==============================

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
