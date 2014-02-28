
/* exercise one - write a game that will take a tic-tac-toe board with X, O,
	 and blank characters and detect the winner or whether there is a tie or 
	 no winner yet. Use classes where appropriate. */
package dayone
class Board(val cells: List[Char]) {
  def prettyPrint() {
    for (i <- 0 until cells.length) {
      if (i % 3 == 0) {
        println()
      }
      print(cells(i))
    }
  }
}
