import Piece.Piece;

public class Chess {

	// if turn if odd, white plays; if turn is even, black plays
	int turn = 1; 

	private ChessBoard chessBoard;

	public Chess() {
		chessBoard = new ChessBoard();
	}

	public boolean movePiece(int location1_i, int location1_j, int location2_i, int location2_j) {

		boolean isLocation1Valid = (location1_i >= 0) && (location1_i < 8) && (location1_j >= 0) && (location1_j < 8);
		boolean isLocation2Valid = (location2_i >= 0) && (location2_i < 8) && (location2_j >= 0) && (location2_j < 8);

		if(isLocation1Valid && isLocation2Valid) {
			BoardSquare[][] board = chessBoard.getBoard();
		
			BoardSquare boardSquare1 = board[location1_i][location1_j];
			Piece piece1 = boardSquare1.getPiece();		

			BoardSquare boardSquare2 = board[location2_i][location2_j];
			Piece piece2 = boardSquare2.getPiece();		

			// checks if the pieces exists
			if(piece1 != null) {

				int piece1Color = piece1.getColor();

				if(piece2 != null) {
					int piece2Color = piece2.getColor();

					// checks if pieces are not of the same color
					// if they are of same color, then piece1 cannot kill piece2.
					if(piece2Color != piece1Color) {

						// confirms that it is piece1's turn
						if((turn & 1) == piece1Color) {
							movePiece(location1_i, location1_j, location2_i, location2_j);
							turn++;
						}
					}
				} else{
					// confirms that it is piece1's turn
					if((turn & 1) == piece1Color) {
						movePiece(location1_i, location1_j, location2_i, location2_j);
						turn++;
					}
				}		
			}
		}		

		return false;
	}
}
