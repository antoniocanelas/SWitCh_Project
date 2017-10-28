package week2;

import static org.junit.Assert.*;

import org.junit.Test;

import week2.ArraysBubbleSort;

public class ArraysBubbleSortTest {

	@Test
	public void media0() throws Exception {
		int[] array = { 0, 2, 4 };
		assertEquals(2, ArraysBubbleSort.media(array), 0.01);

	}

	@Test
	public void media1() throws Exception {
		int[] array = { 0 };
		assertEquals(0, ArraysBubbleSort.media(array), 0.01);

	}

	@Test(expected = Exception.class)
	public void media2() throws Exception {
		int[] array = {};
		ArraysBubbleSort.media(array);

	}

	@Test
	public void desvPad0() throws Exception {
		int[] array = { 6, 2, 3, 1 };
		assertEquals(1.87, ArraysBubbleSort.desvPad(array), 0.01);

	}

	@Test(expected = Exception.class)
	public void desvPad1() throws Exception {
		int[] array = {};
		ArraysBubbleSort.desvPad(array);
	}

	@Test
	public void inverterOrdem0() throws Exception {
		double[] array = { 1, 2, 99, 4 };
		double[] expected = { 4, 99, 2, 1 };
		assertArrayEquals(expected, ArraysBubbleSort.inverterOrdem(array), 0.01);
	}

	@Test(expected = Exception.class)
	public void inverterOrdem1() throws Exception {
		double[] array = {};
		ArraysBubbleSort.inverterOrdem(array);
	}

	@Test
	public void bubbleSort0() throws Exception {
		double[] array = { 6, 5, 3, 4, 2, 1 };
		double[] expected = { 1, 2, 3, 4, 5, 6 };
		assertArrayEquals(expected, ArraysBubbleSort.bubbleSort(array), 0.01);
	}

	@Test(expected = Exception.class)
	public void bubbleSort1() throws Exception {
		double[] array = {};
		ArraysBubbleSort.bubbleSort(array);
	}

}