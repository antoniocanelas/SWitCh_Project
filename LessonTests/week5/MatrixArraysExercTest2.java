package week5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MatrixArraysExercTest2 {

    @Test
    public void transpostaEquals1() {

	int[][] in = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int[][] out = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };

	MatrixExerc metodo = new MatrixExerc(in);
	MatrixExerc metodoOut = new MatrixExerc(out);

	assertEquals(metodoOut, metodo.transposta());
    }

    @Test
    public void transpostaNotEquals2() {

	int[][] in = { { 1, 2, 3, 4 }, { 2, 6, 5, 8 }, { 3, 5, 7, 9 }, { 4, 8, 9, 8 } };
	int[][] out = { { 1, 2, 3 }, { 2, 2, 3 }, { 3, 3, 3 } };

	MatrixExerc metodo = new MatrixExerc(in);
	MatrixExerc metodoOut = new MatrixExerc(out);

	assertNotEquals(metodoOut, metodo.transposta());
    }

    @Test
    public void SomarLinha() throws Exception {

	int[][] in = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
	int[] sArray = { 3, 6, 9 };

	MatrixExerc metodo = new MatrixExerc(in);
	ArraysExerc expected = new ArraysExerc(sArray);

	assertEquals(expected, metodo.SomarLinha());
    }

    @Test
    public void somaEquals() throws Exception {

	MatrixExerc m1 = new MatrixExerc(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 1, 1, 1 } });
	MatrixExerc m2 = new MatrixExerc(new int[][] { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } });
	MatrixExerc expResult = new MatrixExerc(new int[][] { { 3, 3, 3 }, { 4, 4, 4 }, { 3, 3, 3 } });
	MatrixExerc result = m1.soma(m2);

	assertEquals(expResult, result);
    }

    @Test
    public void somaNotEquals() throws Exception {

	MatrixExerc m1 = new MatrixExerc(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 1, 1, 1 } });
	MatrixExerc m2 = new MatrixExerc(new int[][] { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } });
	MatrixExerc expResult = new MatrixExerc(new int[][] { { 3, 3, 3 }, { 4, 4, 4 }, { 3, 3, 3 } });
	MatrixExerc result = m1.soma(m2);
	assertEquals(expResult, result);
    }

    @Test(expected = Exception.class)
    public void somaException() throws Exception {

	MatrixExerc m1 = new MatrixExerc(new int[][] { { 1, 1, 1 }, { 2, 2, 2 } });
	MatrixExerc m2 = new MatrixExerc(new int[][] { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } });
	m1.soma(m2);
    }

    @Test
    public void multiplicacaoEquals1() throws Exception {

	int[][] inA = { { 2, 5, 9 }, { 3, 6, 8 } };
	int[][] inB = { { 2, 7 }, { 4, 3 }, { 5, 2 } };

	int[][] out = { { 69, 47 }, { 70, 55 } };

	MatrixExerc MatrixA = new MatrixExerc(inA);
	MatrixExerc MatrixB = new MatrixExerc(inB);

	MatrixExerc expResult = new MatrixExerc(out);

	MatrixExerc result = MatrixA.multiplicacao(MatrixB);

	assertEquals(expResult, result);
    }

    @Test
    public void multiplicacaoNotEquals() throws Exception {

	int[][] inA = { { 2, 5, 9 }, { 3, 6, 8 } };
	int[][] inB = { { 12, 7 }, { 4, 3 }, { 5, 2 } };

	int[][] out = { { 69, 47 }, { 70, 55 } };

	MatrixExerc MatrixA = new MatrixExerc(inA);
	MatrixExerc MatrixB = new MatrixExerc(inB);

	MatrixExerc expResult = new MatrixExerc(out);

	MatrixExerc result = MatrixA.multiplicacao(MatrixB);

	assertNotEquals(expResult, result);
    }

    @Test(expected = Exception.class) // colocado para verificar se recebe Exception
    public void multiplicacaoException() throws Exception {

	int[][] inA = { { 2, 5, 9 }, { 3, 6, 8 } };
	int[][] inB = { { 12, 7 }, { 4, 3 } };

	MatrixExerc MatrixA = new MatrixExerc(inA);
	MatrixExerc MatrixB = new MatrixExerc(inB);

	MatrixA.multiplicacao(MatrixB);// Recebe Exception, validando o teste
    }

    @Test
    public void symmetricMatrixEqualsTrue() {

	int[][] in = { { 1, 2, 3, 4 }, { 2, 6, 5, 8 }, { 3, 5, 7, 9 }, { 4, 8, 9, 8 } };

	MatrixExerc metodo = new MatrixExerc(in);

	assertTrue(metodo.symmetricMatrix());
    }

    @Test
    public void symmetricMatrixEqualsFalse() {

	int[][] in = { { 1, 22, 3, 4 }, { 2, 6, 5, 8 }, { 3, 5, 7, 9 }, { 4, 8, 9, 8 } };

	MatrixExerc metodo = new MatrixExerc(in);

	assertFalse(metodo.symmetricMatrix());
    }

    @Test
    public void getPontosComNumeroEquals1() {

	MatrixExerc m1 = new MatrixExerc(new int[][] { { 1, 1, 1 }, { 2, 2, 3 }, { 1, 1, 1 } });
	_Ponto p1 = new _Ponto(1, 0);
	_Ponto p2 = new _Ponto(1, 1);
	List<_Ponto> expected = new ArrayList<_Ponto>();
	expected.add(p1);
	expected.add(p2);
	List<_Ponto> result = m1.getPontosComNumero(2);
	assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void getPontosComNumeroEquals2() {

	MatrixExerc m1 = new MatrixExerc(new int[][] { { 1, 1, 1 }, { 2, 2, 3 }, { 1, 1, 1 } });
	List<_Ponto> expected = new ArrayList<_Ponto>();
	List<_Ponto> result = m1.getPontosComNumero(4);
	assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void setValorEquals() throws Exception {

	MatrixExerc m1 = new MatrixExerc(new int[][] { { 1, 1, 1 }, { 2, 2, 3 }, { 1, 1, 1 } });
	MatrixExerc m2 = new MatrixExerc(new int[][] { { 1, 1, 1 }, { 2, 5, 3 }, { 1, 1, 1 } });

	_Ponto ponto = new _Ponto(1, 1);
	int valor = 5;
	m1.setValor(ponto, valor);
	assertEquals(m1, m2);
    }

    @Test
    public void setValorNotEquals() throws Exception {

	MatrixExerc m1 = new MatrixExerc(new int[][] { { 1, 1, 1 }, { 2, 2, 3 }, { 1, 1, 1 } });
	MatrixExerc m2 = new MatrixExerc(new int[][] { { 1, 1, 1 }, { 2, 55, 3 }, { 1, 1, 1 } });

	_Ponto ponto = new _Ponto(1, 1);
	int valor = 5;
	m1.setValor(ponto, valor);
	assertNotEquals(m1, m2);
    }

    @Test(expected = Exception.class)
    public void setValorException() throws Exception {

	MatrixExerc m1 = new MatrixExerc(new int[][] { { 1, 1, 1 }, { 2, 2, 3 }, { 1, 1, 1 } });

	_Ponto ponto = new _Ponto(1, 10);// gera uma excepção
	int valor = 5;
	m1.setValor(ponto, valor);

    }

}