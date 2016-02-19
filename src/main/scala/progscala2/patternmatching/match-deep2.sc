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
    case p@Person("Sasha", _, Address(_, "Brest", _)) =>
      println(s"Hey Sasha! $p")
    case p@Person("Vlad", 13,
    Address("Orlovskaya", "Brest", "Belarus")) =>
      println(s"Hi Vlad of age ${p.age}!")
    case p@Person(name, age, _) =>
      println(s"Who are you $age year-old person named $name?")
  }
}