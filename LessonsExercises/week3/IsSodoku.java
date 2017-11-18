package week3;

public class IsSodoku {
	public static void main(String[] args) {


	}

	public static boolean isSudokuSolved(int[][] jogo) {
		if (!isQuadradaNove(jogo))
			return false;
		if (!areLinhasCorrectas(jogo))
			return false;
		if (!areColunasCorrectas(jogo))
			return false;
		if (!areSubMatrizesCorrectas(jogo))
			return false;

		return true;
	}

	public static boolean areLinhasCorrectas(int[][] jogo) {
		int[] linha;
		
		for (int i = 0; i < 9; i++) {
			linha = jogo[i];
			if (!isVectorCorrecto(linha))
				return false;
		}
		return true;

	}

	public static boolean areColunasCorrectas(int[][] jogo) {

		int[] linha;
		
		for (int i = 0; i < 9; i++) {
			linha = transposta(jogo, i);
			if (!isVectorCorrecto(linha))
				return false;
		}
		return true;

	}

	public static boolean areSubMatrizesCorrectas(int[][] jogo) {
		int[] linha;
		for (int i = 0; i < 9; i++) {
			linha = transforma(jogo)[i];
			if (!isVectorCorrecto(linha))
				return false;
		}
		return true;

	}

	public static int[][] transforma(int[][] jogo) {
		int[][] aux = new int[9][9];
		int ind = 0;

		for (int linhaSM = 0; linhaSM < 9; linhaSM += 3) {// retorna o indice de linha do primeiro elementos de cada SM;
			for (int colunaSM = 0; colunaSM < 9; colunaSM += 3) {// retorna correspondente indice de coluna;

				int[] linhaNova = new int[9];

				linhaNova = transformarSMLinha(jogo, linhaSM, colunaSM);
				aux[ind] = linhaNova;
				ind++;

			}
		}
		return aux;

	}

	public static int[] transformarSMLinha(int[][] jogo, int linhaSM, int colunaSM) {// cria linhas da SM
		int[] linhaTest = new int[9];
		int indice = 0;
		for (int lSM = 0 + linhaSM; lSM < 3 + linhaSM; lSM++) {
			for (int cSM = 0 + colunaSM; cSM < 3 + colunaSM; cSM++) {
				linhaTest[indice] = jogo[lSM][cSM];
				indice++;
			}
		}

		return linhaTest;

	}

	public static boolean isVectorCorrecto(int[] vector) {
		int[] aux = new int[9];
		for (int i = 0; i < 9; i++) {
			if (aux[vector[i] - 1] != 0)
				return false;
			aux[vector[i] - 1] = vector[i];
		}
		return true;
	}

	public static boolean isQuadradaNove(int[][] jogo) {
		if (jogo.length != 9)
			return false;
		for (int i = 0; i < 9; i++) {
			if (jogo[i].length != 9)
				return false;
		}
		return true;
	}

	public static int[] transposta(int[][] jogo, int i) {
		int[] transposta = new int[9];
		for (int j = 0; j < 9; j++) {
			transposta[j] = jogo[j][i];
		}
		return transposta;

	}
}
