package scala.exercise.functionalProgramming

import scala.annotation.tailrec

object HOFsCCurries extends App {

  val superFunction: (Int, (String, Int => Boolean) => Int) => Int => Int = null

  @tailrec
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
  if (n <= 0) x
  else nTimes(f, n-1, f(x))

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 21))

  def nTimesBetter(f: Int => Int, n: Int): Int => Int =
    if (n <= 0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n-1) (f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))

  val superAdder: Int => Int => Int = (x: Int) => (y: Int) => x + y
  val add3 = superAdder(3)
  println(add3(10))
  println(superAdder(3)(10))

  def curriedFormatter (c: String) (x: Double) : String = c.format(x)

  val standardFormat: Double => String= curriedFormatter("%4.2f")
  val preciseFormat: Double => String = curriedFormatter("%10.10f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))

  def toCurry(f: (Int, Int) => Int): Int => Int => Int =
    x => y => f(x, y)

  def fromCurry(f: Int => Int => Int): (Int, Int) => Int =
    (x, y) => f(x)(y)

  def compose[A, B, T](f: A => B, g: T => A): T => B =
    x => f(g(x))

  def andThen[A, B, C](f: A => B, g: B => C): A => C =
    x => g(f(x))

  def superAdder2: Int => Int => Int = toCurry( _ + _ )

  def add4 = superAdder2(177)
  println(add4(17))

  def toCurry1(f: (String, String) => String): String => String => String =
    x => y => f(x, y)

  def fromCurry1(f:String => String => String): (String, String) => String =
    (x, y) => f(x)(y)

  def compose1[A, B, T](f: A => B, g: T => A): T => B =
    x => f(g(x))

  def andThen1[A, B, C](f: A => B, g: B => C): A => C =
    x => g(f(x))

  def superStringAdder: String => String => String = toCurry1(_ + _)

  val stringAdder = superStringAdder("Hello,")
  println(stringAdder("Harshang"))

  val simpleAdder = fromCurry(superAdder)
  println(simpleAdder(4,17))

  val add2 = (x: Int) => x + 2
  val times3 = (x: Int) => x * 3

  val composed = compose(add2,times3)
  val ordered = andThen(add2, times3)

  println("testing " + composed(4))
  println("Testing2: " + ordered(4))

}
