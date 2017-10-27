package test3;

import static org.junit.Assert.*;

import org.junit.Test;
import exercise3.IsSodoku;

public class IsSodokuTest {

	int[][] matrizCorrecta = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
			{ 1, 9, 8, 3, 4, 2, 5, 6, 7 }, { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
			{ 7, 1, 3, 9, 2, 4, 8, 5, 6 }, { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
			{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

	int[][] matrizIncorreta = { { 9, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 9 },
			{ 1, 9, 8, 3, 4, 2, 5, 6, 7 }, { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
			{ 7, 1, 3, 9, 2, 4, 8, 5, 6 }, { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
			{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

	int[][] matrizIncorretaNot9 = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4 },
			{ 1, 9, 8, 3, 4, 2, 5, 6, 7 }, { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
			{ 7, 1, 3, 9, 2, 4, 8, 5, 6 }, { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
			{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

	// isSudokuSolved
	@Test
	public void CheckIsSudokuSolved() {
		assertTrue(IsSodoku.isSudokuSolved(matrizCorrecta));
	}

	@Test
	public void CheckIsSudokuNotSolved() {
		assertFalse(IsSodoku.isSudokuSolved(matrizIncorreta));

	}

	// areLinhasCorrectas
	@Test
	public void CheckareLinhasCorrectas() {
		assertTrue(IsSodoku.areLinhasCorrectas(matrizCorrecta));
	}

	@Test
	public void CheckareLinhasNotCorrectas() {
		assertFalse(IsSodoku.areLinhasCorrectas(matrizIncorreta));

	}

	// areColunasCorrectas
	@Test
	public void CheckIsareColunasCorrectas() {
		assertTrue(IsSodoku.areColunasCorrectas(matrizCorrecta));
	}

	@Test
	public void CheckareColunasNotCorrectas() {
		assertFalse(IsSodoku.areColunasCorrectas(matrizIncorreta));

	}

	// areSubMatrizesCorrectas
	@Test
	public void CheckareSubMatrizesCorrectas() {
		assertTrue(IsSodoku.areSubMatrizesCorrectas(matrizCorrecta));
	}

	@Test
	public void CheckareSubMatrizesNotCorrectas() {
		assertFalse(IsSodoku.areSubMatrizesCorrectas(matrizIncorreta));

	}

	// isVectorCorrecto
	int[] vectorCorrecto = { 2, 1, 3, 4, 5, 6, 7, 8, 9 };
	int[] vectorIncorrecto = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };

	@Test
	public void CheckisVectorCorrecto() {
		assertTrue(IsSodoku.isVectorCorrecto(vectorCorrecto));
	}

	@Test
	public void CheckisVectorNotCorrecto() {
		assertFalse(IsSodoku.isVectorCorrecto(vectorIncorrecto));

	}

	// isQuadradaNove
	@Test
	public void isQuadradaNove() {
		assertTrue(IsSodoku.isQuadradaNove(matrizCorrecta));
	}

	@Test
	public void isQuadradaNotNove() {
		assertFalse(IsSodoku.isQuadradaNove(matrizIncorretaNot9));

	}

	// isTransformarLinha
	@Test
	public void transformarSMLinha() {
		int[] teste = { 7, 6, 1, 8, 5, 3, 9, 2, 4 };
		assertArrayEquals(teste, (IsSodoku.transformarSMLinha(matrizCorrecta, 3, 3)));
	}

	// isTransposta
	@Test
	public void transposta() {
		int[] teste = { 3, 7, 9, 5, 2, 1, 6, 8, 4 };
		assertArrayEquals(teste, (IsSodoku.transposta(matrizCorrecta, 1)));
	}

}
