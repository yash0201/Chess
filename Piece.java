class Piece {

	private String name;
	private String chessImage;
	private int color;
	private int position_i;
	private int position_j;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPieceImage() {
		return chessImage;
	}

	public void setPieceImage(String chessImage) {
		this.chessImage = chessImage;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getPosition_i() {
		return position_i;
	}

	public void setPosition_i(int position_i) {
		this.position_i = position_i;
	}

	public int getPosition_j() {
		return position_j;
	}

	public void setPosition_j(int position_j) {
		this.position_j = position_j;
	}

	public int[] getPositions() {
		return new int[] { getPosition_i(), getPosition_j() };
	}

	public void setPositions(int position_i, int position_j) {
		setPosition_i(position_i);
		setPosition_j(position_j);
	}
}
