package scala.exercise.patternMaching

object PatternsEverywhere extends App {

  try {
    // code
  } catch {
    case e: RuntimeException => "Runtime"
    case npe: NullPointerException => "npe"
    case _ => "Something else"
  }

  // catches are actually MATCHES

  val list = List(1, 2, 3, 4)
  val evenOnes = for {
    x <- list if x % 2 == 0
  } yield 10 * x

  val tuples = List((1, 2), (3, 4))
  val filterTuples = for {
    (first, second) <- tuples
  } yield first * second

  // big idea #3
  val tuple1 = (1, 2, 3)
  val (a, b, c) = tuple1
  println("Specific Value of Tuple1 is :-" + b)

  // Multiple value definitions based on PATTERN MATCHING
  // ALL THE POWER

  val head :: tail = list
  println("Head:" + head)
  println("Tail:" + tail)

  // big idea #4 - NEW
  // partial function based on PATTERN MATCHING
  val mappedList = list.map {
    case v if v % 2 == 0 => v + " is even."
    case 1 => "The One."
    case _ => "Something else."
  } //partial function literal
  val mappedList1 = list.map { x  =>
    x match {
      case v if v % 2 == 0 => v + " is even."
      case 1 => "The One."
      case _ => "Something else."
    }
  }

  println(mappedList)
  println(mappedList1)

}
