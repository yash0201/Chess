package Piece;
public class Knight extends Piece {
	
	public Knight() {
		setName("knight");
	}

	public Knight(int color) {
		setName("knight");
		setColor(color);
	}

	public Knight(int color, int position1, int position2) {
		setName("knight");
		setColor(color);
		setPositions(position1, position2);
	}
}
