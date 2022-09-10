package scala.exercise.basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
    def trFact(n:Int, acc: Int = 1): Int = {
      if ( n <= 1 ) acc
      else trFact( n-1, n*acc )
    }

  val fact10 = trFact(10,2)

  println(fact10)
  def savePictures(format: String = "JPG", width: Int = 1920, height: Int = 1920): String = {
    "Pictures Details are:  Format is " + format + ", Width is " + width + " height is " + height
  }

  println(savePictures(format = "PNG"))

}
