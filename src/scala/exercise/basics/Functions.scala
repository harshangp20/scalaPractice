package scala.exercise.basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + "" + b
  }

  println(aFunction("Hello World", 21))

  def parameterLessFunction(): Int = 42

  println(parameterLessFunction())

  def aRepeatedFunction(aString: String, double: Double): String = {

    if (double == 1) aString else aString + aRepeatedFunction(aString, double - 1)
  }

  println(aRepeatedFunction("Harshang ", 1))
}
