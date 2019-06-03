// partial functions

def f(n: Int) = n match {
  case 1 => "one"
  case 2 => "two"
}

val p:PartialFunction[Int, String] = {
  case 1 => "one"
  case 2 => "two"
}

// partial function very similar to map when you think
// about it in abstraction

