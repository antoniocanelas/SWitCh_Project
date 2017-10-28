package week4;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import week4.Fotografia;


public class FotografiaTest {
	int[][] fotografia1 = { { 1,1,1,1,1 }, { 1,1,1,1,1 }, { 1,1,1,1,1 }, { 1,1,1,1,1 },{ 1,1,1,1,1 } };
	int[][] fotografiaManipulada = { { 1,1,1,1,1 }, { 1,1,1,1,1 }, { 1,1,1,1,1 }, { 1,1,1,1,1 },{ 1,1,1,1,1 } };
	int[][] fotografia2 = { { 1,1,1,1,1 }, { 1,1,2,1,1 }, { 1,2,1,2,1 }, { 1,1,2,1,1 },{ 1,1,1,1,1 } };
	int[][] fotografia3 = { { 1,1,1,1,1 }, { 1,1,2,1,1 }, { 256,256,256,256,256 }, { 1,1,2,1,1 },{ 1,1,1,1,1 } };
	int[][] fotografia4 = { { 0,0,0,0,0 }, { 0,0,0,0,0 }, { 0,0,0,0,0 }, { 0,0,0,0,0 },{ 0,0,0,0,0 } };

	
	//Testes fotografiaManipuladaQuatro(cálculo de médias) 
	@Test
	public void fotografia1() {
		assertArrayEquals(fotografiaManipulada,Fotografia.fotografiaManipuladaQuatro(fotografia1));
	}
	
	@Test
	public void fotografia2() {
		assertEquals(2,Fotografia.fotografiaManipuladaQuatro(fotografia2)[2][2]);
	}
	
	@Test
	public void fotografia3() {
		assertEquals(129,Fotografia.fotografiaManipuladaQuatro(fotografia3)[2][2]);
	}
	
	@Test
	public void fotografia4() {
		assertArrayEquals(fotografia4,Fotografia.fotografiaManipuladaQuatro(fotografia4));
	}

	@Test
	public void array4() {
		assertArrayEquals(fotografiaManipulada,Fotografia.fotografiaManipuladaQuatro(fotografia1));
	}

	//Testes fotografiaManipuladaNove(cálculo de médias) 
	@Test
	public void fotografiaNove1() {
		assertEquals(1,Fotografia.fotografiaManipuladaNove(fotografia1)[2][2]);
	}
	
	@Test
	public void fotografiaNove2() {
		assertEquals(1,Fotografia.fotografiaManipuladaNove(fotografia2)[2][2]);
	}
	
	@Test
	public void fotografiaNove3() {
		System.out.println(Fotografia.fotografiaManipuladaNove(fotografia3)[2][2]);
		System.out.println(Arrays.toString(Fotografia.fotografiaManipuladaNove(fotografia3)[2]));

		assertEquals(86,Fotografia.fotografiaManipuladaNove(fotografia3)[2][2]);
	}
	
	@Test
	public void fotografiaNove4() {
		assertEquals(0,Fotografia.fotografiaManipuladaNove(fotografia4)[2][2]);
	}

	@Test
	public void array9() {
		assertArrayEquals(fotografiaManipulada,Fotografia.fotografiaManipuladaNove(fotografia1));
	}

}
