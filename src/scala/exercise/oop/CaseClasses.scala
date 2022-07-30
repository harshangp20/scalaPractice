package scala.exercise.oop

import Objects.manthan

object CaseClasses extends App {

  case class Person(name: String, age: Int, birthDay: String)

  val harshang = Person("Harshang", 18, "20-Oct-2003")

  /*println(harshang.name)
  println(harshang.birthDay)
  println(harshang.age)

  println(harshang)*/

  val harshang2 = Person("Harshang",18, "20-Oct-2003")
  /*println(manthan)*/

  println(harshang == harshang2 )

  val harshang3 = harshang.copy(name = "Manthan")

  case object UnitedKingdom {
    def name: String = "Thr UK of GB and NI"
  }


}
