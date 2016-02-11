class ServiceImportante(name: String) {
  def work(i: Int): Int = {
    println(s"ServiceImportante: Doint important work! $i")
    i + 1
  }
}

val service1 = new ServiceImportante("uno")
(1 to 3) foreach (i => println(s"Result: ${service1.work(i)}"))

trait Logging {
  def info(message: String)

  def warning(message: String)

  def error(message: String)
}

trait StdoutLogging extends Logging {
  def info(message: String) = println(s"INFO:    $message")

  def warning(message: String) = println(s"WARNING: $message")

  def error(message: String) = println(s"ERROR:   $message")
}

val service2 = new ServiceImportante("dos") with StdoutLogging {
  override def work(i: Int): Int = {
    info("Starting work: i = $i")
    val result = super.work(i)
    info(s"Ending work: i = $i, result = $result")
    result
  }
}

(1 to 3) foreach (i => println(s"Result: ${service2.work(i)}"))

class LoggedServiceImportante(name: String)
  extends ServiceImportante(name) with StdoutLogging {
  override def work(i: Int): Int = {
    info("Starting work: i = $i")
    val result = super.work(i)
    info(s"Ending work: i = $i, result = $result")
    result
  }
}