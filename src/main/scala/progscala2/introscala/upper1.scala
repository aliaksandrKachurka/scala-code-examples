package progscala2.introscala

/**
  * Created by Aliaksandr_Kachurka on 2/8/2016.
  */
object Upper {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println("")
  }
}