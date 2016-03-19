import progscala2.basicoop.{Address, Person3}

val a1 = new Address("1 Scala Lane", "Anytown", "CA", "98765")
val a2 = new Address("98765")

Person3("Buck Trends1")
Person3("Buck Trends2", Some(20), Some(a1))
Person3("Buck Trends3", 20, a1)
Person3("Buck Trends4", Some(20))
Person3("Buck Trends5", 20)
Person3("Buck Trends6", address = Some(a2))
Person3("Buck Trends7", address = a2)