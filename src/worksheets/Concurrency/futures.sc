// Note: can't really get futures to work in the worksheet
// this is for syntax and theory

// creating futures

// creating futures

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global // told in error

val f1 = Future { Thread.sleep(1000);50}
Thread.sleep(2000) //using for worksheet purposes

// working with futures

f1.foreach(n => println(n))

val f2 = Future { Thread.sleep(1000);3/0}
Thread.sleep(1000)
f2.foreach(n => println(n))

val ff = f2.failed
Thread.sleep(1000)
ff.foreach(n => println(n))

// functional futures

val f3 = f1.map(n => n*2) // we get back another future
Thread.sleep(1000)

f3.value

val f4 = f1.filter(n => n>20)
Thread.sleep(1000)
f4.value

// futures and promises

import scala.concurrent._

val p1 = Promise[Int]
Thread.sleep(1000)
// a promise represent a place to hold value
// once it's been created

val p2 = Promise[Int]
Thread.sleep(1000)

val pf1 = p1.future
Thread.sleep(1000)

val pf2 = p2.future
Thread.sleep(1000)

val result = for {
  a <- pf1
  b <- pf2
} yield a+b
result.value // none
// neither promise has their value yet

p1.success(3)
p2.success(4)

result.value

