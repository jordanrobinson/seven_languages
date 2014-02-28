//day one exercises for scala, in the seven languages seven weeks book.
package dayone
object Main { //all of this is essentially background reading and the exercises are much lower down
def main(args: Array[String]) {
  println("hello there scala")
  forLoop //note no braces
  println()
  forEachLoop
  println()
  forEachLoopUntil

  //let's use some tuples

  val test = ("taco", "cat")
  println(test) //calling the tostring of tuple2
  println(test._1) //tuples are one-indexed it seems. This is an interesting question as to why https://stackoverflow.com/questions/6241464/why-are-the-indexes-of-scala-tuples-1-based
  println(test._2) //if we did ._3 it would throw an error, as would ._0
  println(test.swap)
  println(test.productArity)
  val secondTest = ("cat", "taco") //val is immutable, whereas var is not
  println(secondTest == test)
  println(secondTest.swap == test) //so swap must return a new tuple since immutable and this is true
  var thirdTest = ("tube", "debut") //since this is a var we can change it
  println(thirdTest == test) //which means this is false
  thirdTest = test
  println(thirdTest == test) //and this is now true

  println("starting exercises...\n\n")

  val cells = List ('x','x','x',
    'x','x','x',
    'x','x','x')
  val board = new Board(cells)
  println(board.cells)
  board.prettyPrint()




}

  //I'll deconstruct and comment this to see if I understand what's going on a little
  def forLoop { //we're defining the method forLoop
    for (
      i //note we don't instantiate i
      <- //this is a 'generator' that generates individual values from a range
      0 until 5 //this gives us a range, similar to something like 0..5 in ruby
    ) { //so overall this gives i the value of the current state of the generator, then does the block, and increments
      println(i) //the shortcut is still sysout, note no semicolon. I don't know if this is good practice or not (yet).
    } //since the until range is 0 inclusive and 5 exclusive, this should give 0 1 2 3 4  as output
  } //I feel like the book really should have gone over this more...

  def forEachLoop {
    (0 to 5).foreach { i => //braces seem to be necessary, since otherwise it's just '6.' and (0 to 6) returns a range
      println(i) //the to and until operators don't seem to work descending which seems kind of lame
    } //this is inclusive on both sides, so should be 0 1 2 3 4 5
  }

  def forEachLoopUntil {
    (5 until 0 by -1).foreach { i => //the => is just like the little chute in ruby that the instance variables fall down |i|
      println(i) //this one specifies direction, since 5 until 0 will not infer 5 4 3... without a by indication
    }
  }


}
