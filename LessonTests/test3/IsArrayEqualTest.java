package test3;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise3.IsArrayEqual;

public class IsArrayEqualTest {

	@Test
	public void equalArrays() {
		int[] arrayA = { 1, 2, 3 };
		int[] arrayB = { 1, 2, 3 };
		assertEquals(true, IsArrayEqual.isArrayEqual(arrayA, arrayB));
	}

	@Test
	public void diferentArrays() {
		int[] arrayA = { 1, 2, 2 };
		int[] arrayB = { 1, 2, 3 };
		assertEquals(false, IsArrayEqual.isArrayEqual(arrayA, arrayB));
	}

}
