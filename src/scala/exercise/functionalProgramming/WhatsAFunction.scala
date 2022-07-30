package scala.exercise.functionalProgramming

object WhatsAFunction extends App {

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  val stringToIntConverter = new (String => Int) {
    override def apply(string: String): Int = string.toInt
  }

  val adder:  (Int, Int) => Int = new ((Int, Int) => Int) {
    override def apply(a: Int, b: Int): Int = a + b
  }

  val concatenator: (String, String) => String = new ((String, String) => String) {
    override def apply(a: String, b: String): String = a + b
  }

  val superAdder: Int => Int => Int = new Function[Int, Int => Int] {
    override def apply(x: Int): Int => Int = new Function[Int, Int] {
      override def apply(y: Int): Int  = x + y
    }
  }

  println(doubler(100))
  println(stringToIntConverter("100") + 4)
  println(adder(200,200))
  println(concatenator("Hello, From ","Harshang"))

  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(7))
}

trait MyFunction[A, B] {
  def apply(element: A): B
}
