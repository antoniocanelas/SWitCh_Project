package exercise1;

public class Fibonacci {

	public static int fibonacci(int ordem) throws Exception {
		int ultimo = 1;
		int penultimo = 0;
		int fibonacci = 0;
		try {
			if (ordem < 1)
				throw new Exception();
			else if (ordem == 1)
				fibonacci = 0;
			else if (ordem == 2)
				fibonacci = 1;
			else {
				for (int i = 3; i <= ordem; i++) {
					fibonacci = ultimo + penultimo;
					penultimo = ultimo;
					ultimo = fibonacci;
				}

			}

		} catch (Exception e) {
			throw new Exception("Fibonacci de números ordem maior que 0");
		}
		return fibonacci;
	}
}
