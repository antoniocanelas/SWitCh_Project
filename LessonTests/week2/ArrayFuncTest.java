package week2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import week2.ArrayFunc;

public class ArrayFuncTest {

	// a) o número de elementos num vector
	@Test
	public void numElem0() {
		double[] vector = { 1, 2, 3 };
		assertEquals("Elementos", 3, ArrayFunc.numElem(vector));
	}

	@Test
	public void numElem1() {
		double[] vector = {};
		assertEquals("Um vector {} tem 0 elementos", 0, ArrayFunc.numElem(vector));
	}

	// b) o maior elemento de um vector
	@Test
	public void maiorElem0() throws Exception {
		double[] vector = { -1, 2, 3 };
		assertEquals("Maior:", 3, ArrayFunc.maiorElem(vector), 0.2);
	}

	@Test(expected = Exception.class)
	public void maiorElem1() throws Exception {
		double[] vector = {};
		ArrayFunc.maiorElem(vector);
	}

	// c) o menor elemento de um vector
	@Test
	public void menorElem0() throws Exception {
		double[] vector = { 1, -2, 3 };
		assertEquals("Menor:", -2, ArrayFunc.menorElem(vector), 0.2);
	}

	@Test(expected = Exception.class)
	public void menorElem1() throws Exception {
		double[] vector = {};
		ArrayFunc.menorElem(vector);
	}

	// d) o somatório de todos os números
	@Test
	public void somaElem0() throws Exception {
		double[] vector = { 1, -2, 3 };
		assertEquals("Soma:", 2, ArrayFunc.somaElem(vector), 0.2);
	}

	@Test(expected = Exception.class)
	public void somaElem1() throws Exception {
		double[] vector = {};
		ArrayFunc.somaElem(vector);
	}

	// e) o somatório de todos os números pares
	@Test
	public void somaPar0() throws Exception {
		double[] vector = { 1, -2, 3 };
		assertEquals("Soma:", -2, ArrayFunc.somaPar(vector), 0.2);
	}

	@Test(expected = Exception.class)
	public void somaPar1() throws Exception {
		double[] vector = {};
		ArrayFunc.somaPar(vector);
	}

	// f) o somatório de todos os múltiplos de um número
	@Test
	public void somaMultn0() throws Exception {
		double[] vector = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int multiplo = 3;
		assertEquals("Soma Multúplos n:", 18, ArrayFunc.somaMultn(vector, multiplo), 0.2);
	}

	@Test(expected = Exception.class)
	public void somaMultn1() throws Exception {
		double[] vector = {};
		int multiplo = 1;
		ArrayFunc.somaMultn(vector, multiplo);
	}

	// g) True caso o vector esteja vazio, False em caso contrário

	@Test
	public void isVecEmpty0() {
		double[] vector = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals("Vector não vazio:", false, ArrayFunc.isVecEmpty(vector));
	}

	@Test
	public void isVecEmpty1() {
		double[] vector = {};
		assertEquals("Vector vazio:", true, ArrayFunc.isVecEmpty(vector));
	}

	// h) True caso o vector contenha apenas um elemento, False em caso contrário
	@Test
	public void isvectUmEl0() {
		double[] vector = { 1, -2, 3 };
		assertEquals("O vector não é de 1 elemento:", false, ArrayFunc.isVectOneEl(vector));
	}

	@Test
	public void isvectUmEl1() {
		double[] vector = { 1 };
		assertEquals("Vector de 1 elemento:", true, ArrayFunc.isVectOneEl(vector));
	}

	// i) True se o vector tiver apenas elementos inteiros, False em caso contrário

	@Test
	public void isvectInt0() throws Exception {
		double[] vector = { 1, -2, 3.2 };
		assertEquals("Existem elementos não inteiros", false, ArrayFunc.isVectInt(vector));
	}

	@Test
	public void isVectInt1() throws Exception {
		double[] vector = { 1, 2, 3, 4 };
		assertEquals("Apenas elementos inteiros", true, ArrayFunc.isVectInt(vector));
	}

	@Test(expected = Exception.class)
	public void isVectInt2() throws Exception {
		double[] vector = {};
		assertEquals("Apenas elementos inteiros", true, ArrayFunc.isVectInt(vector));
	}

	// j) True se o vector tiver elementos duplicados, False em caso contrário
	@Test
	public void haveVectDoub0() throws Exception {
		double[] vector = { 1, 2, 3, 1 };
		assertEquals("Existem elementos duplicados", true, ArrayFunc.haveVectDoub(vector));
	}

	@Test
	public void haveVectDoub1() throws Exception {
		double[] vector = { 1, -2, 3 };
		assertEquals("Não existem elementos duplicados", false, ArrayFunc.haveVectDoub(vector));
	}

	@Test
	public void haveVectDoub2() throws Exception {
		double[] vector = { 1 };
		assertEquals("Não existem elementos duplicados", false, ArrayFunc.haveVectDoub(vector));
	}

	@Test(expected = Exception.class)
	public void haveVectDoub3() throws Exception {
		double[] vector = {};
		ArrayFunc.haveVectDoub(vector);
	}

	// a) retorne todos os múltiplos de 3
	@Test
	public void multTres0() {
		int[] vector = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> result = new ArrayList<>(Arrays.asList(3, 6, 9));
		assertEquals("Múltiplos de 3:", result, ArrayFunc.multTres(vector));
	}

	@Test
	public void multTres1() {
		int[] vector = { 1, 2, 3 };
		List<Integer> result = new ArrayList<>(Arrays.asList(3));
		assertEquals("Múltiplos de 3:", result, ArrayFunc.multTres(vector));
	}

	// b) retorne todos os múltiplos de um dado número inteiro
	@Test
	public void multint0() throws Exception {
		int[] vector = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));
		assertEquals("Múltiplos:", result, ArrayFunc.multint(vector, 2));
	}

	@Test
	public void multint1() throws Exception {
		int[] vector = { 2 };
		List<Integer> result = new ArrayList<>(Arrays.asList(2));
		assertEquals("Múltiplos:", result, ArrayFunc.multint(vector, 2));
	}

	@Test(expected = Exception.class)
	public void multint2() throws Exception {
		int[] vector = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayFunc.multint(vector, 0);
	}

	// c) retorne todos os múltiplos de 3 e 5

	@Test
	public void multTresCinco0() throws Exception {
		int[] vector = { 1, 15, 30, 2 };
		List<Integer> result = new ArrayList<>(Arrays.asList(15, 30));
		assertEquals("Múltiplos:", result, ArrayFunc.multTresCinco(vector));
	}

	@Test
	public void multTresCinco1() throws Exception {
		int[] vector = {};
		List<Integer> result = new ArrayList<>(Arrays.asList());
		assertEquals("Múltiplos:", result, ArrayFunc.multTresCinco(vector));
	}

	@Test
	public void multTresCinco2() throws Exception {
		int[] vector = { 15 };
		List<Integer> result = new ArrayList<>(Arrays.asList(15));
		assertEquals("Múltiplos:", result, ArrayFunc.multTresCinco(vector));
	}
	// d) retorne todos os múltiplos de dois números inteiros

	@Test
	public void multTxy0() throws Exception {
		int[] vector = { 1, 15, 30, 2 };
		int x = 5, y = 3;
		List<Integer> result = new ArrayList<>(Arrays.asList(15, 30));
		assertEquals("Múltiplos:", result, ArrayFunc.multTxy(vector, x, y));
	}

	@Test
	public void multTxy1() throws Exception {
		int[] vector = {};
		int x = 2, y = 3;
		List<Integer> result = new ArrayList<>(Arrays.asList());
		assertEquals("Múltiplos:", result, ArrayFunc.multTxy(vector, x, y));
	}

	@Test(expected = Exception.class)
	public void multTxy2() throws Exception {
		int[] vector = { 15 };
		int x = 0, y = 3;
		List<Integer> result = new ArrayList<>(Arrays.asList(15));
		assertEquals("Múltiplos:", result, ArrayFunc.multTxy(vector, x, y));
	}

	// e) retorne todos os múltiplos de dois números inteiros num intervalo dado,
	// mas por ordem decrescente

	@Test
	public void multTxyInv0() throws Exception {
		int[] vector = { 15 };
		int x = 5, y = 3;
		List<Integer> result = new ArrayList<>(Arrays.asList(15));
		assertEquals("Múltiplos:", result, ArrayFunc.multTxyInv(vector, x, y));
	}

	@Test
	public void multTxyInv1() throws Exception {
		int[] vector = { 1, 6, 12, 18, 23, 2 };
		int x = 2, y = 3;
		List<Integer> result = new ArrayList<>(Arrays.asList(6, 12, 18));
		assertEquals("Múltiplos:", result, ArrayFunc.multTxyInv(vector, x, y));
	}

	@Test(expected = Exception.class)
	public void multTxyInv2() throws Exception {
		int[] vector = { 1, 6, 12, 18, 23, 2 };
		int x = 0, y = 3;
		List<Integer> result = new ArrayList<>(Arrays.asList(15));
		assertEquals("Múltiplos:", result, ArrayFunc.multTxyInv(vector, x, y));
	}

}
