package week3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import week3.IsArrayElementsInMatrix;

public class IsArrayElementsInMatrixTest {

	@Test
	public void testTrue1() throws Exception {
		int[][] matrix = { { 1, 5, 3 }, { 2, 11, 4 } };
		int[] array = { 11, 5 };
		assertTrue(IsArrayElementsInMatrix.isArrayElementsInMatrix(matrix, array));
	}

	@Test
	public void testTrue2() throws Exception {
		int[][] matrix = { { 1, 5, 3 }, { 2, 11, 4 } };
		int[] array = { 5, 11 };
		assertTrue(IsArrayElementsInMatrix.isArrayElementsInMatrix(matrix, array));
	}

	@Test
	public void testFalse0() throws Exception {
		int[][] matrix = { { 1, 5, 3 }, { 2, 11, 4 } };
		int[] array = { 41, 11 };
		assertFalse(IsArrayElementsInMatrix.isArrayElementsInMatrix(matrix, array));
	}

	@Test
	public void testFalse1() throws Exception {
		int[][] matrix = { { 1, 5, 3 }, { 2, 11, 4 } };
		int[] array = { 41, 11 };
		assertFalse(IsArrayElementsInMatrix.isArrayElementsInMatrix(matrix, array));
	}
}
