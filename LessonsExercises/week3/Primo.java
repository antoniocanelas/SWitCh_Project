package week3;

public class Primo {

	public static void main(String[] args) {
	}

	public static boolean primo(int numero) throws Exception {
		boolean primo = true;

		try {
			if (numero < 0)
				throw new Exception();
			if (numero == 0)
				primo = false;
			else if (numero == 1)
				primo = false;
			else {
				int i = 2;
				while (i < numero && primo == true) {
					if (numero % 2 == 0)
						primo = false;
					i++;
				}
			}

		} catch (Exception e) {
			throw new Exception();
		}

		return primo;
	}

}
