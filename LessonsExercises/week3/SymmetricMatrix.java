package week3;

public class SymmetricMatrix {

	public static void main(String[] args) {

	}

	public static boolean symmetricMatrix(int[][] matrix){
		boolean symmetricMatrix=true;
		for (int indexDiagonal=1; indexDiagonal<matrix.length;indexDiagonal++) {
			for (int indexElemento=1;indexElemento<=indexDiagonal;indexElemento++) {
				if (matrix[indexDiagonal][indexElemento]!=matrix[indexElemento][indexDiagonal]) return false;
			}
		}
		
		return symmetricMatrix;
	
	}
	
	public static int[][] matrizTransposta(int[][] matrix) {
		
		int[][] matrizTransposta = new int[matrix.length][matrix.length];
		for (int linha=0;linha<matrix.length;linha++) {
			for (int coluna=0;coluna<matrix.length;coluna++) {
				matrizTransposta[coluna][linha]=matrix[linha][coluna];
			}
		}
		return matrizTransposta;
	
	}
	

	public static boolean isQuadrada(int[][] matrix) {
		boolean isQuadrada = true;
		for (int numLinha=0;numLinha<matrix.length;numLinha++) {
			if(matrix.length!=matrix[numLinha].length) {
				return false;
			}
		}
		return isQuadrada;
		
	}

}
