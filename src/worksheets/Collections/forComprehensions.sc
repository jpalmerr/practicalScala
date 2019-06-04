// for comprehensions

for (i <- 1 to 5)
  println(i)

val people = Map("dave" -> 42, "paul" -> 28)

for ((name, age) <- people)
  println(age)

// can also have multiple generator elements

for ((name, age) <- people; i <- 1 to 4)
  println(age) // 42 42 42 28 28 28 28

for ((name, age) <- people; if age > 35)
  println(age) // 42

for (x <- 1 to 4; y <- 2 to 3) {
  println(x + y)
} // more concise than nested for each

val prices = List(
  List(1000, 700, 900),
  List(),
  List(500, 2100)
)

for {
  pr <- prices // each thing inside prices assign to pr
  p <- pr // each thing inside p assign to pr
  if p >= 1000
} yield p + p * 0.1

prices.flatMap(pr => pr.filter(p => p >= 1000).map(p => p + p * 0.1))