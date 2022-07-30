package scala.exercise.functionalProgramming

object AnonymousFunctions extends App {

  val doubler : Int => Int = (x : Int) => x * 2
//  println(doubler(7))

  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b
//  println(adder(7,5))

  val justDoSomething: () => Int = () => 3
//  println(justDoSomething)
//  println(justDoSomething())

  val stringToInt = (str: Char) => {
    str.toInt
  }

//  println(stringToInt('H'))

  val niceIncrementer: Int => Int = _ * 9
  println(niceIncrementer(6))

  val niceAdder: (Int, Int) => Int = _ + _
  println(niceAdder(121,1222 ))

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(121)(345))

}
