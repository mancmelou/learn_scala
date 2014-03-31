Control structures and functions
================================

In Scala almost all constructs have a value vs other programming languages where
we differentiate expressions (`1 + 2` returns `3`) and statements (`if`, `print`).

- An expression has a value
- A statement carries out an action

Things that we are not used to return values are `if`, or block `{}`. Block returns the value of last expression.

Conditional expressions
-----------------------
In Scala if/else has a value. We can put the value of if/else expression into a variable. 

```scala
val n = 0
val result = if (n > 0) 1 else 0
```

Every expression has a type. The previous expression has the type `Int`. If an if/else expression
returns a mixed type then the return value type is the first common super type in the type hierarchy.

```scala
val n = 0
if (n > 0) "Yes" else -1
```
The type of the returned value will be `Any`.

Block expressions
-----------------
Blocks are defined within a pair of brackets `{}`. Block is a sequence of expressions and the result is also an expression. The value of the block is the value of the last expression. 

```scala
val res = { val x = 1; val y = 2; x + y }
```

There's one thing a Scala programmer must be aware of *assignments return no value*, or strictly speaking they have a value of type `Unit` (aka void in C, C++, Java). A block that ends with an assignment will return a `Unit` value.

```scala
{ val x = 1 + 2; x -= 1 }
```

Input and output
----------------
To print a value to std use `print` or `println`. There's also C style `printf` function for formated output. 

```scala
print("Hello world!\n")

println("Hello again!")
```

You can read line by using the `readLine` or you can use `readInt`, `readBoolean`, `readDouble` and so on.

```scala
val name = readLine("Your name: ")

print("Your age: ")
val age = readInt()

printf("Hello %s, next year you'll be %d.\n", name, age + 1)
```

Loops
-----
Scala has the same `while` and `do` loops like in other languages.

```scala
while (n > 0) {
  r  = r * n
  n -= 1
}
```

There's no direct analog for the `for` loop. Instead you can use `while` or write `for` like this:

```scala
for (i <- 1 to n) {
  r = r * i
}
```

For traversing a string or and array where we usually start from 0 to n then istead of `to` construct we can use `until`.

```scala
val   s = "Hello"
var sum = 0

for (i <- 0 until s.length) s += sum(i)
```

Scala has no `break` and `continue` statements that can help controlling a loop execution. Instead of that we can:
- use Boolean control variables 
- use nested funcitons and return from the middle of a funciton 
- use the `break` method from the `Breaks` object

Advanced `for` loops 
--------------------
Multiple generators are allowed as long as we separate them with a `;`.

```scala
for (i <- 1 to 3; j <- 1 to 3) print(j * i)
```

Each generator can have a "guard".

```scala
for (i <- 1 to 3; j <- 1 to 3; if i != j) print(j + i)
```

Also definitions are allowed too for introducing vars inside the loops.

```scala
for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(i + j)
```

Using yield inside loops will return a collection

```scala
for (i <- 0 to 10) yield i * 10

for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
```

Functions 
---------
Simple function definition.

```scala
def abs(n: Int) = if (x >= 0) x else -x

// function return type is a must if the function is recursive
def fact(n: Int): Int = if (n <= 0) 1 else n * fact(n - 1)
```

Default and named arguments
---------------------------
Like in other languages you can provide default arguments in the function definition.

```scala
def pretify(text: String, left: String = "[[[[ ", right: String = " ]]]]") = left + text + right

// use default parameters
println(pretify("Retention Science"))

// use named params in any order
println(pretify(left = "*** ", right = " :::", text = "Hello world!!"))
```

Variable arguments
------------------

```scala 
def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  
  result
}

sum(1,2) + sum(1,2,3,4)

// Ruby's splat operator equivalent is `_*`.
sum(1 to 5: _*)
```

Procedures
----------
Functions that do not return values. To define a procedure use the `def` keyword without the preceeding `=` symbol. Return type of functions defined in this way is always `Unit`.

```scala
def greeting(msg: String) { // NO "=" SYMBOL AFTER THE PARAM LIST
  println(">>> " + msg + " <<<")
}
```

Lazy values
-----------
When a val is defined as lazy, it's initialization is deferred until is accessed for the first time. Use lazy values to delay costly initializations like setting up a http connection, reading large files etc.

```scala 
lazy val words = scala.io.Source.fromFile("/var/retsci/features/users.tsv").mkString
```

Exceptions
----------
Throwing exceptions works like in other languages. An object can be thrown as long as it inherits `java.lang.Throwable`. 

A throw expression has the special type `Nothing` which is useful in `if/else` expressions when the both branches have to return either the same type of one of the supertypes. In case one of the branches has `Nothing` the return type of `if/else` expression will be the type of the other branch. 

```scala 
if (x >= 0) sqrt(x) else throw new IllegalArgumentException("x cannot be negative")
```

Catching exceptions follows the matching pattern principles.

```scala
val url = new URL("http://google.com")

try {
  process(url)
} catch {
  // you can use `_` for the variable name if you don't need it
  case _: MailformedURLEception => println("Bad URL: " + url)
  
  // or you can use variable name when you need to reference it
  case ex: IOException => ex.printStackTrace()
}
```

The full syntax for handling exceptions is `try {} catch {} finally {}`.

Next
----
[Arrays](arrays.md)
