case class With[A, B](a: A, b: B)

val with1: String With Int = With("foo", 1)
Seq(with1, With("bar", 2)) foreach { w =>
  w match {
    case s With i => println(s"$s with $i")
    case _ => println(s"Unknown: $w")
  }
}