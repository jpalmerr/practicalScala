trait Vehicle {
  def launch
}

trait Boat extends Vehicle {
  override def launch = println("I'm a boat")
}

trait Boat2 extends Vehicle {
  override def launch = println("I'm another boat")
}

trait Plane extends Vehicle {
  override def launch = println("I'm a plane")
}

class Seaplane extends Boat with Plane {

}

val s = new Seaplane
s.launch // runs last trait

// useful for mocking

val s2 = new Seaplane with Boat2
s2.launch