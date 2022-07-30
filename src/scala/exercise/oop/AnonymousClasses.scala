package scala.exercise.oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat(): Unit
  }
/*
class AnonymousClasses$$anon$1 extends Animal {
    override def eat(): Unit = println("ahahahahahah")
  }

*/

  val funnyAnimal: Animal = new Animal {
    override def eat(): Unit = println("ahahahahahah")
  }

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can i help?")
  }

  val jim = new Person("Harshang") {
    override def sayHi: Unit = println(s"Hi, my name is harshang, how can i be of service?")
  }
}
