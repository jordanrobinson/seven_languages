package daytwo

/**
 * Addendum leading up to day two exercises.
 */
class Scrap {
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


  }
}
