package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	private String sub;
	private int[] helper;

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		if (candidateSolution.length() != 81)
			return 1;

		for (int i = 0; i < candidateSolution.length(); i++) {
			if (candidateSolution.charAt(i) > '9' || candidateSolution.charAt(i) <

			'1')
				return -1;
		}

		for (int i = 0, j = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				setSub(new String());
				setSub(getSub() + candidateSolution.substring(i * 3 * 9 + j * 3, i * 3 * 9

				+ j * 3 + 3));
				setSub(getSub() + candidateSolution.substring((i * 3 + 1) * 9 + j * 3, (i *

				3 + 1) * 9 + j * 3 + 3));
				setSub(getSub() + candidateSolution.substring((i * 3 + 2) * 9 + j * 3, (i *

				3 + 2) * 9 + j * 3 + 3));
				if (check9() == false)
					return -2;
			}
		}

		for (int i = 0, j = 0; i < 9; i++) {
			setSub(new String());
			for (j = 0; j < 9; j++) {
				setSub(getSub() + candidateSolution.charAt(i * 9 + j));
			}
			if (check9() == false)
				return -3;
		}

		for (int i = 0, j = 0; j < 9; j++) {
			setSub(new String());
			for (i = 0; i < 9; i++) {
				setSub(getSub() + candidateSolution.charAt(i * 9 + j));
			}
			if (check9() == false)
				return -4;
		}

		return 0;
	}

	public boolean check9() {
		helper = new int[9];
		for (int i = 0; i < 9; i++)
		{
			helper[getSub().charAt(i) - '1']++;
		}
		for (int i = 0; i < 9; i++)
		{
			if (helper[i] != 1)
				return false;
		}
		return true;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}
	
}
