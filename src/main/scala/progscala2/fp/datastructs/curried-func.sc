def cat1(s1: String)(s2: String) = s1 + s2

val hello = cat1("Hello ") _

hello("World!")
cat1("Hello ")("World!")