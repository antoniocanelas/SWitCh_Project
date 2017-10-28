package week3;

import static org.junit.Assert.*;

import org.junit.Test;

import week3.SomaAlgarismoNumero;

public class SomaAlgarismoNumeroTest {

	@Test
	public void testNove() {
		assertEquals(9, SomaAlgarismoNumero.somaAlgarismoNumero(135));
	}

	@Test
	public void testNegativoNove() {
		assertEquals(9, SomaAlgarismoNumero.somaAlgarismoNumero(-135));
	}

	@Test
	public void testOitoFalso() {
		assertNotEquals(8, SomaAlgarismoNumero.somaAlgarismoNumero(135));
	}
}
