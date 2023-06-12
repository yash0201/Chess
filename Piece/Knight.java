package Piece;

import java.util.ArrayList;

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

	@Override
	public ArrayList<Integer[]> getPossibleMoves() {
		
		ArrayList<Integer[]> possibleMoves = new ArrayList<>();

		int position_i = getPosition_i();
		int position_j = getPosition_j();

		if(position_i + 2 < 8 && position_j + 1 < 8) {
			possibleMoves.add(new Integer[] { position_i + 2, position_j + 1 } );
		}

		if(position_i + 2 < 8 && position_j - 1 >= 0) {
			possibleMoves.add(new Integer[] { position_i + 2, position_j - 1 } );
		}
		
		if(position_i - 2 >= 0 && position_j + 1 < 8) {
			possibleMoves.add(new Integer[] { position_i - 2, position_j + 1 } );
		}

		if(position_i - 2 >= 0 && position_j - 1 >= 0) {
			possibleMoves.add(new Integer[] { position_i - 2, position_j - 1 } );
		}

		if(position_i + 1 < 8 && position_j + 2 < 8) {
			possibleMoves.add(new Integer[] { position_i + 1, position_j + 2 } );
		}
		
		if(position_i - 1 >= 0 && position_j + 2 < 8) {
			possibleMoves.add(new Integer[] { position_i - 1, position_j + 2 } );
		}
		
		if(position_i + 1 < 8 && position_j - 2 >= 0) {
			possibleMoves.add(new Integer[] { position_i + 1, position_j - 2 } );
		}
		
		if(position_i - 1 >= 0 && position_j - 2 >= 0) {
			possibleMoves.add(new Integer[] { position_i - 1, position_j - 2 } );
		}

		return possibleMoves;
	}
}
