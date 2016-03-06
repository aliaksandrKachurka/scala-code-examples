val f1: String => String => String = (s1: String) =>
  (s2: String) => s1 + s2

val f2: String => (String => String) = (s1: String) =>
  (s2: String) => s1 + s2

f1("hello")("world")
f2("hello")("world")

val ff1 = Function.uncurried(f1)

ff1("hello", "world")
