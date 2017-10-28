package week3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import week3.NormazileArray;;

public class NormazileArrayTest {
	double[] array0 = {};
	double[] array1 = new double[1];
	double[] array2 = { 3, 4 };
	double[] NormazileArray2 = { 0.6, 0.8 };
	double[] array3 = { 2, 2, 1 };
	double[] NormazileArray3 = { 2 / 3., 2 / 3., 1 / 3. };
	double[] array4 = { 0, 0, 0, 0 };

	// Is an array?
	@Test
	public void isVectorDim0() {
		assertFalse(NormazileArray.isVector(array0));
	}

	@Test
	public void isVectorDim1() {
		assertTrue(NormazileArray.isVector(array1));
	}

	@Test
	public void isVectorDim2() {
		assertTrue(NormazileArray.isVector(array2));
	}

	@Test
	public void isVectorDim3() {
		assertTrue(NormazileArray.isVector(array3));
	}

	@Test
	public void isVectorDim4() {
		assertTrue(NormazileArray.isVector(array4));
	}

	// Calculate Denominator
	@Test
	public void denominator2() {
		assertEquals(5, NormazileArray.Denominator(array2), 0.0001);
	}

	@Test
	public void denominator3() {
		assertEquals(3, NormazileArray.Denominator(array3), 0.0001);
	}

	// Calculate Normaziled Array
	@Test
	public void normazileArray2() throws Exception {
		assertArrayEquals(NormazileArray2, NormazileArray.normazileArray((array2)), 0.0001);
	}

	@Test
	public void normazileArray3() throws Exception {
		assertArrayEquals(NormazileArray3, NormazileArray.normazileArray((array3)), 0.0001);
	}

	@Test(expected = Exception.class)
	public void normazileArrayException() throws Exception {
		NormazileArray.normazileArray((array4));
	}

}
