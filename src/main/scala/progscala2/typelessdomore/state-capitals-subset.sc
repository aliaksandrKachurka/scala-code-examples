val stateCapitals = Map(
  "Belarus" -> "Minsk",
  "Russia" -> "Moscow"
)

println("Get the capitals wrapped in Options:")
println("Belarus: " + stateCapitals.get("Belarus"))
println("Unknown: " + stateCapitals.get("Unknown"))

println("Get the capitals themselves out of the Options:")
println("Belarus: " + stateCapitals.get("Belarus").get)
println("Unknown: " + stateCapitals.get("Unknown").getOrElse("Oops!"))