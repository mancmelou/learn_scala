// traditional while
def main(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}


// traditional for loop
def main(args: Array[String]): Unit = {
  for (i <- 0 until args.length) {
    println(args(i))
  }
}


// iterator base loop
def main(args: Array[String]): Unit = {
  for (arg <- args) {
    println(arg)
  }
}


// functional style
def main(args: Array[String]): Unit = {
  args.foreach((arg: String) => prinln(arg))
}


// functional style; args type inferred
def main(args: Array[String]): Unit = {
  args.foreach(arg => prinln(arg))
}


// functional style; no args anonymous function
def main(args: Array[String]): Unit = {
  args.foreach(prinln(_))
}


// functional style; curried function
def main(args: Array[String]): Unit = {
  args.foreach(prinln _)
}


// functional style; with a function as the argument
def main(args: Array[String]): Unit = {
  args.foreach(prinln)
}


// functional style; infix method call invocation
def main(args: Array[String]): Unit = {
  args foreach prinln
}