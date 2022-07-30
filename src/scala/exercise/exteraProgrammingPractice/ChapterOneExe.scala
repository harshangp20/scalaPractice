package scala.exercise.exteraProgrammingPractice

object ChapterOneExe extends App {

  var capital = Map("INDIA" -> "MUMBAI","FRANCE" -> "PARIS")
  capital += ("JAPAN" -> "TOKYO")

  println(capital("INDIA"))

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x -1)

  val xy = factorial(30)
  println(xy)
  val inc = (x : Int) => x + 1
  println(inc(21))

  val harshang = List('A','B','C','D','E','F','G','H','I','J','K').map((x: Char) => x + 65)
  println(harshang)

  def loopTill(cond: => Boolean) (body: => Unit): Unit = {
    if (cond) {
      loopTill(cond) (body)
    }
  }

  var i = 10

  loopTill( i > 0) {
    println(i)
    i -= 1
  }

}
