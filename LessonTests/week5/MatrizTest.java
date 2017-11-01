/**
 * 
 */
package week5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MatrizTest {

	@Test
	public void soma1() {
		Matriz m1 = new Matriz(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 1, 1, 1 } });
		Matriz m2 = new Matriz(new int[][] { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } });
		Matriz expResult = new Matriz(new int[][] { { 3, 3, 3 }, { 4, 4, 4 }, { 3, 3, 3 } });
		Matriz result = m1.Soma(m2);

		// assertEquals(result.m, expResult.m); NAO SABE COMPARAR 2 OBJETOS DO TIPO
		// MATRIZ.
		assertEquals(expResult, result);
	}

	@Test
	public void soma2() {
		Matriz m1 = new Matriz(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 1, 1, 1 } });
		Matriz m2 = new Matriz(new int[][] { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } });
		Matriz expResult = new Matriz(new int[][] { { 3, 3, 3 }, { 4, 4, 4 }, { 3, 3, 3 } });
		Matriz result = m1.Soma(m2);
		assertEquals(expResult, result);// assertEquals(result.m, expResult.m); NAO COMPARAR 2 OBJETOS TIPO MATRIZ.
	}

	@Test
	public void numero() {
		Matriz m1 = new Matriz(new int[][] { { 1, 1, 1 }, { 2, 2, 3 }, { 1, 1, 1 } });
		Ponto p1 = new Ponto(1, 0);
		Ponto p2 = new Ponto(1, 1);
		List<Ponto> expected = new ArrayList<Ponto>();
		expected.add(p1);
		expected.add(p2);
		List<Ponto> result = m1.getPontosComNumero(2);
		assertArrayEquals(expected.toArray(), result.toArray());
	}

	@Test
	public void verValor() {
		Matriz m1 = new Matriz(new int[][] { { 1, 1, 1 }, { 2, 2, 3 }, { 1, 1, 1 } });
		int[] posicao = { 1, 2 };
		assertEquals(3, m1.getValor(posicao));

	}

	@Test
	public void setValor() {
		Matriz m1 = new Matriz(new int[][] { { 1, 1, 1 }, { 2, 2, 3 }, { 1, 1, 1 } });
		int[] ponto = { 1, 2 };
		int valor = 3;
		assertEquals(true, m1.setValor(ponto, valor));

	}

	@Test
	public void multiplicacao1() {
		Matriz matrixA = new Matriz(new int[][] { { 2, 5, 9 }, { 3, 6, 8 } });
		Matriz matrixB = new Matriz(new int[][] { { 2, 7 }, { 4, 3 }, { 5, 2 } });
		Matriz expResult = new Matriz(new int[][] { { 69, 47 }, { 70, 55 } });
		Matriz result = matrixA.multiplicacao(matrixB);
		assertEquals(expResult, result);
	}

	@Test
	public void multiplicacao2() {
		Matriz matrixA = new Matriz(new int[][] { { 5, 1 }, { 3, 2 } });
		Matriz matrixB = new Matriz(new int[][] { { 0, 5, 1, 6 }, { 2, -1, 4, -3 } });
		Matriz expResult = new Matriz(new int[][] { { 2, 24, 9, 27 }, { 4, 13, 11, 12 } });
		Matriz result = matrixA.multiplicacao(matrixB);
		assertEquals(expResult, result);
	}

	@Test
	public void multiplicacaoDifDim() {
		Matriz matrixA = new Matriz(new int[][] { { 5, 1, 2 }, { 3, 2, 2 } });
		Matriz matrixB = new Matriz(new int[][] { { 0, 5, 1, 6 }, { 2, -1, 4, -3 } });
		Matriz expResult = new Matriz(new int[][] { { 2, 24, 9, 27 }, { 4, 13, 11, 12 } });
		Matriz result = matrixA.multiplicacao(matrixB);
		assertNotEquals(expResult, result);
	}
}