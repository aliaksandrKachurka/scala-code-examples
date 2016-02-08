package progscala2.introscala

/**
  * Created by Aliaksandr_Kachurka on 2/8/2016.
  */
object Upper2 {
  def main(args: Array[String]) = {
    val output = args.map(_.toUpperCase()).mkString("[", ", ", "]")
    println(output)
  }
}
