val nonEmptyList = List(1, 2, 3, 4, 5)
val nonEmptyVector = Vector(1, 2, 3, 4, 5)
val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)

def reversedSeqToString[T](s: Seq[T]): String = s match {
  case Nil => "Nil"
  case prefix :+ end => reversedSeqToString(prefix) + s":+ $end"
}

for (seq <- Seq(nonEmptyList, nonEmptyMap.toSeq, nonEmptyVector)) {
  println(reversedSeqToString(seq))
}