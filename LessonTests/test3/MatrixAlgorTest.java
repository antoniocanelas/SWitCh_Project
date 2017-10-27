package test3;

import static org.junit.Assert.*;

import org.junit.Test;
import exercise3.MatrixAlgor;

public class MatrixAlgorTest {

	// Symmetric Diagonal1
	@Test
	public void symP2() {
		int[][] matrix = { { 1, 2 }, { 2, 1 } };
		assertEquals(true, MatrixAlgor.matrixSymP(matrix));
	}

	@Test
	public void symP3() {
		int[][] matrix = { { 1, 2, 3 }, { 2, 5, 7 }, { 3, 7, 4 } };
		assertEquals(true, MatrixAlgor.matrixSymP(matrix));
	}

	@Test
	public void symP3false() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		assertEquals(false, MatrixAlgor.matrixSymP(matrix));
	}

	// Symmetric Diagonal2
	@Test
	public void symS2() {
		int[][] matrix = { { 1, 2 }, { 2, 1 } };
		assertEquals(true, MatrixAlgor.matrixSymS(matrix));
	}

	@Test
	public void symS3() {
		int[][] matrix = { { 1, 2, 3 }, { 3, 4, 2 }, { 4, 3, 1 } };
		assertEquals(true, MatrixAlgor.matrixSymS(matrix));
	}

	@Test
	public void symS3false() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		assertEquals(false, MatrixAlgor.matrixSymS(matrix));
	}
}
