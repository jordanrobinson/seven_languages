//day one exercises for scala, in the seven languages seven weeks book.
object HelloWorld {
	def main(args: Array[String]) {
		println("hello there scala")
		forLoop //note no braces
		println()
		forEachLoop
		println()
		forEachLoopUntil
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