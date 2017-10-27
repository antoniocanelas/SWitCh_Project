package exercise3;

public class IsArrayEqual {

	public static void main(String[] args) {

	}

	public static boolean isArrayEqual(int[] arrayA, int[] arrayB) {
		boolean isArrayEqual = true;
		if (arrayA.length != arrayB.length)
			isArrayEqual = false;
		int i = 0;
		while ((isArrayEqual == true) && (i < arrayA.length)) {

			if (arrayA[i] != arrayB[i])
				isArrayEqual = false;
			i++;
		}

		System.out.println(isArrayEqual);
		return isArrayEqual;

	}
}
