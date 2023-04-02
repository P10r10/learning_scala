class Rational(n: Int, d: Int) {
  //  println(s"Created $n/$d")
  require(d != 0, "A denominator cannot be zero!")
  val numer: Int = n
  val denom: Int = d
  override def toString: String = n + "/" + d

  def add(that: Rational): Rational =
    new Rational(numer * that.denom + d * that.numer, denom * that.denom)
}
