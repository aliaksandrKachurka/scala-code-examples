val names = List(Some("Sasha"), Some("Dima"), None, Some("John"), None)

println("first pass:")

for {
  nameOption <- names
  name <- nameOption
  upcasedName = name.toUpperCase
} println(upcasedName)

println("second pass:")

for {
  Some(name) <- names
  upcasedName = name.toUpperCase()
} println(upcasedName)