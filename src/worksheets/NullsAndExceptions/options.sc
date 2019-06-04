case class User(name: String, city: Option[String])

val user1 = User("James", Some("London"))
val user2 = User("Adam", None)

user1.city.get // London
// user2.city.get // throws exception
// one of the problems with get

// =>

user2.city.getOrElse("No city given")

// an example of destructuring

def getCity(u: User) = u.city match {
  case Some(c) => c
  case None => "No city given"
}

getCity(user1)
getCity(user2)

// option and flatmap

val users = List(
  User("jil", Some("Edinburgh")),
  User("dave", None),
  User("paul", Some("Shanghai")),
  User("marie", None)
)

val cities = users.map(x => x.city) // some none some none

val theCities = users.flatMap(x => x.city) // Edinburgh, Shanghai