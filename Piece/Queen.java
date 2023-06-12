package Piece;
public class Queen extends Piece {

	public Queen() {
		setName("queen");
	}

	public Queen(int color) {
		setName("queen");
		setColor(color);
	}

	public Queen(int color, int position1, int position2) {
		setName("queen");
		setColor(color);
		setPositions(position1, position2);
	}
}
