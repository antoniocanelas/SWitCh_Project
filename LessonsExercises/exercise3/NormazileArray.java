package exercise3;

public class NormazileArray {

	public static void main(String[] args) {

	}

	public static double[] normazileArray(double[] array) throws Exception {

		double[] normazileArray = new double[array.length];
		double denominator = Denominator(array);
		try {
			if (denominator == 0)
				throw new Exception();
			for (int dimensionArray = 0; dimensionArray < array.length; dimensionArray++) {
				normazileArray[dimensionArray] = array[dimensionArray] / denominator;
			}
		} catch (Exception e) {
			throw new Exception();
		}

		return normazileArray;

	}

	public static boolean isVector(double[] array) {
		boolean isVector;
		isVector = true;
		if ((array.length == 0)) {
			isVector = false;
		}
		return isVector;
	}

	public static double Denominator(double[] array) {
		double Denominator;
		Denominator = 0;
		for (int dimensionArray = 0; dimensionArray < array.length; dimensionArray++) {
			Denominator = Denominator + Math.pow(array[dimensionArray], 2);
		}
		Denominator = Math.sqrt(Denominator);
		return Denominator;
	}

}
