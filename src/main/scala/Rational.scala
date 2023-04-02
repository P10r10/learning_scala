import javax.print.attribute.standard.MediaSize.Other
import scala.annotation.tailrec
//import scala.language.implicitConversions

class Rational(n: Int, d: Int) {
  require(d != 0, "A denominator cannot be zero!")
  private val g: Int = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor

  @tailrec
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  override def toString: String = numer + "/" + denom

  def add(other: Rational): Rational =
    new Rational(numer * other.denom + denom * other.numer, denom * other.denom)

  def lessThan(other: Rational): Boolean =
    this.numer * other.denom < this.denom * other.numer

  def max(other: Rational): Rational =
    if (this lessThan other) other else this

  def +(i: Int): Rational = new Rational(numer + i * denom, denom)

  def canEqual(other: Any): Boolean = other.isInstanceOf[Rational]

  override def equals(other: Any): Boolean = other match {
    case that: Rational => (that canEqual this) &&
      numer == that.numer &&
      denom == that.denom
    case _ => false

  }

}
