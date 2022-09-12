package scala.exercise.oop

import scala.language.postfixOps

object MethodNotation extends App {

  val harshang = new Person("Harshang", "Avengers:EndGame")
  val manthan = new Person("Manthan", "Marvel`s Guardian of the Galaxy")

  println(harshang.likes("Avengers:EndGame"))
  println(harshang likes "Avengers:EndGame")

  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickName: String): Person = new Person(s"$name ($nickName)", favouriteMovie)

    def unary_! : String = s"$name, what the hack?!"

    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and i like $favouriteMovie movie"

    def apply(n: Int): String = s"$name watched $favouriteMovie $n times "

    def learnsScala: String = this learns "scala"

    def learns(thing: String) = s"$name is learning $thing"
  }

  println(harshang + manthan)
  println(harshang.+(manthan))

  println(1 + 2)
  println(1.+(2))

  println(!harshang)
  println(!harshang)
  println(harshang.isAlive)
  println(harshang isAlive)

  println(harshang.apply())
  println(harshang())
  println(harshang apply())

  println((harshang + "DYNAMIC|HPS") apply())
  println()
  println(harshang(10))
  println()
  println(harshang.learnsScala)
}
