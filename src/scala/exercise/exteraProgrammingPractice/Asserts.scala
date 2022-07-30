package scala.exercise.exteraProgrammingPractice

object Asserts extends App {
  val someValue: Option[String] = Some("I am wrapped in something")
  println(someValue)
  val emptyValue: Option[String] = None
  println(emptyValue)

  val number: Option[Int] = Some(3)
  val noNumber: Option[Int] = None
  val result1 = number.map(_ * 1.5)
  val result2 = noNumber.map(_ * 1.5)

  println("result1 " + result1)
  println("result2 " + result2)
}