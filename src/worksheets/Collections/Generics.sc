// lists

val lst = List(1, 2, 3)

// this is fixed, what if we want to change it

val lst2 = 0 :: lst
// remember everything is a method call, makes a new one

// generics and operators

class Holder[T](val value: T) {
  def printIt = println(value)
}

val h1 = new Holder(3)
h1.printIt

class Person
class Employee extends Person

val h2 = new Holder(new Employee)


