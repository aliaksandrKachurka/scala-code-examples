val stateCapitals = Map(
  "Alabama" -> "Montgomery",
  "Alaska" -> "Juneau",
  "Wyoming" -> "Cheyenne"
)

val length = stateCapitals map {
  entry => (entry._1, entry._2.length)
}

val caps = stateCapitals map {
  case (k, v) => (k, v.length)
}

val stateCapitals2 = stateCapitals + ("Virginia" -> "Richmond")

val stateCapitals3 = stateCapitals2 +(
  "New York" -> "Albany",
  "Illinois" -> "Springfield")

stateCapitals3 - "New York"