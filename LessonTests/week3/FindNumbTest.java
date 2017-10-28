package week3;

import static org.junit.Assert.*;

import org.junit.Test;

import week3.FindNumb;

public class FindNumbTest {

	@Test
	public void existe() {
		int[] array = { 0, 1, 2, 3, 5, 20 };
		assertEquals(4, FindNumb.findNumber(5, array));

	}

	@Test
	public void naoExiste() {
		int[] array = { 0, 1, 2, 3, 4, 5 };
		assertEquals(-1, FindNumb.findNumber(6, array));

	}

	@Test
	public void repetido() {
		int[] array = { 0, 1, 2, 5, 4, 5 };
		assertEquals(3, FindNumb.findNumber(5, array));

	}

}
