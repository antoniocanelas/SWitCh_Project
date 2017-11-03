package week5;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _PontoTest {

    @Test
    public void test1() {

	char[][] matrix = { { 'a', 'c', 'd' }, { 'd', 'f', 'g' }, { 'r', 't', 'a' } };
	char charater = 'a';

	_Ponto p1 = new _Ponto(0, 0);
	_Ponto p2 = new _Ponto(2, 2);
	List<_Ponto> expected = new ArrayList<_Ponto>();
	expected.add(p1);
	expected.add(p2);

	assertEquals(expected, _Utilitarios.getPontos(matrix, charater));
    }

    @Test
    public void test2() {

	char[][] matrix = { { 'a', 'c', 'd' }, { 'd', 'f', 'g' }, { 'r', 'c', 'a' } };
	char charater = 'c';

	List<_Ponto> expected = new ArrayList<_Ponto>();
	expected.add(new _Ponto(0, 1));
	expected.add(new _Ponto(2, 1));

	assertEquals(expected, _Utilitarios.getPontos(matrix, charater));

    }
}
