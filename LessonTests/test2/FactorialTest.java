package test2;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise1.Factorial;

public class FactorialTest {

	@Test
	public void testfactorial0() throws Exception {
		assertEquals("O factorial de 1 � 1", Factorial.fac(1));
	}

	@Test(expected = Exception.class)
	public void testfactorial1() throws Exception {
		Factorial.fac(-2);
	}

}