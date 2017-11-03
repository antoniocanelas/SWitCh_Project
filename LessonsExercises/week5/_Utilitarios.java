package week5;

import java.util.ArrayList;
import java.util.List;

public class _Utilitarios {

	public static List<_Ponto> getPontos(char[][] matrix, char ponto) {

		List<_Ponto> list = new ArrayList<>();
		for (int linha = 0; linha < matrix.length; linha++) {
			for (int coluna = 0; coluna < matrix[linha].length; coluna++) {
				if (matrix[linha][coluna] == ponto) {
					list.add(new _Ponto(linha, coluna));
				}
			}

		}
		return list;

	}

}
