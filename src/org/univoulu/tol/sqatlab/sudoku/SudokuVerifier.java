package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public String sub;
	public int[] helper;

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		return 0;
	}

	public boolean check9() {
		helper = new int[9];
		for (int i = 0; i < 9; i++)
		{
			helper[sub.charAt(i) - '1']++;
		}
		for (int i = 0; i < 9; i++)
		{
			if (helper[i] != 1)
				return false;
		}
		return true;
	}
}
