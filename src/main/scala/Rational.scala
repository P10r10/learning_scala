class Rational(val numer: Int, val denom: Int) {
  require(denom != 0, "A denominator cannot be zero!")

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString: String = numer + "/" + denom

  def add(other: Rational): Rational =
    new Rational(numer * other.denom + denom * other.numer, denom * other.denom)

  def lessThan(other: Rational): Boolean =
    this.numer * other.denom < this.denom * other.numer

  def max(other: Rational): Rational =
    if (this lessThan other) other else this
}
