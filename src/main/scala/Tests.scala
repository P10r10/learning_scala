object Tests extends App {
  println(Circle.calculateArea(1.5))
  val oneHalf = new Rational(1, 2)
  val twoFifths = new Rational(2, 5)
  println(oneHalf add twoFifths)
  println(twoFifths.denom)
  println(twoFifths lessThan oneHalf)
  println(oneHalf max twoFifths)
  println(new Rational(66, 42))
  println(oneHalf + 1)
  println(1 + twoFifths)
  println(twoFifths equals oneHalf)
  println(twoFifths equals new Rational(2, 5))
  println(new Rational(1, 2) equals oneHalf)
}
