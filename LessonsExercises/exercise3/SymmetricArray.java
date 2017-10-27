package exercise3;

public class SymmetricArray {

	public static void main(String[] args) {
	}

	public static boolean arrayCapElem(int[] array) {
		int n = array.length;
		boolean isArraySym = true;
		int i = 0;
		int j = array.length - 1;
		for (i = 0; i < n; i++) {
			if (array[i] != array[j])
				isArraySym = false;
			j--;
		}
		System.out.println(isArraySym);
		return isArraySym;

	}

}
