package exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class AlgoritmiaArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira primeiro inteiro do intervalo: ");
		int limInf = input.nextInt();
		System.out.println("\nInsira segundo inteiro do intervalo: ");
		int limSup = input.nextInt();
		int[] intDef = intDef(limInf, limSup);
		System.out.println(Arrays.toString(intDef));

		// a)
		System.out.println("\na)Liste todos os m�ltiplos de 3 num intervalo dado");
		int[] mult3 = mult3(intDef);
		System.out.println(Arrays.toString(mult3));
		// a)

		// b)
		System.out.println("\nb)Liste todos os m�ltiplos de um dado n�mero inteiro num intervalo dado");
		System.out.println("\nInsira inteiro para testar m�ltiplos: ");
		int testmult = input.nextInt();
		int[] multip = multip(intDef, testmult);
		System.out.println(Arrays.toString(multip));
		// b)

		// c)
		System.out.println("\nc) Lista dos m�ltiplos de 3 e 5");
		int[] mult35 = mult35(intDef);
		System.out.println(Arrays.toString(mult35));
		// c)

		// d)
		System.out.println("\nd) Liste todos os m�ltiplos de dois n�meros inteiros num intervalo dado");
		System.out.println("\nInsira 1� inteiro para testar m�ltiplos: ");
		int testmultx = input.nextInt();
		System.out.println("\nInsira 2� inteiro para testar m�ltiplos: ");
		int testmulty = input.nextInt();
		int[] multxy = multxy(intDef, testmultx, testmulty);
		System.out.println(Arrays.toString(multxy));
		// d)

		// e)
		System.out.println(
				"\ne)Liste todos os m�ltiplos de dois n�meros inteiros num intervalo dado, mas por ordem decrescente");
		System.out.println("\nInsira 1� inteiro para testar m�ltiplos: ");
		int testmultxdec = input.nextInt();
		System.out.println("\nInsira 2� inteiro para testar m�ltiplos: ");
		int testmultydec = input.nextInt();
		int[] multxydec = multxydec(intDef, testmultxdec, testmultydec);
		System.out.println(Arrays.toString(multxydec));

		// 2a)
		System.out.println("\2a)Pares das al�neas anteriores");
		int somaPares = somaPares(mult3);
		System.out.println("a)somaPares= " + somaPares);
		somaPares(multip);
		System.out.println("b)somaPares= " + somaPares(multip));
		somaPares(multip);
		System.out.println("b)somaPares= " + somaPares(mult35));
		somaPares(multip);
		System.out.println("b)somaPares= " + somaPares(multxy));
		somaPares(multip);
		System.out.println("b)somaPares= " + somaPares(multxydec));
		input.close();
	}

	public static int[] intDef(int limInf, int limSup) { // defini��o de array com todos os n�meros do intervalo

		int[] intDef;
		intDef = new int[limSup - limInf + 1];

		for (int i = 0; i < limSup - limInf + 1; i++) {
			intDef[i] = i + limInf;
		}

		return intDef;
	}

	public static int[] mult3(int[] intDef) {
		// IN�CIO a)Liste todos os m�ltiplos de 3 num intervalo dado

		int contRes = 0;
		for (int i = 0; i < intDef.length; i++) {

			if (intDef[i] % 3 == 0) {
				intDef[contRes] = intDef[i];
				contRes++;
			}
		}

		int[] mult3;
		mult3 = new int[contRes];

		for (int i = 0; i < contRes; i++) {
			mult3[i] = intDef[i];
		}
		return mult3;
		// FIM - a) Liste todos os m�ltiplos de 3 num intervalo dado
	}

	public static int[] multip(int[] intDef, int testmult) {// IN�CIO - b)Liste todos os m�ltiplos de um dado n�mero
															// inteiro num intervalo dado

		int contRes = 0;
		for (int i = 0; i < intDef.length; i++) {

			if (intDef[i] % testmult == 0) {
				intDef[contRes] = intDef[i];
				contRes++;
			}
		}

		int[] multip;
		multip = new int[contRes];

		for (int i = 0; i < contRes; i++) {
			multip[i] = intDef[i];
		}

		return multip;
		// FIM - b)Liste todos os m�ltiplos de um dado n�mero inteiro num intervalo dado
	}

	public static int[] mult35(int[] intDef) {// IN�CIO - c) Lista dos m�ltiplos de 3 e 5

		int contRes = 0;
		for (int i = 0; i < intDef.length; i++) {

			if (intDef[i] % 3 == 0 && intDef[i] % 5 == 0) {
				intDef[contRes] = intDef[i];
				contRes++;
			}
		}

		int[] mult35;
		mult35 = new int[contRes];

		for (int i = 0; i < contRes; i++) {
			mult35[i] = intDef[i];
		}

		return mult35;
		// FIM - c) Lista dos m�ltiplos de 3 e 5
	}

	public static int[] multxy(int[] intDef, int testmultx, int testmulty) {// IN�CIO - d) Liste todos os m�ltiplos de
																			// dois n�meros inteiros num intervalo dado

		int contRes = 0;
		for (int i = 0; i < intDef.length; i++) {

			if (intDef[i] % testmultx == 0 && intDef[i] % testmulty == 0) {
				intDef[contRes] = intDef[i];
				contRes++;
			}
		}

		int[] multxy;
		multxy = new int[contRes];

		for (int i = 0; i < contRes; i++) {
			multxy[i] = intDef[i];
		}

		return multxy;
		// FIM - d) Liste todos os m�ltiplos de dois n�meros inteiros num intervalo dado
	}

	public static int[] multxydec(int[] intDef, int testmultxdec, int testmultydec) {// IN�CIO - d) Liste todos os
																						// m�ltiplos de dois n�meros
																						// inteiros num intervalo dado
		int contRes = 0;
		for (int i = 0; i < intDef.length; i++) {

			if (intDef[i] % testmultxdec == 0 && intDef[i] % testmultydec == 0) {
				intDef[contRes] = intDef[i];
				contRes++;
			}
		}

		int[] multxydec;
		multxydec = new int[contRes];

		for (int i = 0; i < contRes; i++) {
			multxydec[i] = intDef[contRes - i - 1];
		}

		return multxydec;

	}
	// FIM - d) Liste todos os m�ltiplos de dois n�meros inteiros num intervalo dado

	public static int somaPares(int[] testArray) {// IN�CIO - 2a)Pares das al�neas anteriores

		// FIM - b)Liste todos os m�ltiplos de um dado n�mero inteiro num intervalo dado

		int somaPares = 0;

		for (int i = 0; i < testArray.length; i++) {
			if (testArray[i] % 2 == 0) {
				somaPares = somaPares + testArray[i];
			}
		}
		return somaPares;

	}

}
