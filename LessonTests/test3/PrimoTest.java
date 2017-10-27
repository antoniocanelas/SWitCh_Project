package test3;

import static org.junit.Assert.*;
import exercise3.*;

import org.junit.Test;

public class PrimoTest {

	@Test(expected = Exception.class)
	public void testNegativo() throws Exception {
		assertTrue(Primo.primo(-1));
	}

	@Test
	public void testZero() throws Exception {
		assertFalse(Primo.primo(0));
	}

	@Test
	public void testUm() throws Exception {
		assertFalse(Primo.primo(1));
	}

	@Test
	public void testPrimo() throws Exception {
		assertTrue(Primo.primo(269));
	}
}
