package week3;

public class SomaAlgarismoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int somaAlgarismoNumero(int numero){
		int soma;
		soma=0;
		numero=(Math.abs(numero));
	
		while (numero/10 !=0) {
			soma=numero%10+soma;
			numero=numero/10;
		}
		soma=soma+numero;
		return soma;

	}
}