public class Rook extends Piece {
	
	public Rook() {
		setName("rook");
	}

	public Rook(int color) {
		setName("rook");
		setColor(color);
	}

	public Rook(int color, int position1, int position2) {
		setName("rook");
		setColor(color);
		setPositions(position1, position2);
	}
}