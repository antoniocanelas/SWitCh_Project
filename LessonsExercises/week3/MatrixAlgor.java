package week3;

public class MatrixAlgor {

	public static boolean matrixSymP(int[][] matrix) {
		boolean teste = true;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] != matrix[col][row])
					teste = false;
			}
		}
		return teste;
	}

	public static boolean matrixSymS(int[][] matrix) {
		boolean teste = true;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] != matrix[matrix.length - col - 1][matrix.length - row - 1])
					teste = false;
			}
		}
		return teste;
	}

}