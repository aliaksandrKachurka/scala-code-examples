val nonEmptyList = List(1, 2, 3, 4, 5)
val nonEmptyVector = Vector(1, 2, 3, 4, 5)
val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)


def windows[T](seq: Seq[T]): String = seq match {
  case Seq(head1, head2, _*) =>
    s"($head1, $head2), " + windows(seq.tail)
  case Seq(head, _*) =>
    s"($head, )" + windows(seq.tail)
  case Nil => " Nil"
}

for (seq <- Seq(nonEmptyList, nonEmptyMap.toSeq, nonEmptyVector)) {
  println(windows(seq))
}