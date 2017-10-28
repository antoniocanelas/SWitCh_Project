package week3;

public class MatrixToArray {

	public static int[] matrixToArray(int[][] matrix) throws Exception {
		int[] array = new int[(matrix.length)];
		if (matrix.length == 0)
			throw new Exception();
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {

				array[row] = array[row] + matrix[row][col];
			}

		}
		return array;
	}

}
