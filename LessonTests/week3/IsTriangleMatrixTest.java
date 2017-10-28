package week3;

import static org.junit.Assert.*;

import org.junit.Test;

import week3.IsTriangleMatrix;

public class IsTriangleMatrixTest {
	int[][] matrix = { { 1, 2, 3, 4 }, { 0, 2, 3, 4 }, { 0, 0, 3, 4 }, { 0, 0, 0, 4 } };
	int[][] matrixNotQuadrada = { { 1, 2, 3 }, { 0, 2, 3, 4 }, { 0, 0, 3, 4 }, { 0, 0, 0, 4 } };

	int[][] matrixTransposta = { { 1, 0, 0, 0 }, { 2, 2, 0, 0 }, { 3, 3, 3, 0 }, { 4, 4, 4, 4 } };

	int[][] matrixTeste = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 2, 1, 3, 4 }, { 2, 0, 0, 4 } };

	@Test
	public void isQuadradoQuatro() {
		assertTrue(IsTriangleMatrix.isQuadrada(matrix));
	}

	@Test
	public void isTrianguloInferior() {
		assertTrue(IsTriangleMatrix.isTrianguloInferior(matrix));
	}

	@Test
	public void isTrianguloSuperior() {
		assertTrue(IsTriangleMatrix.isTrianguloSuperior(matrixTransposta));
	}

	@Test
	public void matrizTransposta() {
		assertArrayEquals(matrixTransposta, IsTriangleMatrix.matrizTransposta(matrix));
	}

	@Test
	public void notQuadradoQuatro() {
		assertFalse(IsTriangleMatrix.isQuadrada(matrixNotQuadrada));
	}

	@Test
	public void notTriangularInferior() {
		assertFalse(IsTriangleMatrix.isTrianguloInferior(matrixTeste));
	}

	@Test
	public void notTrianguloSup() {
		assertNotEquals(8, IsTriangleMatrix.isTrianguloInferior(matrix));
	}

	@Test
	public void notTrianguloSuperior() {
		assertFalse(IsTriangleMatrix.isTrianguloSuperior(matrixTeste));
	}

}
