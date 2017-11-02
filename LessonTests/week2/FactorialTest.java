package week2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import week1.FactorialNaoRecursivo;

public class FactorialTest {

	@Test
	public void testfactorial0() throws Exception {
		assertEquals(1, FactorialNaoRecursivo.fac(1));
	}

	@Test(expected = Exception.class)
	public void testfactorial1() throws Exception {
		FactorialNaoRecursivo.fac(-2);
	}

}