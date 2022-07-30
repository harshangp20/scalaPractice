package scala.exercise.patternMaching

import scala.util.Random

object PatternMatching extends App {

  val random = new Random
  val x = random.nextInt(10)

  val descriptionForX = x match {
    case 1 => "The ONE"
    case 2 => "Double or Nothing"
    case 3 => "Third time is the charm"
    case _ => "something else" // _ => WILD CARD
  }

  println(x)
  println(descriptionForX)

  case class Person( name: String, age: Int )
  val harshang = Person("Harshang",25)

  val greeting = harshang match {
    case Person(n,a) if a < 21 => s"Hello my name is $n and I can`t drink in the INDIA."
    case Person(n,a) => s"Hello my name is $n, I am $a years old."
    case _ => "I Don`t know who are you.!!!"
  }

  println(greeting)

  sealed class Animal
  case class Dog(bread: String) extends Animal
  case class Parrot(greeting: String) extends Animal

  val animal: Animal = Dog("Terra Nova")

  animal match {
    case Dog(someBreed) => println(s"Matched a dog of the $someBreed breed.")
  }

  val isEven = x match {
    case n if n % 2 == 0 => true
    case _ => false
  }

  val isEvenCond = if (x % 2 == 0) true else false
  val isEvenNormal = x % 2 == 0

  println(isEven)
  println(isEvenCond)
  println(isEvenNormal)


  trait Expr
  case class Number(n: Int) extends Expr
  case class Sum(e1: Expr, e2: Expr) extends Expr
  case class Prod(e1: Expr, e2: Expr) extends Expr

  def show(e : Expr): String = e match {
    case Number(n) => s"$n"
    case Sum(e1,e2) => show(e1) + " + " + show(e2)
    case Prod(e1,e2) => {
      def maybeShowParentheses(expr: Expr) = expr match {
        case Prod( _ , _ ) => show(expr)
        case Number(_) => show(expr)
        case _ => "(" + show(expr) + ")"
      }
      maybeShowParentheses(e1) + " * " + maybeShowParentheses(e2)
    }
  }

  println(show(Sum(Number(2),Number(3))))
  println(show(Sum(Sum(Number(2),Number(3)),Number(4))))
  println(show(Prod(Sum(Number(2),Number(1)),Number(3))))
  println(show(Prod(Sum(Number(2),Number(1)),Sum(Number(3),Number(4)))))
  println(show(Sum(Prod(Number(2),Number(1)),Number(3))))

}
