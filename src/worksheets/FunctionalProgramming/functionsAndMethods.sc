val square = (n: Int) => n * n

object Test {
  def f(n: Int) = n + n
}

// methods are always part of something else

// a method has a signature
// a function has a type

val f1 = (n: Int) => Test.f(n)
f1(2)

// better way

val f2 = Test.f _
f2(2)