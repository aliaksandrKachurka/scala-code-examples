val persons = Seq(("Sasha", 20), ("Vlad", 13))
val indexedPersons = persons.zipWithIndex
for (indexedPerson <- indexedPersons) {
  indexedPerson match {
    case ((name, age), index) =>
      println(s"${index + 1}) $name is $age years old")
  }
}