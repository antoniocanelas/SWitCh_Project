package week3;

import static org.junit.Assert.*;
import org.junit.Test;

import week3.SymmetricArray;

public class SymmetricArrayTest {

	@Test
	public void symmetricArray() {
		int[] array = { 1, 2, 3, 4, 3, 2, 1 };
		assertEquals(true, SymmetricArray.arrayCapElem(array));
	}

	@Test
	public void notSymmetricArray() {
		int[] array = { 2, 2, 3, 4, 3, 2, 1 };
		assertEquals(false, SymmetricArray.arrayCapElem(array));
	}

}
