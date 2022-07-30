package scala.exercise.oop

object OOBasics extends App {
  val person = new Person("Harshang",18)
//  println(person.age,person.name,person.x)
println(person.x)
  person.greeting("Manthan")
  person.greet()
}

class Person(val name: String, val age: Int){

  val x = 2

  println(1 + 3)
  def greeting(name: String): Unit = println(s"${this.name} says: Hi, $name" )

  def greet(): Unit = println(s"Hi, I am $name")

  def this(name: String) = this(name, 0)
  def this() = this("Harshang Prajapati")
}