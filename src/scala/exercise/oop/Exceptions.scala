package scala.exercise.oop

object Exceptions extends App {

  val x: String = null

  println(x.length)

  val aWeirdValue: String = throw new NullPointerException

  def getInt(withException: Boolean) : Int =
    if (withException) throw new RuntimeException("No int for you!")
    else 42

  val potentialFail =  try {
    getInt(false)
  } catch {
    case e: RuntimeException => 43
  } finally {
    println("finally")
  }

  println(potentialFail)

  class MyException extends Exception
    val exception = new MyException

    throw exception
}
