package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testCheck9() {
		SudokuVerifier sv = new SudokuVerifier();
		sv.setSub("123456789");
		boolean exp = true;
		assertEquals(exp, sv.check9());
	}

}
