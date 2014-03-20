println("Values in Scala")
println("===============")

// Integers
val i = 9
println(s"Hello Int: $i")

// Floating point 
val f = 314e-2
println(f"Hello Double: $f%.4f")

// Characters
val c = 'A'
println(s"Hello Char: $c")

// Strings
val s = "Vladimir"
println(s"Hello String: $s")

// Symbols
val key = 'hash_key
println(s"Hello Symbol: $key")

// XML elements
val xml = <a href="http://www.retentionscience.com">RetentionScience</a>
println(s"Hello XML: $xml")

// Tuples
val t = ("Nikola Tesla", 1856, 8.854, <a href="http://en.wikipedia.com/wiki/Nikola_Tesla">Nikola Tesla</a>)
println(s"Hello Touple: $t")

// Lists
val l = List(1, 2, 3, 4)
println(s"Hello List: $l")

// Ranges 
val r1 = 1 to 5
val r2 = 1.0 to 2.0
val r3 = 'a' to 'z'
println(s"Hello Ranges: $r1 $r3")

// Maps
val m = Map('a' -> 1, 'b -> 2, 3 -> 3, "four" -> 4, 5.35 -> 5)
println(s"Hello Map: $m")
println(s"  Hello m('a'): ${m('a')}")
println(s"  Hello m('b): ${m('b)}")
println(s"  Hello m(3): ${m(3)}")
println(s"  Hello m(four): ${m("four")}")
println(s"  Hello m(5.35): ${m(5.35)}")

// Sets
val set = Set(1, 2, 3, 4, 1, 2, 3, 4)
println(s"Hello Set: $set")
println(s"  is set size 4? ${set.size == 4}")

// Arrays
val ary = Array(1, 2, 3, 4, 1, 2, 3, 4)
println(s"Hello Array: ${ary.deep}")

// Units aka void
val u = ()
println(s"Hello Unit: $u")

// Null
val n = null
println(s"Hello Null: $n")

// Nil
// anything empty, lenght == 0
// like empty string or array
val ni = Nil
println(s"Hello Nil: $ni")

// Boolean
val b = true
println(s"Hello Boolean: $b")

// Functions 
// Yes, they are values too <3
def add(x: Int = 0, y: Int = 0) = x + y
println(s"Hello Function: add(2, 3) = ${add(2, 3)}")

val multiply = (x: Int, y: Int) => { x * y }
println(s"Hello Function: $multiply => multiply(2, 5) = ${multiply(2, 5)}")
