import java.time.LocalDateTime

class Pet {
  def feed() = {
    "Feeding at: " + LocalDateTime.now()
  }
}

class Cat extends Pet {
  def hunt() = {
    println("The cat hunts")
  }
}

val c = new Cat
println(c.feed())

class Dog extends Pet {
  override def feed() = {
    "Dog eating..."
  }
  // can also override val feed
}

val d = new Dog
println(d.feed())