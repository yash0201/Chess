package Piece;

import java.util.ArrayList;

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

	@Override
	public ArrayList<Integer[]> getPossibleMoves() {
		
		ArrayList<Integer[]> possibleMoves = new ArrayList<>();

		int position_i = getPosition_i();
		int position_j = getPosition_j();

		if(position_i + 1 < 8) {
			possibleMoves.add(new Integer[] { position_i + 1, position_j } );
		}

		if(position_i - 1 >= 0) {
			possibleMoves.add(new Integer[] { position_i - 1, position_j } );
		}

		if(position_j + 1 < 8) {
			possibleMoves.add(new Integer[] { position_i, position_j + 1 } );
		}
		
		if(position_j - 1 >= 0) {
			possibleMoves.add(new Integer[] { position_i, position_j - 1 } );
		}
		
		if(position_i + 1 < 8 && position_j + 1 < 8) {
			possibleMoves.add(new Integer[] { position_i + 1, position_j + 1 } );
		}

		if(position_i + 1 < 8 && position_j - 1 >= 0) {
			possibleMoves.add(new Integer[] { position_i + 1, position_j - 1 } );
		}

		if(position_i - 1 >= 0 && position_j + 1 < 8) {
			possibleMoves.add(new Integer[] { position_i - 1, position_j + 1 } );
		}
		
		if(position_i - 1 >= 0 && position_j - 1 >= 0) {
			possibleMoves.add(new Integer[] { position_i - 1, position_j - 1 } );
		}

		return possibleMoves;
	}
}
