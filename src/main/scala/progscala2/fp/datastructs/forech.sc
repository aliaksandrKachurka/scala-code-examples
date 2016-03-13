List(1, 2, 3, 4, 5) foreach (i => println(i))

val stateCapitals = Map(
  "Alabama" -> "Montgomery",
  "Alaska" -> "Juneau",
  "Wyoming" -> "Cheyenne"
)

// stateCapitals foreach { kv => println(s"${kv._1}: ${kv._2}") }

stateCapitals foreach {
  case (k, v) => println(s"$k: $v")
}