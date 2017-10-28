package week1;

public class Capicua {

	public static boolean capicua(int numero) {
		int temp = numero;
		int inverso = 0;
		if (numero / 10 == 0)
			inverso = numero;
		while (temp != 0) {
			inverso = inverso * 10 + temp % 10;
			temp = temp / 10;
		}
		return inverso == numero;

	}
}
