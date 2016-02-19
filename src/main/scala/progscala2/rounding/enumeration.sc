object Name extends Enumeration {
  type Name = Value
  val sasha = Value("Sasha")
  val dima = Value("Dima")
  val vlad = Value("Vlad")
}

println("ID\tname")
for (name <- Name.values) {
  println(s"${name.id}\t$name")
}

println("\nEnds with 'a':")
Name.values filter (_.toString.endsWith("a")) foreach println

import Name._

def startsWithS(name: Name) = name.toString.toLowerCase.startsWith("s")
println("\nStarts with 'S' or 's'")
Name.values filter startsWithS foreach println