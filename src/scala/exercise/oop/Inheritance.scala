package scala.exercise.oop

object Inheritance extends App {


  val cat = new Cat
  val dog = new Dog("Kar9")
  val unknownAnimal: Animal = new Dog("K9")
  cat.crunch()

  class Animal {
    val creatureType = "Wild"

    def eat(): Unit = println("nomnom")
  }

  class Cat extends Animal {
    def crunch(): Unit = {
      eat()
      println("Crunch Crunch")
    }
  }

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  dog.eat()
  println(dog.creatureType)

  class Dog(override val creatureType: String) extends Animal {
    override def eat(): Unit = {
      super.eat()
      println("Crunch, crunch")
    }
  }

  unknownAnimal.eat()


}
