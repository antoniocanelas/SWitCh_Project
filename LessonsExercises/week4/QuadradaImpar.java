package week4;

public class QuadradaImpar {

    public static boolean isQuadrada(int[][] matriz) {

	boolean isQuadrada = true;
	if (matriz.length != matriz[0].length) {
	    isQuadrada = false;
	}
	return isQuadrada;

    }

    public static boolean isImpar(int[][] matriz) {

	if (matriz.length % 2 != 0) {
	    return false;
	}

	return true;

    }

    public static int somaCantosECentro(int[][] matriz) {

	int somaCantosECentro;
	somaCantosECentro = matriz[0][0] + matriz[0][matriz[0].length - 1] + matriz[matriz.length - 1][0]
		+ matriz[matriz.length - 1][matriz[0].length - 1] + matriz[matriz.length / 2][matriz[0].length / 2];

	return somaCantosECentro;

    }

}
