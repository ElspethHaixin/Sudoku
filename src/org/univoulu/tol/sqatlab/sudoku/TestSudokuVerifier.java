package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test() {
		SudokuVerifier sv = new SudokuVerifier();
		sv.sub = "123456789";
		boolean exp = true;
		assertEquals(exp, sv.check9());
	}

}
