val s = "1a23"

try {
  val n = s.toInt
}
catch {
  case ex: NumberFormatException => println(ex.getMessage)
}

// exactly the same as a partial function ...

// if you find yourself having to handle an exception
// put this inside a function
// catch exception
// figure out what to do with it

// Try[T]

// a bit like an option, try execute code that might fail
// could use option but with a None we have no idea what didn't work

import scala.util.{Try, Success, Failure}

val p = "123"
val q = "1a23"

val v1 = Try {p.toInt} // Success(123)

val v2 = Try {q.toInt} // Failure(java.lang.NumberFormatException: For input string: "1a23")

v1 match {
  case Success(value) => println(value)
  case Failure(ex) => println(ex.getMessage)
}

val s1 = "123"
val s2 = "456"

val result = for {
  n <- Try{s1.toInt}
  n <- Try{s2.toInt}
} yield n + n

// if hits a failure just aborts processing