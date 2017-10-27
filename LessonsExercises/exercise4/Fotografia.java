package exercise4;

public class Fotografia {

	public static void main(String[] args) {


	}
	
	
	public static int[][] fotografiaManipuladaQuatro (int[][] fotografia){
		int[][]fotografiaManipulada = new int [fotografia.length][fotografia[0].length];
	
		for (int linha=1; linha<fotografia.length-1;linha++) {
			for (int coluna=1;coluna<fotografia[0].length-1;coluna++) {
				fotografiaManipulada[linha][coluna]=(fotografia[linha-1][coluna]+fotografia[linha+1][coluna]+fotografia[linha][coluna-1]+fotografia[linha][coluna+1])/4;
				
			}	
		}
		copiarBorda(fotografia,fotografiaManipulada);
		
		return fotografiaManipulada;
		
	}
	
	public static int[][] fotografiaManipuladaNove (int[][] fotografia){
		int[][]fotografiaManipulada = new int [fotografia.length][fotografia[0].length];
	
		for (int linha=1; linha<fotografia.length-1;linha++) {
			for (int coluna=1;coluna<fotografia[0].length-1;coluna++) {
				fotografiaManipulada[linha][coluna]=(int) (Math.round(
								fotografia[linha-1][coluna-1]+fotografia[linha-1][coluna]+fotografia[linha-1][coluna+1]+
						   		fotografia[linha][coluna-1]+fotografia[linha][coluna]+fotografia[linha][coluna+1]+
						   		fotografia[linha+1][coluna-1]+fotografia[linha+1][coluna]+fotografia[linha+1][coluna+1]
						   				)/9.0);
				
				
			}	
		}
		copiarBorda(fotografia,fotografiaManipulada);
		
		return fotografiaManipulada;
		
	}
	
	public static int[][] fotografiaManipuladaOito (int[][] fotografia){
		int[][]fotografiaManipulada = new int [fotografia.length][fotografia[0].length];
	
		for (int linha=1; linha<fotografia.length-1;linha++) {
			for (int coluna=1;coluna<fotografia[0].length-1;coluna++) {
				fotografiaManipulada[linha][coluna]=(int) (Math.round(
								fotografia[linha-1][coluna-1]+fotografia[linha-1][coluna]+fotografia[linha-1][coluna+1]+
						   		fotografia[linha][coluna-1]+fotografia[linha][coluna+1]+
						   		fotografia[linha+1][coluna-1]+fotografia[linha+1][coluna]+fotografia[linha+1][coluna+1]
						   				)/8.0);
				
				
			}	
		}
		copiarBorda(fotografia,fotografiaManipulada);
		
		return fotografiaManipulada;
		
	}
	

	public static int[][] copiarBorda (int[][] fotografia, int[][] fotografiaManipulada){
		fotografiaManipulada[0]=fotografia[0];
		fotografiaManipulada[fotografia.length-1]=fotografia[fotografia.length-1];
		for (int linha =1;linha<fotografia.length-1;linha++ ) {
			fotografiaManipulada[linha][0]=fotografia[linha][0];
			fotografiaManipulada[linha][fotografia[0].length-1]=fotografia[linha][fotografia[0].length-1];

				
		
		}
		return fotografiaManipulada;
		
	}

}
