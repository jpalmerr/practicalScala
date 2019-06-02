// default arguments

def foo(a: Int= 0, b: String = "abc", c: Int = 10 ) = {
  println(s"a: $a, b: $b, c: $c")
}

foo()
foo(1,"Hello", 2)
foo(3, "Hello")
// types must match though

// variable arguments

def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}

sum(1,2,3)
sum(1,2,3,4)
sum(1 to 10 : _*)