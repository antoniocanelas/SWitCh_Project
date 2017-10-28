package week3;

public class FindNumb {

	public static void main(String[] args) {
	}

	public static int findNumber(int findnumb, int[] array) {
		int posicao = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findnumb && (posicao == -1))
				posicao = i;
		}

		return posicao;

	}

}
