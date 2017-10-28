package week3;

import static org.junit.Assert.*;

import org.junit.Test;

import week3.SymmetricMatrix;

public class SymmetricMatrixTest {
	int[][] matrixT = { { 1, 2, 3, 4 }, { 0, 2, 3, 4 }, { 0, 0, 3, 4 }, { 0, 0, 0, 4 } };
	int[][] matrixNotQuadrada = { { 1, 2, 3 }, { 0, 2, 3, 4 }, { 0, 0, 3, 4 }, { 0, 0, 0, 4 } };
	int[][] matrixTransposta = { { 1, 0, 0, 0 }, { 2, 2, 0, 0 }, { 3, 3, 3, 0 }, { 4, 4, 4, 4 } };
	int[][] symmetricMatrix = { { 1, 0, 0, 0 }, { 2, 2, 0, 0 }, { 3, 3, 3, 0 }, { 4, 4, 4, 4 } };
	int[][] matrix1 = { { 1, 2, 3, 4 }, { 2, 6, 5, 8 }, { 3, 5, 7, 9 }, { 4, 8, 9, 8 } };
	int[][] matrix2 = { { 1, 2, 3 }, { 2, 2, 3 }, { 3, 3, 3 } };

	// Verificar se matriz é quadrada:
	@Test
	public void isQuadradoQuatro() {
		assertTrue(SymmetricMatrix.isQuadrada(matrix1));
	}

	@Test
	public void isQuadradoTres() {
		assertTrue(SymmetricMatrix.isQuadrada(matrix1));
	}

	@Test
	public void notQuadradoQuatro() {
		assertFalse(SymmetricMatrix.isQuadrada(matrixNotQuadrada));
	}

	// Verificar operação Transposta:
	@Test
	public void matrizTransposta0() {
		assertArrayEquals(matrixTransposta, SymmetricMatrix.matrizTransposta(matrixT));
	}

	@Test
	public void matrizTransposta1() {
		assertArrayEquals(matrix1, SymmetricMatrix.matrizTransposta(matrix1));
	}

	@Test
	public void matrizTransposta2() {
		assertArrayEquals(matrix2, SymmetricMatrix.matrizTransposta(matrix2));
	}

	// Verificar se matriz é Simétrica:
	@Test
	public void symmetricMatrix1() {
		assertTrue(SymmetricMatrix.symmetricMatrix(matrix1));
	}

	@Test
	public void symmetricMatrix2() {
		assertTrue(SymmetricMatrix.symmetricMatrix(matrix2));
	}

}
