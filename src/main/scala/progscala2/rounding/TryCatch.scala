package progscala2.rounding

import scala.io.Source
import scala.util.control.NonFatal

object TryCatch {
  def main(args: Array[String]) = {
    args foreach (arg => countLines(arg))
  }

  def countLines(fileName: String) = {
    println() // Add a blank line for legibility
    var source: Option[Source] = None
    try {
      source = Some(Source.fromFile(fileName))
      val size = source.get.getLines().size
      println(s"filename $fileName has $size lines")
    } catch {
      case NonFatal(ex) => println(s"Non fatal exception! $ex")
    } finally {
      for (s <- source) {
        println(s"Closing $fileName")
        s.close()
      }
    }
  }
}
