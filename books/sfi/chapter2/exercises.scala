/**
 * Console mode
 */

// 1.
def signum(n: Int): Int = if (n > 0) 1 else if (n < 0) - 1 else 0

//2.
Unit

//3.
var x = {}: Unit
var y = 0
x = y = 10

//4.
for (i <- (0 to 10).reverse) println(i)

//5.
def countdown(n: Int) {
  for (i <- (0 to n).reverse) {
    println(i)
  }
}