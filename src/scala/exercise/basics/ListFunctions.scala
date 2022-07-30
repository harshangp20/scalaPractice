package scala.exercise.basics

object ListFunctions extends App {

  def aGreetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println(aGreetingFunction("Harshang", 18))

  def aFactorialFunction(number: Int): Int =
    if (number <= 0) 1
    else number * aFactorialFunction(number - 1)

  println(aFactorialFunction(5))

  def fibonacci(number: Int): Int = {
    if (number <= 2) 1
    else
      fibonacci(number - 1) + fibonacci(number - 2)
  }

  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {


    @scala.annotation.tailrec
    def isPrimeUntil(t: Int): Boolean = {

      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(10))
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

}
