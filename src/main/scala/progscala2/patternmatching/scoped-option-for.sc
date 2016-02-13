val names = Seq(Some("Sasha"), None, Some("Dasha"))

println("second pass:")
for {
  Some(name) <- names
  upcasedName <- name.toUpperCase()
} println(upcasedName)