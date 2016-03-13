val list = List("now", "is", "", "the", "time")

list flatMap (s => s.toString)

val list2 = List("now", "is", "", "the", "time") map (_.toList)

list2 flatten

