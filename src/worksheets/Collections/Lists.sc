val lst = List(1, 2, 3)

val lst2 = 0 :: 1 :: 2 :: Nil

val empty = List() // type Nothing

// building lists

val lst3 = lst :+ 4

val lst4 = List(5, 6, 7)

val lst5 = lst3 ::: lst4

val lst8 = lst ::: lst

// fundamental list operators

lst.head // first element of list element, has type e.g. Int
lst.tail // everything except first, type List

// quite "expensive" operations
lst.init // all except last
lst.last // last element

// pattern matching lists

def matchList[T](lst: List[T]) = lst match {
  case List() => println("empty")
  case List(_) => println("single element")
  case List(1, _) => println("two elements, 1 is first")
  case List(_, _) => println("two elements")
}

val l = List(1, 2)
matchList(l)

def printList[T](lst: List[T]) : Unit = lst match {
  case Nil => println("done")
  case h :: t =>
    println(s"$h") // print head
    printList(t) // tail
}

printList(lst4)

// idea of recursively processing a list
// find head, do whatever you want to do to head
// do what you want to do to head


