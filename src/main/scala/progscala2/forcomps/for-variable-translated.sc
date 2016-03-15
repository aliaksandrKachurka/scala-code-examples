val map = Map("one" -> 1, "two" -> 2)

val list = for {
  (key, value) <- map
  i10 = value + 10 // How is this line and the next translated?
} yield i10

// Translation:
val list2 = for {
  (i, i10) <- for {
    x1@(key, value) <- map
  } yield {
    val x2@i10 = value + 10
    (x1, x2)
  }
} yield i10