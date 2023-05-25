public class Bishop extends Piece {
	
	public Bishop() {
		setName("bishop");
	}

	public Bishop(int color) {
		setName("bishop");
		setColor(color);
	}

	public Bishop(int color, int position1, int position2) {
		setName("bishop");
		setColor(color);
		setPositions(position1, position2);
	}
}
