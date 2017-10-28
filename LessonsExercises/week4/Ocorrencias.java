package week4;

public class Ocorrencias {
	public static int ocorrencias(char[][] matriz, char c) {
		int numero = 0;

		for (int line = 0; line < matriz.length; line++) {
			for (int col = 0; col < matriz[0].length; col++) {
				if (matriz[line][col] == c) {
					numero++;
				}
			}
		}

		return numero;

	}

	public 	static int[] xadrez(char[][] matrizXadrez){
		int[] resultado = {0,0,0};

		resultado[0] = ocorrencias(matrizXadrez, 'P');
		resultado[1] = ocorrencias(matrizXadrez, 'B');
		resultado[2] = ocorrencias(matrizXadrez, 'L');
		return resultado;
		

	}
	
	public 	static int[] xadrezReis(char[][] matrizXadrez){
		int[] resultado = {0,0,0,0,0};

		resultado[0] = ocorrencias(matrizXadrez, 'P');
		resultado[1] = ocorrencias(matrizXadrez, 'B');
		resultado[2] = ocorrencias(matrizXadrez, 'L');
		resultado[3] = ocorrencias(matrizXadrez, 'r');
		resultado[4] = ocorrencias(matrizXadrez, 'R');

		return resultado;
		

	}
}
