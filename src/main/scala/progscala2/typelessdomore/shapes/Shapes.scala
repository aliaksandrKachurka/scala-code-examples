package progscala2.typelessdomore.shapes

case class Point(x: Double = 0.0, y: Double = 0.0) {
  def shift(deltaX: Double = 0.0, deltaY: Double = 0.0) =
    copy(x + deltaX, y + deltaY)
}

abstract class Shape() {
  def draw(offset: Point = Point())(f: String => Unit): Unit =
    f(s"draw(offset = $offset), ${this.toString}")
}

case class Circle(center: Point, radius: Double) extends Shape

case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape