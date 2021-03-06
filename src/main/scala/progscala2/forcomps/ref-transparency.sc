def addInts(s1: String, s2: String): Int =
  s1.toInt + s2.toInt

for {
  i <- 1 to 3
  j <- 1 to i
} println(s"$i + $j = ${addInts(i.toString, j.toString)}")

def addInts2(s1: String, s2: String): Either[NumberFormatException, Int] =
try {
  Right(s1.toInt + s2.toInt)
} catch {
  case nfe: NumberFormatException => Left(nfe)
}

addInts2("1", "2")

addInts2("0", "x")

val x: String Either Int = Left("das")

x.right.map(_ + 2)