package scala.exercise.oop

object AbstractDataTypes extends App {

  abstract class Animal {
    val  creatureType: String
    def eat(): Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat(): Unit = println("Crunch Crunch")
  }

  trait Carnivore {
    def eat(animal: Animal) : Unit
  }

  trait ColdBlooded {
    def rating(): Unit
  }

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    val creatureType: String = "Crocodile"
    def eat(): Unit = println("nomnomnom")
    def eat(animal: Animal)  : Unit = println(s"I`m a crocodile and I`m eating ${animal.creatureType}")
    def rating(): Unit = println(s"Yes i have rated to the top of the world for hunting and i am $creatureType")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
  croc.eat()
  croc.rating()
}
