package scala.exercise.oop

object Generics extends App {

  class MyList[+A] {
    // use the type A
    def add[B >: A](element: B): MyList[B] = ???
  }

  class MyMap[Key,value]

  val listOfIntegers = new MyList[Int]
  val listOFStrings = new MyList[String]

  //generic methods
  object MyList {
//    def empty[A] : MyList[A] = ???
  }

//  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  class CovariantList[+A]
  val animal : Animal = new Dog
  val animalList: CovariantList[Animal] = new CovariantList[Cat]


  class InvariantList[A]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  class Trainer [-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  class Cage [A <: Animal] (animal: A)
  val cage = new Cage(new Dog)

  class Car
//  val newCage = new Cage(new Car)



}
