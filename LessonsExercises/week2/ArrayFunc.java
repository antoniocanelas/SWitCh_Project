package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFunc {

	public static void main(String[] args) throws Exception {

	}

	public static int numElem(double[] vector) {// a) o número de elementos num vector
		return vector.length;
	}

	public static double maiorElem(double[] vector) throws Exception {// b) o maior elemento de um vector
		double vecTest;
		try {
			vecTest = vector[0];
			for (int i = 0; i < vector.length; i++) {
				if (vector[i] > vecTest) {
					vecTest = vector[i];
				}
			}

		} catch (Exception e) {
			throw new Exception("Vector vazio" + e);
		}

		return vecTest;
	}

	public static double menorElem(double[] vector) throws Exception {// c) o menor elemento de um vector
		double vecTest;
		try {
			vecTest = vector[0];
			for (int i = 0; i < vector.length; i++) {
				if (vector[i] < vecTest) {
					vecTest = vector[i];
				}
			}
		} catch (Exception e) {
			throw new Exception("Vector vazio" + e);
		}

		return vecTest;
	}

	public static double somaElem(double[] vector) throws Exception {// d) o somatório de todos os números
		double somatorio;
		try {
			if (vector.length == 0)
				throw new Exception("Vector vazio");
			somatorio = 0;
			for (int i = 0; i < vector.length; i++) {
				somatorio = somatorio + vector[i];
			}
		} catch (Exception e) {
			throw new Exception("Vector vazio" + e);
		}
		return somatorio;
	}

	public static double somaPar(double[] vector) throws Exception {// e) o somatório de todos os números pares

		double somatorio;

		try {
			somatorio = 0;
			if (vector.length == 0)
				throw new Exception("Vector vazio");

			for (int i = 0; i < vector.length; i++) {
				if (vector[i] % 2 == 0) {
					somatorio = somatorio + vector[i];
				}
			}
		} catch (Exception e) {
			throw new Exception("Vector vazio");
		}

		return somatorio;
	}

	public static double somaMultn(double[] vector, int multn) throws Exception {// f) o somatório de todos os múltiplos
																					// de um número

		double multiplo = 0;
		try {
			if (vector.length == 0)
				throw new Exception("Vector vazio");
			for (int i = 0; i < vector.length; i++) {
				if (vector[i] % multn == 0) {
					multiplo += vector[i];
				}
			}
		} catch (Exception e) {
			throw new Exception("Vector vazio");
		}
		return multiplo;
	}

	public static boolean isVecEmpty(double[] vector) {// g) True caso o vector esteja vazio, False em caso contrário
		boolean teste = false;
		if (vector.length == 0)
			teste = true;
		return teste;
	}

	public static boolean isVectOneEl(double[] vector) {// h) True caso o vector contenha apenas um elemento, False em
														// caso contrário
		boolean teste = false;
		if (vector.length == 1)
			teste = true;
		return teste;
	}

	public static boolean isVectInt(double[] vector) throws Exception {// i) True se o vector tiver apenas elementos
																		// inteiros, False em caso contrário

		boolean teste = true;
		try {
			if (vector.length == 0)
				throw new Exception("Vector vazio");
			for (int i = 0; i < vector.length; i++) {
				teste = teste && (vector[i] - (int) vector[i] == 0);
			}
		} catch (Exception e) {
			throw new Exception("Vector vazio");
		}

		return teste;
	}

	public static boolean haveVectDoub(double[] vector) throws Exception {// j) True se o vector tiver elementos
																			// duplicados, False em caso contrário
		boolean teste = false;
		try {
			int i = 0;
			int n;
			if (vector.length == 0)
				throw new Exception("Vector vazio");
			while (i < vector.length && teste == false) {
				for (n = i + 1; n <= vector.length - 1; n++) {
					if (vector[i] == vector[n])
						teste = true;
				}

				i++;
			}

		} catch (Exception e) {
			throw new Exception("Vector vazio");
		}

		return teste;
	}

	public static List<Integer> multTres(int[] vector) {// a) retorne todos os múltiplos de 3
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 3 == 0) {
				result.add(vector[i]);
			}
		}

		return result;
	}

	public static List<Integer> multint(int[] vector, int inteiro) throws Exception {// b) retorne todos os múltiplos de
																						// um dado número inteiro
		List<Integer> result = new ArrayList<>();
		try {
			if (inteiro == 0)
				throw new Exception();
			for (int i = 0; i < vector.length; i++) {
				if (vector[i] % inteiro == 0)
					result.add(vector[i]);
			}
		} catch (Exception e) {
			throw new Exception("Denominador não pode ser 0!");
		}

		return result;
	}

	public static List<Integer> multTresCinco(int[] vector) {// c) retorne todos os múltiplos de 3 e 5
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 3 == 0 && vector[i] % 5 == 0)
				result.add(vector[i]);
		}

		return result;
	}

	public static List<Integer> multTxy(int[] vector, int x, int y) throws Exception {
		List<Integer> result = new ArrayList<>();

		try {
			if (x * y == 0)
				throw new Exception();
			for (int i = 0; i < vector.length; i++) {
				if (vector[i] % x == 0 && vector[i] % y == 0)
					result.add(vector[i]);
			}
		} catch (Exception e) {
			throw new Exception("Denominador não pode ser 0!");
		}

		return result;
	}

	public static Object multTxyInv(int[] vector, int x, int y) throws Exception {
		List<Integer> result = new ArrayList<>();

		try {
			if (x * y == 0)
				throw new Exception();
			for (int i = 0; i < vector.length; i++) {
				if (vector[i] % x == 0 && vector[i] % y == 0)
					result.add(vector[i]);
			}
			int[] array = new int[result.size()];
			for (int i = 0; i < result.size(); i++)
				array[i] = result.get(i);
			Arrays.sort(array);
		} catch (Exception e) {
			throw new Exception("Denominador não pode ser 0!");
		}

		return result;
	}
}