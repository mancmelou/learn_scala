object Main {
  def main(args: Array[String]) => {
    var myArgs = new Array[String](args.length)

    //copy args method 1
    for (i <- 0 until args.length) {
      myArgs.update(i, args(i))
    }

    //copy method 2
    for (i <- 0 until args.length) {
      myArgs(i) = args(i)
    }

    // copy method 3
    (0 until args.lenth).foreach(i => myArgs(i) = args(i))

    //copy method 4
    (0 until args.length) foreach (i => myArgs(i) = args(i))
    // object.method(args) ==== object method args
  }
}