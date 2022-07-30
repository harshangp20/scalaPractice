package scala.exercise.basics

object Expressions extends App {

  /* val x = 1+2
  println(x)

  println(2 + 3 * 8)

  println(1 < x)

  var aVariable = 2
  aVariable += 6
  println(aVariable)

  val aCondition = true
  val aConditionValue = if(!aCondition) 5 else 3
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0

  println()

  while (i <= 10) {

    println("Values of I is: " + i)
    i += 1

  }

  val aWeirdValue: Unit = aVariable = 3
  println(aWeirdValue) */

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 5) "Hello" else "Byyyyy"

  }

  println(aCodeBlock)

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {

    if (someValue) 239 else 986
    42
  }

  println(someOtherValue)

}
