package Piece;

import java.util.ArrayList;

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

	@Override
	public ArrayList<Integer[]> getPossibleMoves() {
		
		ArrayList<Integer[]> possibleMoves = new ArrayList<>();

		int position_i = getPosition_i();
		int position_j = getPosition_j();		

		for(int i = position_i + 1, j = position_j + 1; i < 8 && j < 8; i++, j++) {
			possibleMoves.add(new Integer[] { i , j } );	
		}

		for(int i = position_i + 1, j = position_j - 1; i < 8 && j >= 0; i++, j--) {
			possibleMoves.add(new Integer[] { i , j } );	
		}

		for(int i = position_i - 1, j = position_j + 1; i >= 0 && j < 8; i--, j++) {
			possibleMoves.add(new Integer[] { i , j } );	
		}

		for(int i = position_i - 1, j = position_j - 1; i >= 0 && j >= 0; i--, j--) {
			possibleMoves.add(new Integer[] { i , j } );	
		}

		return possibleMoves;
	}
}
