class Ship(val x: Int, val y: Int) extends Iterable[(String, Int)] {
  def elements = new Iterator[(String, Int)] {
    private var nextVar = 'x

    def next: (string, Int) = nextVar match {
      case 'x => {
        nextVar = 'y
        ("x", x)
      }
      case 'y => {
        nextVar = 'z
        ("y", y)
      }
    }

    def hasNext: Boolean = nextVar != 'z
  }
}

val Galactica = new Ship(22, 1982)
for ((coord, value) <- Galactica) {
  println(coord + ": " + value)
}

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

    // create array
    val alphabet = Array("a", "b", "c")
    val newAlphabet: Array[String] = Array[String]("a", "b", "c")

    // create list
    val nums = List(1, 2, 3, 56)

    // will print out: 1\n2\n3\n56\n
    nums foreach println

    // creating a new list from an old one
    val moreNums = 1982 :: nums

    (myMapper((n: Int) => n + 1)(moreNums)) foreach println

    moreNums.map(n => n + 1) foreach println
    moreNums map (_ + 1) foreach println
  }

  def myMapper[A, B](f: A => B)(list: List[A]): List[B] = {
    if (list.isEmpty) {
      Nil
    } else {
      f(list.head) :: myMapper(f) (list.tail)
    }
  }
}