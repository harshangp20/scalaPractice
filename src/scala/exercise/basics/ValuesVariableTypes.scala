package scala.exercise.basics

object ValuesVariableTypes extends App {

  val x: Int = 42
  println(x)

  val aString: String = "Hello"
  println(aString)

  val anotherString: String = "goodbye"
  println(anotherString)

  val aBoolean: Boolean = false
  println(aBoolean)

  val aChar: Char = 'H'
  println(aChar)

  val anInt: Int = x
  println(anInt)

  val aShort: Short = 4613
  println(aShort)

  val aLong: Long = 4333333333444L
  println(aLong)

  val aFloat: Float = 2.0453453443F
  println(aFloat)

  val aDouble: Double = 3.14
  println(aDouble)

  var aVariable = 4
  aVariable = 121
  aVariable += 1
  println("Variable Value is: " + aVariable)

}
