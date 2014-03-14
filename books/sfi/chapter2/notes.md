Chapter 2
=========

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
