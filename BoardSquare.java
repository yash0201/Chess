import Piece.Piece;

public class BoardSquare {
	private int color;
	private int location_i;
	private int location_j;
	private Piece piece;

	public int getLocation_i() {
		return location_i;
	}

	public void setLocation_i(int location_i) {
		this.location_i = location_i;
	}

	public int getLocation_j() {
		return location_j;
	}

	public void setLocation_j(int location_j) {
		this.location_j = location_j;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
		piece.setPosition_i(location_i);
		piece.setPosition_j(location_j);
	}
}
