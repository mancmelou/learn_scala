Chapter 4: Maps and Tuples
==========================

Maps
----
Constructing a map. 

```scala 
val location = Map(
  "continet" -> "North America",
  "country"  -> "USA", 
  "state"    -> "California",
  "city"     -> "Los Angeles"
)
```

Accessing map members.

```scala 
location("city")

// String = Los Angeles

val country = if (location.contains("cuntry")) location("country") else "-empty-"
```

Updating map values.

```scala
// to update a value
location("city") = "San Diego"

// to remove a key and its value
location -= "city"
```

Creating an empty map. 

```scala 
val location = Map[String, String]()
```

Iterating over Maps

```scala 
// iterate over the map with key and value pairs
for ((key, value) <- location) println(key + "\t\t" + value)

// iterate over the values
for (value <- location.values) println(value)

// iterate over the keys 
for (key <- location.keys) println(key)

// to switch keys and values
for ((key, value) <- location) yield (value, key)
```

Tuples
------
A tuple is a value formed by enclosing multiple individual values under one object. 

```scala
val math_constant = (1, 3.14, "Pi")

// Tuple3[Int, Double, String]

val (_, value, name) = math_constant
println(name + " = " + value)
```

Accessing tuple elements can be done with the methods `_1`, `_2` and `_3`. Note that the position of the elements of tuple don't start with 0 like with Array - with tuples, it starts from 1. 

Next
----
[Chapter 5: Classes](https://github.com/mancmelou/learn_scala/edit/master/notes/chapter5.md)
