sealed abstract class HttpMethod() {
  def body: String

  def bodyLength = body.length
}

case class Get(body: String) extends HttpMethod

case class Post(body: String) extends HttpMethod

def handle(method: HttpMethod) = method match {
  case Get(body) => s"get:  (length: ${method.body.length}) $body"
  case Post(body) => s"post: (length: ${method.body.length}) $body"
}

val methods = Seq(Get("get body..."), Post("post body..."))

methods foreach (method => println(handle(method)))