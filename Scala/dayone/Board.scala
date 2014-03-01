
/* exercise one - write a game that will take a tic-tac-toe board with X, O,
	 and blank characters and detect the winner or whether there is a tie or 
	 no winner yet. Use classes where appropriate. */
class Board(val cells: List[Char]) {
  def prettyPrint() {
    for (i <- 0 until cells.length) {
      if (i % 3 == 0) {
        println()
      }
      print(cells(i))
    }
    println()
  }
  def checkWinner = {
    var xCount = 0
    var oCount = 0

    for (i <- 0 until cells.length) {
      if (cells(i).equals('x')) {
        xCount = xCount + 1
      }
      else if (cells(i).equals('o')) {
        oCount = oCount + 1
      }
    }

    //possible win states are
    //   -------
    //   |0|1|2|
    //   |3|4|5|
    //   |6|7|8|
    //   -------
    //(0 4 8), (2 4 6), (0 3 6), (1 4 7), (2 5 8), (0 1 2), (3 4 5), (6 7 8)

    var winState = "no winner"
    val winCombos = List((0, 4, 8),(0, 4, 8), (0, 3, 6), (1, 4, 7), (2, 5, 8), (0, 1, 2), (3, 4, 5), (6, 7, 8))


    //feels like there should be a more elegant way of doing this, but I don't know enough scala to do it yet :/
    if (xCount > 2 || oCount > 2) {
      for (i <- 0 until winCombos.length) {
        if (!winState.contains("Wins")) { //would be better to break out of this when we find the win case, but it seems pretty complex
          winState =  lineChecker(cells(winCombos(i)._1), cells(winCombos(i)._2), cells(winCombos(i)._3))
        } //this will have to do for now
      }
    }

    winState
  }


  def lineChecker(first: Char, second: Char, third: Char) = {
    if (!first.equals(' ') && (first.equals(second) && second.equals(third))) {
      first.toUpper.+(" Wins!")
    }
    else {
      "No winner"
    }
  }


}