object Op extends Enumeration {
  type Op = Value
  val EQ = Value("=")
  val NE = Value("!=")
}

import Op._

// Represents an SQL "WHERE x op value" clause, where +op+ is a
// comparison operator
case class WhereOp[T](columnName: String, op: Op, value: T)

// Represents an SQL "WHERE x IN (a, b, c) clause"
case class WhereIn[T](columnName: String, val1: T, vals: T*)


val wheres = Seq(
  WhereIn("state", "IL", "CA", "VA"),
  WhereOp("state", EQ, "IL")
)

for (where <- wheres) {
  where match {
    case WhereIn(col, val1, vals@_*) =>
      val valStr = (val1 +: vals).mkString(", ")
      println(s"WHERE $col in ($valStr)")
    case WhereOp(col, op, value) =>
      println(s"WHERE $col $op $value")
    case _ => println(s"ERROR: Unknown expresion: $where")
  }
}