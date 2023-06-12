package Piece;

import java.util.ArrayList;

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

	@Override
	public ArrayList<Integer[]> getPossibleMoves() {
		
		ArrayList<Integer[]> possibleMoves = new ArrayList<>();

		int position_i = getPosition_i();
		int position_j = getPosition_j();

		for(int i = position_i + 1; i < 8; i++) {
			possibleMoves.add(new Integer[] { i , position_j } );	
		}
		
		for(int i = position_i - 1; i >= 0; i--) {
			possibleMoves.add(new Integer[] { i , position_j } );	
		}

		for(int j = position_j + 1; j < 8; j++) {
			possibleMoves.add(new Integer[] { position_i , j } );	
		}

		for(int j = position_j - 1; j >= 0; j--) {
			possibleMoves.add(new Integer[] { position_i , j } );	
		}		

		return possibleMoves;
	}
}