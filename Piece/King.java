package Piece;
public class King extends Piece {
	
	public King() {
		setName("king");
	}

	public King(int color) {
		setName("king");
		setColor(color);
	}

	public King(int color, int position1, int position2) {
		setName("knight");
		setColor(color);
		setPositions(position1, position2);
	}
}
