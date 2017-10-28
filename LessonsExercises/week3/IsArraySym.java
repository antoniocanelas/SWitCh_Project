package week3;

public class IsArraySym {

	public static void main(String[] args) {

	}

	public static boolean isArraySym(int[] arrayA, int[] arrayB) {
		boolean isArrayEqual = true;
		if (arrayA.length != arrayB.length)
			isArrayEqual = false;
		int i = 0;
		while ((isArrayEqual == true) && (i < arrayA.length)) {

			if (arrayA[i] != arrayB[arrayA.length - i - 1])
				isArrayEqual = false;
			i++;
		}

		System.out.println(isArrayEqual);
		return isArrayEqual;

	}
}
