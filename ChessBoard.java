import Constants.Constants;
import Piece.Bishop;
import Piece.King;
import Piece.Knight;
import Piece.Pawn;
import Piece.Queen;
import Piece.Rook;

public class ChessBoard implements Constants {
	
	private Rook white_rook1;
	private Rook white_rook2;

	private Knight white_knight1;
	private Knight white_knight2;

	private Bishop white_bishop1;
	private Bishop white_bishop2;

	private Queen white_queen;
	private King white_king;

	private Pawn white_pawn1;
	private Pawn white_pawn2;
	private Pawn white_pawn3;
	private Pawn white_pawn4;
	private Pawn white_pawn5;
	private Pawn white_pawn6;
	private Pawn white_pawn7;
	private Pawn white_pawn8;

	private Rook black_rook1;
	private Rook black_rook2;

	private Knight black_knight1;
	private Knight black_knight2;

	private Bishop black_bishop1;
	private Bishop black_bishop2;

	private Queen black_queen;
	private King black_king;

	private Pawn black_pawn1;
	private Pawn black_pawn2;
	private Pawn black_pawn3;
	private Pawn black_pawn4;
	private Pawn black_pawn5;
	private Pawn black_pawn6;
	private Pawn black_pawn7;
	private Pawn black_pawn8;

	BoardSquare[][] board;

	public ChessBoard() {
		board = new BoardSquare[8][8];
		reset();	
	}

	public void reset() {
		white_rook1 = new Rook(WHITE);
		white_rook2 = new Rook(WHITE);

		white_knight1 = new Knight(WHITE);
		white_knight2 = new Knight(WHITE);

		white_bishop1 = new Bishop(WHITE);
		white_bishop2 = new Bishop(WHITE);

		white_queen = new Queen(WHITE);
		white_king = new King(WHITE);

		white_pawn1 = new Pawn(WHITE);
		white_pawn2 = new Pawn(WHITE);
		white_pawn3 = new Pawn(WHITE);
		white_pawn4 = new Pawn(WHITE);
		white_pawn5 = new Pawn(WHITE);
		white_pawn6 = new Pawn(WHITE);
		white_pawn7 = new Pawn(WHITE);
		white_pawn8 = new Pawn(WHITE);

		black_rook1 = new Rook(BLACK);
		black_rook2 = new Rook(BLACK);

		black_knight1 = new Knight(BLACK);
		black_knight2 = new Knight(BLACK);

		black_bishop1 = new Bishop(BLACK);
		black_bishop2 = new Bishop(BLACK);

		black_queen = new Queen(BLACK);
		black_king = new King(BLACK);

		black_pawn1 = new Pawn(BLACK);
		black_pawn2 = new Pawn(BLACK);
		black_pawn3 = new Pawn(BLACK);
		black_pawn4 = new Pawn(BLACK);
		black_pawn5 = new Pawn(BLACK);
		black_pawn6 = new Pawn(BLACK);
		black_pawn7 = new Pawn(BLACK);
		black_pawn8 = new Pawn(BLACK);

		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				board[i][j].setLocation_i(i);
				board[i][j].setLocation_j(j);
			}
		}
		
		board[0][0].setPiece(white_rook1);
		board[0][1].setPiece(white_knight1);
		board[0][2].setPiece(white_bishop1);
		board[0][3].setPiece(white_queen);
		board[0][4].setPiece(white_king);
		board[0][5].setPiece(white_bishop2);
		board[0][6].setPiece(white_knight2);
		board[0][7].setPiece(white_rook2);

		board[1][0].setPiece(white_pawn1);
		board[1][1].setPiece(white_pawn2);
		board[1][2].setPiece(white_pawn3);
		board[1][3].setPiece(white_pawn4);
		board[1][4].setPiece(white_pawn5);
		board[1][5].setPiece(white_pawn6);
		board[1][6].setPiece(white_pawn7);
		board[1][7].setPiece(white_pawn8);

		board[7][0].setPiece(black_rook1);
		board[7][1].setPiece(black_knight1);
		board[7][2].setPiece(black_bishop1);
		board[7][3].setPiece(black_queen);
		board[7][4].setPiece(black_king);
		board[7][5].setPiece(black_bishop2);
		board[7][6].setPiece(black_knight2);
		board[7][7].setPiece(black_rook2);

		board[6][0].setPiece(black_pawn1);
		board[6][1].setPiece(black_pawn2);
		board[6][2].setPiece(black_pawn3);
		board[6][3].setPiece(black_pawn4);
		board[6][4].setPiece(black_pawn5);
		board[6][5].setPiece(black_pawn6);
		board[6][6].setPiece(black_pawn7);
		board[6][7].setPiece(black_pawn8);
	}
}
