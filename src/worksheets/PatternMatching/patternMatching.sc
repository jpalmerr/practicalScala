val n = 2

val m = 2

n match {
  case 1 => println("It is one")
  case 2 => println("It is two")
  case _ => println("It is something else")
}
// default case => exhaustive match
// doesn't have to be a constant

val a = 4

a match {
  case 1 | 3 | 5 => println("Odd")
  case 2 | 4 | 6 => println("Even")
  case _ => println("...")
}

// a lot more we can do with matching

// can match types
def doIt(x: Any) = x match {
  case _: Int => println("Int!")
  case _: String => println("String!")
  case _ => println("Something else")
}

doIt(2)
doIt("Hello")
doIt(32.2)

def doIt2(x: Any) = x match {
  case n: Int => println(s"Its an Int, value $n")
  case s: String => println(s"Its a String, value $s")
  case default => println(s"Something else, value $default")
}

doIt2(n)
doIt2(2)
doIt2(4)
doIt2("abc")

// matching more than one value

def doIt3(a: Int, b: Int) = (a, b) match {
  case (1,1) => println("1,1")
  case (1, _) => println("1,_")
  case (_, 2) => println("_, 2")
  case (_, _) => println("default")
}

doIt3(1,4)
doIt3(3,2)