package scala.exercise.basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(number: Int): Int =
    if (number <= 1) 1

    else {
      println("Computing factorial of " + number + " - I first need factorial of " + (number - 1))
      val result = number * factorial(number - 1)
      println("Computed factorial of " + number)
      result
    }

  println(factorial(10))
  println(factorial(1000))

  def anotherFactorial(number: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(number, 1)
  }

  println(anotherFactorial(10000))

  @tailrec
  def concatenateTailrec(aString: String, number: Int, accumulator: String): String = {
    if (number <= 0) accumulator
    else concatenateTailrec(aString, number - 1, aString + accumulator)
  }

  println(concatenateTailrec("Hello Bro ", 10, "  "))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(int: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (int <= 1) true
      else isPrimeTailrec(int - 1, n % int != 0 && isStillPrime)
    }

    isPrimeTailrec(n / 2, isStillPrime = true)
  }

  println(isPrime(2003))
  println(isPrime(69))

  def fibonacci(int: Int): Int = {

    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= int) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (int <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(fibonacci(8))

}
