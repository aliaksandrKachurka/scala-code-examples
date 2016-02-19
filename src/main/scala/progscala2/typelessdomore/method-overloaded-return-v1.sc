object StringUtilV1 {
  def joined(strings: String*): String = strings.mkString("-")

  def joined(strings: List[String]): String = joined(strings: _*)
}

println(StringUtilV1.joined(List("Programming", "Scala")))