package scala.exercise.functionalProgramming

import scala.annotation.tailrec

object TuplesAndObjectExe extends App {

  def add(network: Map[String, Set[String]], person: String): Map[String, Set[String]] =
    network + (person -> Set())

  def friend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA + b)) + (b -> (friendsB + a))
  }

  def unfriend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA - b)) + (b -> (friendsB - a))
  }

  def remove(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
    @tailrec
    def removeAux(friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] =
      if (friends.isEmpty) networkAcc
      else removeAux(friends.tail, unfriend(networkAcc, person, friends.head))

    val unfriended = removeAux(network(person), network)
    unfriended - person
  }

  val empty: Map[String, Set[String]] = Map()
  val network = add(add(empty, "Harshang"), "Manthan")
  println("People on FB Network:- " + network)
  println("Friends on FB Network:-  " + friend(network, "Harshang", "Manthan"))
  println("Unfriends" + unfriend(friend(network, "Harshang", "Manthan"), "Harshang", "Manthan"))
  println("Remove on Friend List:-" + remove(friend(network, "Harshang", "Manthan"), "Manthan"))

  // Jim,Bob,Mary
  val people = add(add(add(empty, "Harshang"), "Manthan"), "Samarth")
  val harshangManthan = friend(people, "Harshang", "Samarth")
  val testNet = friend(harshangManthan, "Harshang" , "Manthan")

  println("Testnet:-" +testNet)

  val samarthManthan = unfriend(people,"Manthan","Samarth")
  println("Unfriends:-" + samarthManthan)

  def nFriends(network: Map[String, Set[String]], person: String): Unit = {
    if (!network.contains(person)) println(0)
    else println(person + " has " +  network(person).size + " Friend List ")
  }

  println("Testnet:-" + nFriends(testNet, "Harshang"))

  def mostFriends(network: Map[String, Set[String]]): String =
    network.maxBy(pair => pair._2.size)._1

  println("Who has most friends on FB:-" + mostFriends(people))

  def nPeopleWithNoFriends(network: Map[String, Set[String]]): Int = {
    network.count(_._2.isEmpty)
  }

  println("Who has not any friends:-" + nPeopleWithNoFriends(network))

  def socialConnection(network: Map[String, Set[String]], a: String, b: String): Boolean = {
    @tailrec
    def bfs(target: String, consideredPeople: Set[String], discoveredPeople: Set[String]): Boolean = {
      if (discoveredPeople.isEmpty) false
      else {
        val person = discoveredPeople.head
        if (person == target) true
        else if (consideredPeople.contains(person)) bfs(target, consideredPeople, discoveredPeople.tail)
        else bfs(target, consideredPeople + person, discoveredPeople.tail ++ network(person) )
      }
    }
    bfs (b, Set(), network(a) + a)
  }

  println(socialConnection(testNet,"Samarth","Manthan"))
  println(socialConnection(samarthManthan,"Samarth","Manthan"))
}


