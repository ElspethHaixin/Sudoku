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

	@Test
	public void testVerify() {
		SudokuVerifier sv = new SudokuVerifier();
		boolean exp1 = true;
		boolean exp2 = false;
		assertEquals(exp1, sv.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
		assertEquals(exp2, sv.verify("123456789912345678891234567789123456678912345567891234456789123345678912234567891"));
	}
	
}
