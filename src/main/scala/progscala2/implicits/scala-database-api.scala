// A Scala wrapper for the Java-like Database API
package progscala2.implicits

object implicits {

  import javadb.JRow

  implicit class SRow(jrow: JRow) {
    def get[T](colName: String)(implicit toT: (JRow, String) => T): T =
      toT(jrow, colName)
  }

  implicit val jrowToInt: (JRow, String) => Int =
    (jrow, colName) => jrow.getInt(colName)

  implicit val jrowToDouble: (JRow, String) => Double =
    (jrow, colName) => jrow.getDouble(colName)

  implicit val jrowToString: (JRow, String) => String =
    (jrow, colName) => jrow.getText(colName)
}

object DB {

  import implicits._

  def main(args: Array[String]) = {
    val row = javadb.JRow("один" -> 1, "два" -> 2.2, "три" -> "THREE!")

    val oneValue1: Int = row.get("один")
    val twoValue1: Double = row.get("два")
    val threeValue1: String = row.get("три")

    println(s"один1 -> $oneValue1")
    println(s"два1  -> $twoValue1")
    println(s"три1  -> $threeValue1")

    val oneValue2 = row.get[Int]("один")
    val twoValue2 = row.get[Double]("два")
    val threeValue2 = row.get[String]("три")

    println(s"один2 -> $oneValue2")
    println(s"два2  -> $twoValue2")
    println(s"три2  -> $threeValue2")
  }
}