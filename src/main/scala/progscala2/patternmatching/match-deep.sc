case class Address(street: String, city: String, country: String)

case class Person(name: String, age: Int, address: Address)

val alice = Person("Sasha", 20,
  Address("Orlovskaya", "Brest", "Belarus"))

val vlad = Person("Vlad", 13,
  Address("Orlovskaya", "Brest", "Belarus"))

val john = Person("John", 19,
  Address("Oxford", "London", "UK"))

for (person <- Seq(alice, vlad, john)) {
  person match {
    case Person("Sasha", _, Address(_, "Brest", _)) =>
      println("Hey Sasha!")
    case Person("Vlad", 13,
    Address("Orlovskaya", "Brest", "Belarus")) =>
      println("Hi Vlad!")
    case Person(name, age, _) =>
      println(s"Who are you $age year-old person named $name?")
  }
}