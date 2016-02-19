val names = List("Alex", "Alexander", "Yuri", "Alexey")

val filteredBreeds = for {
  name <- names
  if name contains "Alex"
  if !name.contains("ander")
} yield name