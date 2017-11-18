package week3;

public class IsTriangleMatrix {

	public static void main(String[] args) {


	}

	public static boolean isQuadrada(int[][] matrix) {
		boolean isQuadrada = true;
		for (int numLinha = 0; numLinha < matrix.length; numLinha++) {
			if (matrix.length != matrix[numLinha].length) {
				return false;
			}
		}
		return isQuadrada;

	}

	public static boolean isTrianguloInferior(int[][] matrix) {
		boolean isTriangulo = true;
		for (int linha = 1; linha < matrix.length; linha++) {
			for (int coluna = 0; coluna < linha; coluna++) {
				if (matrix[linha][coluna] != 0)
					return false;
			}
		}

		return isTriangulo;

	}

	public static boolean isTrianguloSuperior(int[][] matrix) {
		boolean isTriangulo;
		isTriangulo = isTrianguloInferior(matrizTransposta(matrix));
		return isTriangulo;
	}

	public static int[][] matrizTransposta(int[][] matrix) {

		int[][] matrizTransposta = new int[matrix.length][matrix.length];
		for (int linha = 0; linha < matrix.length; linha++) {
			for (int coluna = 0; coluna < matrix.length; coluna++) {
				matrizTransposta[coluna][linha] = matrix[linha][coluna];
			}
		}
		return matrizTransposta;

	}
}
