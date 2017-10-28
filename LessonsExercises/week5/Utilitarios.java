package week5;

import java.util.ArrayList;
import java.util.List;

import week5.Ponto;

public class Utilitarios {

	public static List<Ponto> getPontos(char[][] matrix, char ponto) {
		List<Ponto> list = new ArrayList<>();
		for (int linha = 0; linha < matrix.length; linha++) {
			for (int coluna = 0; coluna < matrix[linha].length; coluna++) {
				if (matrix[linha][coluna] == ponto) {
					list.add(new Ponto(linha, coluna));
				}
			}

		}
		return list;

	}
}
