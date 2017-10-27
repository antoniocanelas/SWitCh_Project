package test4;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise4.QuadradaImpar;



public class QuadradaImparTest {
	int[][] matrizTeste = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
	
	int[][] matrizTesteErro = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};

	@Test
	public void isQuadradaTrue() {
		assertTrue(QuadradaImpar.isQuadrada(matrizTeste));
	}
	
	@Test
	public void isQuadradaFalse() {
		assertFalse(QuadradaImpar.isQuadrada(matrizTesteErro));
	}

	
	@Test
	public void isImparTrue() {
		assertTrue(QuadradaImpar.isImpar(matrizTesteErro));
	}
	
	@Test
	public void isImparFalse() {
		assertFalse(QuadradaImpar.isImpar(matrizTeste));
	}
	
	@Test
	public void somaCantosECentro() {
		assertEquals(5, QuadradaImpar.somaCantosECentro(matrizTeste));
	}
	
	
	
	
	
}
