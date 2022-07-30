package scala.exercise.oop

object ExceptionExercise extends App {

  // 1. Out Of Memory Exception
  //  val array = Array.ofDim(Int.MaxValue)

  //  2. StackOverFlowError
  //  def infinite: Int = 1 + infinite
  //  val noLimit = infinite
  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MAthCalculationException extends RuntimeException("Division by 0")

  object PocketCalculator {

    def add(x: Int, y: Int): Int = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }

    def sub(x: Int , y: Int ): Int = {

      val result = x - y
      if (x > 0 && y < 0 && result < 0) throw new OverflowException
      else if ( x < 0 && y > 0 && result > 0 ) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int): Int = {
      val result = x * y
      if ( x < 0 && y < 0 && result < 0 ) throw new OverflowException
      else if (x > 0 && y < 0 && result > 0) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0) throw new OverflowException
      else result
    }

    def divide( x: Int , y: Int ): Int = {
      if (y == 0) throw  new MAthCalculationException
      else x / y
    }

  }
//  println(Int.MaxValue)
//  println(PocketCalculator.add(Int.MaxValue - 121, 121))
  println(PocketCalculator.divide(2 ,0))

}
