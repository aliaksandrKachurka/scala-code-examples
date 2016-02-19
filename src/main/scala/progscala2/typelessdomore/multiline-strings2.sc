def goodbye(name: String) =
  s"""xxxGoodbye, ${name}yyy
xxxCome again!yyy""".stripMargin.stripPrefix("xxx").stripSuffix("yyy")

goodbye("Alex")