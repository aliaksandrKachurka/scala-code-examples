import scala.util.parsing.json.JSONObject

object Interpolators {

  implicit class jsonForStringContext(val sc: StringContext) {
    def json(values: Any*): JSONObject = {
      val keyRE = """^[\s{,]*(\S+):\s*""".r
      val keys = sc.parts.map {
        case keyRE(key) => key
        case str => str
      }
      val kvs = keys zip values
      JSONObject(kvs.toMap)
    }
  }

}

import Interpolators._

val name = "Sasha Guk"
val book = "How to drink 6L beer during one evening"

val jsonobj = json"{name: $name,s, book: $book}"
println(jsonobj)