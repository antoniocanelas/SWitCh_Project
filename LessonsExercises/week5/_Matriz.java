/**
 * 
 */
package week5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anton
 *
 */
public class _Matriz {

	int m[][];
	int nLinhas, nColunas;

	public _Matriz(int l, int c) { // Construtor, tem de ser publicos. este metodo tem o mesmo nome do de baixo mas
									// este recebe 2 inteiros.
		m = new int[l][c]; // NAO HA TESTES AOS CONTRUTORES
		nLinhas = l;
		nColunas = c;
	}

	public _Matriz(int a[][]) { // e este recebe uma matriz. quando chamo com uma matriz ele sabia logo que era
								// este e nao o de cima.
		m = new int[a.length][a[0].length];
		nLinhas = a.length;
		nColunas = a[0].length;

		for (int i = 0; i < nLinhas; i++) {
			for (int j = 0; j < nColunas; j++) {
				m[i][j] = a[i][j];
			}
		}
	}

	public _Matriz Soma(_Matriz b) {
		_Matriz c = new _Matriz(b.nLinhas, b.nColunas);
		for (int i = 0; i < this.nLinhas; i++) {// não é necessário "this.", parametros nLinhas acessíveis na classe
			for (int j = 0; j < this.nColunas; j++) {
				c.m[i][j] = m[i][j] + (b.m[i][j]);
			}
		}
		return c;
	}

	public _Matriz multiplicacao(_Matriz matrixB) {
		if (nColunas == matrixB.nLinhas) {
			_Matriz mult = new _Matriz(nLinhas, matrixB.nColunas);
			for (int colunas = 0; colunas < matrixB.nColunas; colunas++) {
				for (int linhas = 0; linhas < nLinhas; linhas++) {
					int multVal = 0;
					for (int index = 0; index < nColunas; index++) {
						multVal += (m[linhas][index]) * (matrixB.m[index][colunas]);
						mult.m[linhas][colunas] = multVal;
					}
				}
			}

			return mult;
		}
		return null;

	}

	public List<_Ponto> getPontosComNumero(int numero) {
		List<_Ponto> lista = new ArrayList<_Ponto>();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == numero) {
					_Ponto p = new _Ponto(i, j);
					lista.add(p);
				}
			}
		}
		return lista;
	}

	public boolean setValor(int[] ponto, int valor) {
		m[ponto[0]][ponto[1]] = valor;

		return true;

	}

	public int getValor(int[] ponto) {
		int verValor = m[ponto[0]][ponto[1]];
		return verValor;

	}

	@Override // estou a alterar, a sobrecarregar o metodo, alterar o metodo que ja existe.
	public boolean equals(Object other) { // recebe um objeto e retorna verdadeiro e falso. o other recebe um objeto
											// qualquer. a primeira coisa a fazer neste caso e ver se o objeto e matriz.
		boolean res = false; // assumindo que e falso no inicio
		if (other instanceof _Matriz) {// se o obj other for do tipo matriz, entao... caso nao seja nem corre
			_Matriz m2 = (_Matriz) other; // isto pega na matriz e assume que e uma matriz
			if (m2.nLinhas == this.nLinhas && m2.nColunas == this.nColunas) {// se linhas sao todas iguais
				res = true;
				for (int i = 0; i < this.nLinhas && res; i++) {
					for (int j = 0; j < this.nColunas && res; j++) // mal o res seja falso, ele salta logo
						res = m2.m[i][j] == this.m[i][j];
				}
			}
		}
		return res;

	}

	@Override
	public String toString() {
		String res = ""; // string vazia
		if (this.nLinhas > 0 && this.nColunas > 0) { // colunas e linhas tem de ser maior que 0
			for (int i = 0; i < this.nLinhas; i++) { // percorre as linhas
				for (int j = 0; j < this.nColunas; j++) { // percorre as colunas
					res = res + " " + this.m[i][j];
				}
			}
			res = res + "\n"; // salta para a linha seguinte.
		}
		return res;
	}
}