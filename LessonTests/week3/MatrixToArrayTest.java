package week3;

import static org.junit.Assert.*;

import org.junit.Test;

import week3.MatrixToArray;

public class MatrixToArrayTest {

	@Test
	public void test() throws Exception {
		int[][] matrix = { { 1, 2 }, { 2, 1 } };
		int[] array = { 3, 3 };
		assertArrayEquals(array, MatrixToArray.matrixToArray(matrix));
	}

	@Test
	public void test2() throws Exception {
		int[][] matrix = { { 1, 5, 3 }, { 2, 11, 4 } };
		int[] array = { 9, 17 };
		assertArrayEquals(array, MatrixToArray.matrixToArray(matrix));
	}

	@Test(expected = Exception.class)
	public void testvazia() throws Exception {
		int[][] matrix = {};
		MatrixToArray.matrixToArray(matrix);
	}

}
