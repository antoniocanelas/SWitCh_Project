package test3;

import static org.junit.Assert.*;

import org.junit.Test;
import exercise3.IsArraySym;

public class IsArraySymTest {

	@Test
	public void isSymmetric() {
		int[] arrayA = { 1, 2, 3 };
		int[] arrayB = { 3, 2, 1 };
		assertEquals(true, IsArraySym.isArraySym(arrayA, arrayB));
	}

	@Test
	public void notSymmetric() {
		int[] arrayA = { 1, 2, 3 };
		int[] arrayB = { 2, 2, 1 };
		assertEquals(false, IsArraySym.isArraySym(arrayA, arrayB));
	}
}
