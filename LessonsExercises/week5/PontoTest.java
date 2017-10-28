/**
 * 
 */
package week5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import week5.Utilitarios;
import org.junit.Test;

/**
 * @author anton
 *
 */
public class PontoTest {

	@Test
	public void test1() {
		char[][] matrix = { { 'a', 'c', 'd' }, { 'd', 'f', 'g' }, { 'r', 't', 'a' } };
		char charater = 'a';

		Ponto p1 = new Ponto(0, 0);
		Ponto p2 = new Ponto(2, 2);
		List<Ponto> expected = new ArrayList<Ponto>();
		expected.add(p1);
		expected.add(p2);

		assertEquals(expected, Utilitarios.getPontos(matrix, charater));

	}
	
	@Test
	public void test2() {
		char[][] matrix = { { 'a', 'c', 'd' }, { 'd', 'f', 'g' }, { 'r', 'c', 'a' } };
		char charater = 'c';

		
		List<Ponto> expected = new ArrayList<Ponto>();
		expected.add(new Ponto(0, 1));
		expected.add(new Ponto(2, 1));

		assertEquals(expected, Utilitarios.getPontos(matrix, charater));

	}
}
