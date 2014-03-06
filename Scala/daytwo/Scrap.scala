package daytwo

import scala.io

//exercise two - Write a censor trait
trait Censor {

  val curses = Map("(?i)shoot" -> "Pucky", "(?i)darn" -> "Beans")

  def replace(string: String): String = {
    var politePhrase = string

    curses.foreach(curse =>
      politePhrase = politePhrase.replaceAll(curse._1, curse._2)
    )

    politePhrase
  }
}


//exercise three - load the curses from a file
trait BetterCensor {
  val lines = io.Source.fromFile("curses.txt").getLines()

  println(lines)

  def betterReplace(string: String): String = {
    string
  }

}

/**
 * Addendum leading up to day two exercises.
 */
class Scrap extends Censor with BetterCensor {

  def run() {

    val list = List("Guts man", "Bubble man", "Proto man")
    list.foreach(man => println(man)) //anonymous functions are pretty neat
    println()
    list.init.foreach(man => println(man))
    println()
    list.tail.foreach(man => println(man))
    println()
    list.drop(2).foreach(man => println(man))

    //and as a set...
    println() //formatting

    val set = Set("Spark man", "Wood man", "Dr. Light")
    set.foreach(man => println(man))

    println()

    val powers = Map("Spark man" -> "Electricity", "Bubble man" -> "Fires Bubbles", "Guts man" -> "No idea")
    println(powers.foreach(man => println(man._2)))

    println() //formatting

    println(list.forall(man => man.contains("man")))
    println(set.forall(man => man.contains("man")))
    println(set.exists(man => man.contains("Dr")))

    println()

    println(stringLengthSum(list))


    val cursePhrase = "Shoot, why did I ever do all that blasted darning"
    println(replace(cursePhrase))

    println(betterReplace(cursePhrase))

  }

  //exercise one - use foldLeft to compute the total size of a list of strings
  def stringLengthSum(strings: List[String]): Int = {
    strings.foldLeft(0)((sum, value) => sum + value.length)
  }
}
