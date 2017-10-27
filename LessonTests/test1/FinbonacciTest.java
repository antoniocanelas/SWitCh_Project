package test1;

import static org.junit.Assert.*;

import org.junit.Test;
import exercise1.Fibonacci;

public class FinbonacciTest {

	@Test(expected = Exception.class)
	public void fibonacciNegativos() throws Exception {
		Fibonacci.fibonacci(-20);
	}

	@Test
	public void fibonacci1() throws Exception {
		assertEquals(0, Fibonacci.fibonacci(1));
	}

	@Test
	public void fibonacci2() throws Exception {
		assertEquals(1, Fibonacci.fibonacci(2));
	}

	@Test
	public void fibonacci3() throws Exception {
		assertEquals(1, Fibonacci.fibonacci(3));
	}

	@Test
	public void fibonacci94() throws Exception {
		assertEquals(144, Fibonacci.fibonacci(13));
	}
}
