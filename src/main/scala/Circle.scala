import scala.math.Pi
import scala.math.pow

class Circle(val radius: Double) {
  def area: Double = Circle.calculateArea(radius)
}

object Circle {
  def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
}
