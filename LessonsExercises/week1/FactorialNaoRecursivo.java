package week1;

public class FactorialNaoRecursivo {
	public static int fac(int num) throws Exception {
		int fac = 1;
		if (num >= 0) {
			for (int i = 1; i <= num; i++) {
				fac = fac * i;
			}
		} else {
			throw new Exception("N�o existe factorial de n�meros negativos");
		}
		return fac;
	}
}
