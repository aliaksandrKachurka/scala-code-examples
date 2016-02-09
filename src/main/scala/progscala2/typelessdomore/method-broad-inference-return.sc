def makeList(strings: String*) = {
  if (strings.isEmpty)
    Nil
  else
    strings.toList
}

val list: List[String] = makeList()