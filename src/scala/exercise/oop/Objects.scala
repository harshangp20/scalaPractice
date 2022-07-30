package scala.exercise.oop

object Objects extends App {

  object Person {
    val N_EYES = 2
    def canFly: Boolean = false
    def apply(mother: Person, father: Person) : Person = new Person("Bobbie")
  }

  class Person (val name: String){


  }

  println("Human has " + Person.N_EYES + " eyes")
  println("Human can fly ? true/false ? " + Person.canFly)

  val harshang = new Person("Harshang")
  val manthan = new Person("Manthan")

  //  println(harshang == manthan)

  val person1 = Person
  val person2 = Person

  println(person1 == person2)

  val bobble = Person(harshang,manthan)

}
