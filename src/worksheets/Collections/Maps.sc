val people = List(
  List("dave", "paul"),
  List(),
  List("jane"),
  List("liz", "bill")
)

people.flatten // List(dave, paul, jane, liz, bill)
people.flatMap(_.reverse) // List(paul, dave, jane, bill, liz)

val lst = List(1, 2, 3, 4)

lst.filter(n => n%2 == 0)

lst.map( n => n + 2)
lst.map(_ + 2)
