import scala.annotation.tailrec

def fact(n: Int) :Int = {
  if (n == 0) 1
  else n * fact(n-1)
}

fact(3)

def fact2(n: Int) :Int = n match {
  case 0 => 1
  case m => m * fact2(m-1)
}

fact2(3)

// normal recursion can blow stack
// => tail recursion
// make it into a loop essentially

@tailrec def tailFact(n: Int, acc: Int = 1) :Int = n match {
  case 0 => acc
  case m => tailFact(m-1, m * acc)

}

tailFact(3)
 // or wrap it

def factorial(n: Int) :Int = {
  @tailrec def factorial1(n: Int, acc: Int) : Int = n match {
    case 0 => acc
    case m => factorial1(m - 1, m * acc)
  }

  factorial1(n, 1)
}

factorial(3)

// annotation is there for "user believes function is tail recursive".
// If somebody else comes and changes it to non tail rec, if it has tailrec annotation
// compiler will complain