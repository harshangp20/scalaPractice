package scala.exercise.functionalProgramming

import scala.util.{Failure, Random, Success, Try}

object HandlingFailure extends App {

  val aSuccess = Success(121)
  val aFailure = Failure(new RuntimeException("SUPER FAILURE"))

  println(aSuccess)
  println(aFailure)
  val potentialFailure = Try(unsafeMethod())
  val anotherPotentialFailure = Try {
    // code that might throw
  }
  println(potentialFailure)
  val fallbackTry = Try(unsafeMethod()).orElse(Try(backupMethod()))

  // utilities
  println(potentialFailure.isSuccess)
  val betterFallback = betterUnsafeMethod() orElse betterBackupMethod()

  def unsafeMethod(): String = throw new RuntimeException("NO STRING FOR YOU!!!!!!!")

  println(fallbackTry)

  def backupMethod(): String = "A Valid result"

  // IF You design the API
  def betterUnsafeMethod(): Try[String] = Failure(new RuntimeException)

  def betterBackupMethod(): Try[String] = Success("A valid result")

  // map, flatMap, filter
  println(aSuccess.map(_ * 2))
  //  println(aSuccess.flatten(x => Success(_ * 10)))
  println(aSuccess.filter(_ > 10))

  val host = "localhost"
  val port = "8080"
  def renderHTML(page: String): Unit = println(page)

  class Connection {
    def get(url: String): String = {
      val random = new Random(System.nanoTime())
      if (random.nextBoolean()) "<html>...</html>"
      else throw new RuntimeException("Connection interrupted")
    }

    def getSafe(url: String): Try[String] = Try(get(url))
  }

  object HttpService {
    val random = new Random(System.nanoTime())

    def getConnection(host: String, port: String): Connection =
      if (random.nextBoolean()) new Connection
      else throw new RuntimeException("Someone else took the port")

    def getSafeConnection(host: String, port: String) : Try[Connection] = Try(getConnection(host, port))

  }

  val possibleConnection = HttpService.getSafeConnection(host,port)
  val possibleHTML = possibleConnection.flatMap(connection => connection.getSafe("/home"))
  possibleHTML.foreach(renderHTML)

  HttpService.getSafeConnection(host, port)
    .flatMap(connection => connection.getSafe("/home"))
    .foreach(renderHTML)

  // for-comprehension version

  for {
    connection <- HttpService.getSafeConnection(host,port)
    html <- connection.getSafe("/home")
  } renderHTML(html)



}
