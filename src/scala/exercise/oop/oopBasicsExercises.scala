package scala.exercise.oop

object oopBasicsExercises extends App {

  val author = new Writer("Harivanshray", "Bachhan", 1912)
  val novel = new Novel("Great Expectations", 1990, author)
  val imposter = new Writer("Harivanshray", "Bachhan", 1912)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print()
  counter.inc.inc.inc.print()
  counter.inc(10).print()

}

class Writer(firstName: String, surName: String, val year: Int) {
  def fullName: String = firstName + " " + surName
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge: Any = year - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0) {

  def inc: Counter = {
    println("Incrementing")
    new Counter(count + 1)
  }

  def dec: Counter = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter =
    if (n <= 0) this
    else dec.dec(n - 1)

  def print(): Unit = println(count)
}