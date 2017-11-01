package week2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import week1.Factorial;

public class FactorialTest {

	@Test
	public void testfactorial0() throws Exception {
		assertEquals(1, Factorial.fac(1));
	}

	@Test(expected = Exception.class)
	public void testfactorial1() throws Exception {
		Factorial.fac(-2);
	}

}