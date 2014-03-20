Chapter 1
=========
After installing scala, the scala interpreter will be available in your command shell. 

```bash
$ scala 
Welcome to Scala version 2.10.2 (Java HotSpot(TM) 64-Bit Server VM, Java 1.6.0_65).
Type in expressions to have them evaluated.
Type :help for more information.

scala> 8 * 5 + 2
res0: Int = 42
```

After each expression, the expression result will be stored in a `res` prefixed value. In this case you can use `res0` as a value to perform other calculations.

```bash
scala> res0 * 10
res1: Int = 420 
```

Declaring values and variables
------------------------------
Values are constants in scala, you cannot redefine the value of a `val`.

```bash
scala> val answer = 5
answer: Int = 5

scala> answer = 6
<console>:8: error: reassignment to val
       answer = 6
              ^

scala>
```

To declare a variable whose contents vary use `var`.

```bash
scala> var counter = 1
counter: Int = 1

scala> counter = 2 
counter: Int = 2

scala> 
```

Note there's no need to specify the type of variables like you would in Java or C++. In Scala we can do the same but in most cases is optional and it reduces the number of typed characters rendering the content of our code cleaner. Of course, types should always be used when we need to be more strict or make a clear point of which type `val` or `var` is storing.

```bash
scala> val greeting: String = "Hello!"
greeting: String = Hello!

scala> val Pi: Double = 31415e-4
Pi: Double = 3.1415
```
