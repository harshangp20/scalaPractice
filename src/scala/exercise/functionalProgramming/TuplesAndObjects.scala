package scala.exercise.functionalProgramming

import scala.annotation.tailrec

object TuplesAndObjects extends App {

  //tuples = "finite ordered "lists"
  val aTuple = (121, "Hello! Harshang")
  println("1: " + aTuple)

  println("2: " + aTuple._1)
  println("3: " + aTuple.copy(_2 = "goodbye Java"))
  println("4: " + aTuple.swap)
  // Maps
  val aMap: Map[String, Int] = Map()
  val phoneBook = Map(("Harshang", 121), "Manthan" -> 150, "Jim" -> 555, "JIM" -> 9000).withDefaultValue(-1)
  println("5: " + phoneBook)
  // Map Operations
  println("6: " + phoneBook.contains("Harshang"))
  println("7: " + phoneBook("Krishn"))
  println("8: " + phoneBook.contains("Jim"))

  //add a Pairing
  val newPairing = "Mary" -> 69
  val newPhoneBook = phoneBook + newPairing
  println("9: " + newPhoneBook)

  // function als on maps
  // map , flatMap, filter
  println("10: " + phoneBook.map(pair => pair._1.toLowerCase -> pair._2))

  //filterKeys

  println("11: " + phoneBook.filterKeys(x => x.startsWith("H")))
  //mapValues
  println("12: " + phoneBook.mapValues(number => number * 10))
  println("13: " + phoneBook.mapValues(number => "0245-" + number))

  // conversions to other Collections
  println("14: " + phoneBook.toList)
  println("15: " + List(("Samarth", 555)).toMap)
  val names = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim", "JIM", "Harshang", "Manthan", "Krishn", "Harsh")
  println("16: " + names.groupBy(name => name.charAt(1)))

  def add(network: Map[String, Set[String]], person: String):
  Map[String, Set[String]] = {
    network + (person -> Set())
  }
}
