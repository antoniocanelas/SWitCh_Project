package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixExerc {

    private int m[][];
    private int nLinhas, nColunas;

    public MatrixExerc(int l, int c) {

	this.m = new int[l][c];
	this.nLinhas = l;
	this.nColunas = c;
    }

    public MatrixExerc(int a[][]) {

	this.m = new int[a.length][a[0].length];
	this.nLinhas = a.length;
	this.nColunas = a[0].length;

	for (int i = 0; i < this.nLinhas; i++) {
	    for (int j = 0; j < this.nColunas; j++) {
		this.m[i][j] = a[i][j];
	    }
	}
    }

    public MatrixExerc cloneMatrix() {

	return new MatrixExerc(this.m);
    }

    public MatrixExerc transposta() {

	MatrixExerc matrixAux = new MatrixExerc(this.m);

	for (int i = 0; i < this.nLinhas; i++) {
	    for (int j = 0; j < this.nColunas; j++) {
		matrixAux.m[j][i] = this.m[i][j];
	    }

	}
	return matrixAux;

    }

    public boolean symmetricMatrix() {

	if (!isQuadrada(this.m)) {
	    return false;
	}

	for (int indexDiagonal = 1; indexDiagonal < this.m.length; indexDiagonal++) {
	    for (int indexElemento = 0; indexElemento <= indexDiagonal; indexElemento++) {
		if (this.m[indexDiagonal][indexElemento] != this.m[indexElemento][indexDiagonal]) {
		    return false;
		}
	    }
	}

	return true;
    }

    public MatrixExerc soma(MatrixExerc matrixB) throws Exception {

	if (!isEqualDimension(this.m, matrixB.m)) {
	    throw new IllegalArgumentException("Dimensões diferentes");
	}
	MatrixExerc soma = new MatrixExerc(this.nLinhas, this.nColunas);
	for (int i = 0; i < this.nLinhas; i++) {
	    for (int j = 0; j < this.nColunas; j++) {
		soma.m[i][j] = this.m[i][j] + matrixB.m[i][j];
	    }
	}
	return soma;
    }

    public MatrixExerc multiplicacao(MatrixExerc matrixB) throws Exception {

	if (!(this.nColunas == matrixB.nLinhas)) {
	    throw new IllegalArgumentException("Nº Colunas de A <> Nº Linhas de B");
	}
	MatrixExerc mult = new MatrixExerc(this.nLinhas, matrixB.nColunas);
	for (int colunas = 0; colunas < matrixB.nColunas; colunas++) {
	    for (int linhas = 0; linhas < this.nLinhas; linhas++) {
		int multVal = 0;
		for (int index = 0; index < this.nColunas; index++) {
		    multVal += (this.m[linhas][index]) * (matrixB.m[index][colunas]);
		    mult.m[linhas][colunas] = multVal;
		}
	    }
	}

	return mult;

    }

    public ArraysExerc SomarLinha() throws Exception {

	ArraysExerc sArray = new ArraysExerc(this.getnLinhas());
	if (this.m.length == 0) {
	    throw new Exception();
	}
	for (int row = 0; row < this.nLinhas; row++) {
	    int val = 0;
	    for (int col = 0; col < this.nColunas; col++) {
		val += this.m[row][col];
		sArray.valAdd(row, val);
	    }

	}
	return sArray;
    }

    public List<_Ponto> getPontosComNumero(int numero) {

	List<_Ponto> lista = new ArrayList<_Ponto>();
	for (int i = 0; i < this.m.length; i++) {
	    for (int j = 0; j < this.m[i].length; j++) {
		if (this.m[i][j] == numero) {
		    _Ponto p = new _Ponto(i, j);
		    lista.add(p);
		}
	    }
	}
	return lista;
    }

    public void setValor(_Ponto ponto, int valor) throws Exception {

	if ((ponto.getX() < 0) || (ponto.getX() > this.nLinhas)) {
	    throw new IllegalArgumentException();
	}
	if ((ponto.getY() < 0) || (ponto.getY() > this.nColunas)) {
	    throw new IllegalArgumentException();
	}

	this.m[ponto.getX()][ponto.getY()] = valor;
    }

    private boolean isEqualDimension(int[][] m, int[][] b) {

	if (!(m.length == b.length)) {
	    return false;
	}
	if (!(m[0].length == b[0].length)) {
	    return false;
	}
	return true;
    }

    private boolean isQuadrada(int[][] matrix) {

	for (int numLinha = 0; numLinha < matrix.length; numLinha++) {
	    if (matrix.length != matrix[numLinha].length) {
		return false;
	    }
	}
	return true;

    }

    @Override
    public boolean equals(Object obj) {

	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	MatrixExerc other = (MatrixExerc) obj;
	if (!Arrays.deepEquals(this.m, other.m)) {
	    return false;
	}
	return true;
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

    public int[][] getM() {

	return this.m;
    }

    public void setM(int[][] m) {

	this.m = m;
    }

    public int getnLinhas() {

	return this.nLinhas;
    }

    public void setnLinhas(int nLinhas) {

	this.nLinhas = nLinhas;
    }

    public int getnColunas() {

	return this.nColunas;
    }

    public void setnColunas(int nColunas) {

	this.nColunas = nColunas;
    }

}
