package scala.exercise.functionalProgramming

import scala.util.Random

object Sequences extends App {

  //Sequence
  val aSequence = Seq(55, 49, 37, 121, 99)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(3))
  println(aSequence ++ Seq("Harshang", "Prajapati"))
  println(aSequence.sorted)

  // Range

  val aRange: Seq[Int] = 0 until 10
  aRange.foreach(println)

  //  (1 to 10).foreach( x => println("Hello" + " My Name is Harshang."))

  val aList = List(1, 2, 3)
  val prepended = 42 +: aList :+ 89
  println(prepended)

  val apples5 = List.fill(10)("Apple")
  println(apples5)

  println(aList.mkString("-|-"))

  //Arrays
  val numbers = Array(1, 2, 3, 4)
  numbers.foreach(println)
  val threeElements = Array.ofDim[String](3)
  threeElements.foreach(println)

  // mutation
  numbers(2) = 0
  println(numbers.mkString(" "))
  numbers.foreach(println)

  // arrays and seq
  val numbersSeq: Seq[Int] = numbers
  println(numbersSeq)

  // vectors
  // On hold due to some issue
  /*val vector: Vector[Int] = vector(1,2,3)
  println(vector)*/

  val maxRuns = 1000
  val maxCapacity = 1000000

  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random
    val times = for {
      _ <- 1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), r.nextInt())
      System.nanoTime() - currentTime
    }
    r.nextDouble()
    times.sum * 1.0 / maxRuns
  }
  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector

  // keeps reference to tail
  // updating an element in the middle takes long
  println(getWriteTime(numbersList))
  //   depth of the tree is small
  //  needs to replace an entire 32-element
  println(getWriteTime(numbersVector))

}
