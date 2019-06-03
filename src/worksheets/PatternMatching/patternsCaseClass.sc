import java.time.LocalDateTime

case class Cashflow(amount: Double, currency: String, due: LocalDateTime)

val c1 = Cashflow(3000.0, "GBP", LocalDateTime.now)

// destructuring match

c1 match {
  case Cashflow(v, "USD", _) => println("US cashflow")
  case Cashflow(v, "GBP", _) => println(s"UK cashflow: $v ")
  case _ => println("different cashflow")
}


// another example

case class Address(city: String, country: String)
case class Person(name: String, age: Int, address: Address)

val a1 = Address("London", "UK")
val a2 = Address("New York", "USA")

val p1 = Person("Fred", 41, a1)
val p2 = Person("Jane", 32, a2)

p1 match {
  case Person(n, _, Address("London", _)) => println(s"$n lives in London")
}

// Using guards => set restrictions

val p3 = Person("fred", 21, a1)

p3 match {
  case Person(n, a, _) if a > 30 => println(s"$n is older than 30")
  case Person(n, a, _) if a <= 30 => println(s"$n is younger than 30")
}