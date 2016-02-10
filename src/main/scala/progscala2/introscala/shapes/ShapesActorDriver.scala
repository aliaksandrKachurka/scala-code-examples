package progscala2.introscala.shapes

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

private object Start

object ShapesDrawingDriver {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("DrawingActorSystem", ConfigFactory.load())
    val drawer = system.actorOf(Props(new ShapesDrawingActor), "drawingActor")
    val driver = system.actorOf(Props(new ShapesDrawingDriver(drawer)), "drawingService")
    driver ! Start
  }
}

class ShapesDrawingDriver(drawerActor: ActorRef) extends Actor {

  import Messages._

  def receive = {
    case Start =>
      drawerActor ! Circle(Point(), 1.0)
      drawerActor ! Rectangle(Point(), 2, 5)
      drawerActor ! 3.14159
      drawerActor ! Triangle(Point(), Point(2.0, 0.0), Point(1.0, 2.0))
      drawerActor ! Exit
    case Finished =>
      println(s"ShapesDrawingDriver: cleaning up...")
      context.system.terminate()
    case response: Response =>
      println(s"ShapesDrawingDriver: Response = $response")
    case unexpected =>
      println(s"ShapesDrawingDriver: ERROR: Received an unexpected message = $unexpected")
  }
}