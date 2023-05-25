public class Pawn extends Piece {
	
	public Pawn() {
		setName("pawn");
	}

	public Pawn(int color) {
		setName("pawn");
		setColor(color);
	}

	public Pawn(int color, int position1, int position2) {
		setName("pawn");
		setColor(color);
		setPositions(position1, position2);
	}
}
