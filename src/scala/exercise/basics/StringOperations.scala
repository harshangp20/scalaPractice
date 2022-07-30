package scala.exercise.basics

object StringOperations extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(7))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.length)

  val aNumberString = "2"
  println(aNumberString)
  val aNumber = aNumberString.toInt
  println(aNumber)

  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  val name = "Harshang"
  val age = 18
  val greeting = s"Hello, my name is $name and I am $age years old."
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."

  println(greeting)
  println(anotherGreeting)

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute."
  println(myth)

  println(raw"This is a \n newline")
  val escaped = "This is a \n \t newline"
  println(raw"$escaped")

}
