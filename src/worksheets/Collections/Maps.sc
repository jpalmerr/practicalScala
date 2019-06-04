val lst = List(1, 2, 3, 4)

lst.filter(n => n%2 == 0)

lst.map( n => n + 2)
lst.map(_ + 2)

val people = List(
  List("dave", "paul"),
  List(),
  List("jane"),
  List("liz", "bill")
)

people.flatten // List(dave, paul, jane, liz, bill)

people.flatten.map(s => s.capitalize) // Dave, Paul, Jane, Liz, Bill
people.flatMap(c => c.map(s => s.capitalize)) // Dave, Paul, Jane, Liz, Bill
people.flatMap((_.map(_.capitalize))) // Dave, Paul, Jane, Liz, Bill

// using collect

val strings = List("ab", 1, "ef")

val caps = strings.collect(
  { case s: String => s.capitalize}
)
// collect: if it works do it if it doesn't ignore it
// preferred to partial function

// using Fold

// val lst = List(1, 2, 3, 4)

val result1a = lst.foldLeft(0)(
  (acc, nxt) => acc + nxt
  )

val result1b = lst.sum

val result2a = lst.foldLeft(1)(
  (acc, nxt) => acc * nxt
)

val result2b = lst.product

val str = List("ab", "cd", "de")

val s = str.foldLeft("")(
  (a, b) => a + b
)

// reduce
val result1c = lst.reduce((a, b) => a + b)
val result1d = lst.reduce(_+_) // first argument + second argument

// folding examples

def contains[A](lst: List[A], item: A) =
  lst.foldLeft(false)((a, b) => a || b == item)

// if my list contains item => true
// if my list doesn't contain item => false

contains(lst, 2) // true
contains(lst, 12) // false

def reverse[A](lst: List[A]): List[A] =
lst.foldLeft(List[A]())((a, b) => b :: a)

// (start with empty array type A)(method...)

reverse(lst) // List(4, 3, 2, 1)

// obiously more efficient ways but the concept holds

