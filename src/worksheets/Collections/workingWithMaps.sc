val people = Map("dave" -> 42, "paul" -> 41)
val people3 = Map("eric" -> 22, "anne" -> 34)
val people5 = Map("paul" -> 10)

val d = people("dave") // Int: 42
val b = people.get("Brain") // None
// returns option rather than exception
val j = people.getOrElse("jill", 0) // 0

people.contains("dave") // Boolean = true
people.isDefinedAt("dave") // Boolean = true

val people2 = people + ("bill" -> 55) // Map(dave -> 42, paul -> 41, bill -> 55)

val people4 = people ++ people3

val people6 = people ++ people5
// duplicate key => final one overwrites