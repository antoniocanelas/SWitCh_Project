package week3;

public class IsArrayElementsInMatrix {

	public static boolean isArrayElementsInMatrix(int[][] matrix, int[] array) throws Exception {
		boolean test = true;
		boolean testElem = true;
		if ((matrix.length == 0) || (array.length == 0))
			throw new Exception();

		for (int i = 0; i < array.length; i++) {
			test = (testElem && test);
			testElem = false;
			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix[row].length; col++) {
					if (matrix[row][col] == array[i])
						testElem = true;

				}
			}
		}
		return test;
	}
}
