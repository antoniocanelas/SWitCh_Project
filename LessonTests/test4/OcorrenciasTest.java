package test4;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise4.Ocorrencias;;
public class OcorrenciasTest {

	char[][] matriz1= {{'a','b','c'},{'a','b','c'},{'a','b','c'}};
	char[][] matrizXadrez= {{'P','P','P'},{'P','B','L'},{'B','L','L'}};
	char[][] matrizXadrezReis= {{'P','P','r'},{'P','R','L'},{'B','L','L'}};
	char[][] matrizXadrezSemPecas= {{'a','c','b'},{'a','r','r'},{'t','t','m'}};

	@Test
	public void testmatriz1() {

		assertEquals(3, Ocorrencias.ocorrencias(matriz1,'a'));
 	}

	@Test
	public void testXadrez() {
		int array[]= {4,2,3};
		assertArrayEquals(array,Ocorrencias.xadrez(matrizXadrez));
		}
	
	@Test
	public void testXadrezSemPecas() {
		int array[]= {0,0,0};
		assertArrayEquals(array,Ocorrencias.xadrez(matrizXadrezSemPecas));
		}
	
	@Test
	public void matrizXadrezReis() {
		int array[]= {3,1,3,1,1};
		assertArrayEquals(array,Ocorrencias.xadrezReis(matrizXadrezReis));
		}
}