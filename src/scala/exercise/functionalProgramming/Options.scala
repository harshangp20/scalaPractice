package scala.exercise.functionalProgramming

object Options extends App {

  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption)
  println(noOption)
//  val result = Option(unsafeMethod()) // Some or None
//  //  val result = Some(null)                         Wrong
//  val chainResult = Option(unsafeMethod()).orElse(Option(backupMethod()))
//  println(result)
//  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()
//  val config: Map[String, String] = Map(
//    // fetched from elseWhere
//    "host" -> "176.45.36.1",
//    "port" -> "80"
//  )
//  val host = config.get("host")
//  val port = config.get("port")
//  val connection = host.flatMap(h => port.flatMap(p => Connection.apply(h, p)))
//
//  // functions on options
//  println(myFirstOption.isEmpty)
//  println(myFirstOption.get) //  UnSAFE - DO NOT USE THIS
//
//  // map, flatMap, filter
//  println(myFirstOption.map(_ * 2))
//  println(myFirstOption.filter(_ > 10))
//  println(myFirstOption.flatMap(x => Option(x * 10)))
//  val connectionStatus = connection.map(c => c.connect)
//
//  // unsafe method
//  def unsafeMethod(): String = null
//
//  def backupMethod(): String = "A valid result"
//
//  // try to establish a connection, if so - print the connect method
//
//  //DESIGN unsafe APIs
//  def betterUnsafeMethod(): Option[String] = None
//
//  def betterBackupMethod(): Option[String] = Some("A valid result")
//
//  class Connection {
//    def connect = "Connected to the DNS" // connect to some server
//  }
//
//  object Connection {
//    val random = new Random(System.nanoTime())
//
//    def apply(host: String, port: String): Option[Connection] =
//      if (random.nextBoolean()) Some(new Connection)
//      else None
//  }
//
//  println(connectionStatus)
//
//  connectionStatus.foreach(println)
//
//  // chained calls
//  config.get("host")
//    .flatMap(host => config.get("port")
//      .flatMap(port => Connection(host, port))
//      .map(connection => connection.connect))
//    .foreach(println)
//
//  val forConnectionStatus: Unit = for {
//    host <- config.get("host")
//    port <- config.get("port")
//    connection <- Connection(host, port)
//  } yield connection.connect

}
