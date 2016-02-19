def doSeqMatch[T](seq: Seq[T]): String = seq match {
  case Nil => "Nothing"
  case head +: _ => head match {
    case _: Double => "Double"
    case _: String => "String"
    case _ => "Unmatched seq element"
  }
}

for (x <- Seq(List("Sasha", "Tanya"), List(2.5, 4.2), Nil)) yield {
  x match {
    case seq: Seq[_] => (s"seq ${doSeqMatch(seq)}", seq)
    case _ => ("Unknown", x)
  }
}