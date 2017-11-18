package week2;

public class ArraysBubbleSort {

    public static void main(String[] args) {

    }

    public static double media(int[] array) throws Exception {

	double media = 0;
	try {
	    if (array.length == 0) {
		throw new Exception();
	    }
	    for (int i = 0; i < array.length; i++) {
		media += array[i];
	    }
	    media = media / array.length;
	} catch (Exception e) {
	    throw new Exception();
	}
	return media;
    }

    public static double desvPad(int[] array) throws Exception {

	double media = media(array);
	double somaQuadDist = 0;
	for (int i = 0; i < array.length; i++) {
	    somaQuadDist += Math.pow(array[i] - media, 2);
	}
	double desvPad = Math.sqrt(somaQuadDist / array.length);
	return desvPad;
    }

    public static double[] inverterOrdem(double[] array) throws Exception {

	double[] inverterOrdem = new double[array.length];
	try {
	    if (array.length == 0) {
		throw new Exception();
	    }
	    for (int i = 0; i < array.length; i++) {
		inverterOrdem[i] = array[array.length - 1 - i];
	    }
	} catch (Exception e) {
	    throw new Exception();
	}
	return inverterOrdem;
    }

    public static double[] bubbleSort(double[] array) throws Exception {

	double aux;
	boolean flag = true;
	try {
	    while (flag) {
		flag = false;
		if (array.length < 2) {
		    throw new Exception();
		}

		for (int j = 0; j < (array.length - 1); j++) {
		    if (array[j] > array[j + 1]) {
			aux = array[j];
			array[j] = array[j + 1];
			array[j + 1] = aux;
			flag = true;
		    }
		}
	    }
	} catch (Exception e) {
	    throw new Exception();
	}

	return array;
    }
}
