package scala.exercise.functionalProgramming

object MapFlatMapFilterFor extends App{

  val list = List('A','B','C')
  val list2 = List(1,2,3)

  println("A B C is in List Class: " + list)
  println("1 2 3 is in List Class: " + list2)

  println(list.head)
  println(list.tail)

  println(list2.map( _ + 45))
  println(list2.map( _ + " Is a number? " ))

  println(list2.filter( _ % 2 == 1))

  val toPair = (x: Int) => List( x , x * 2, x / 2 )
  println(list2.map(toPair))

  val character = List('A','B','C','D')
  val numbers = List(1,2,3,4)
  val colours = List("Black","White","Blue","Red")

  val combination = numbers.flatMap( n => character.map(c => colours.map(color =>"" + c + "-" + n + "-" + color)))
  println(combination)

  list2.foreach(println)

  val forCombination = for {

    numbers <- numbers if numbers % 2 == 0
    characters <- character
    colours <- colours

  } yield "" + characters + "-" +  numbers + "-" + colours
  println(forCombination)

  for {
    n <- numbers
  } println(n)

    list2.map {
      x => x * 2
    }
}
