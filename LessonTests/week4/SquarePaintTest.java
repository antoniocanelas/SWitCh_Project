package week4;

import static org.junit.Assert.*;

import org.junit.Test;

import week4.SquarePaint;

public class SquarePaintTest {

	//isStepValidF
	@Test
	public void isStepValidF() {
		char actualStep= 'F';
		assertTrue(SquarePaint.isStepValid(actualStep));
	}
	
	@Test
	public void isStepValidR() {
		char actualStep= 'R';
		assertTrue(SquarePaint.isStepValid(actualStep));
	}
	
	@Test
	public void isStepValidP() {
		char actualStep= 'P';
		assertTrue(SquarePaint.isStepValid(actualStep));
	}
	
	@Test
	public void isStepValidFalse() {
		char actualStep= 'a';
		assertFalse(SquarePaint.isStepValid(actualStep));
	}
	
	//isGoForwardValidC
	@Test
	public void isGoForwardValidC0T() {
		SquarePaint.step ='F';
		SquarePaint.direction ="RIGHT";
		SquarePaint.positionCoordinates[0]=0;
		assertTrue(SquarePaint.isGoForwardValid());
	}
	
	@Test
	public void isGoForwardValidC0F() {
		SquarePaint.step ='F';
		SquarePaint.direction="LEFT";
		SquarePaint.positionCoordinates[0]=0;
		assertFalse(SquarePaint.isGoForwardValid());
	}
	
	@Test
	public void isGoForwardValidC6F() {
		SquarePaint.step ='F';
		SquarePaint.direction ="RIGHT";
		SquarePaint.positionCoordinates[0]=6;
		assertFalse(SquarePaint.isGoForwardValid());
	}

	@Test
	public void isGoForwardValidC6T() {
		SquarePaint.step ='F';
		SquarePaint.direction ="LEFT";
		SquarePaint.positionCoordinates[0]=6;
		assertTrue(SquarePaint.isGoForwardValid());
	}

	@Test
	public void isGoForwardValidR0T() {
		SquarePaint.step ='F';
		SquarePaint.direction ="DOWN";
		SquarePaint.positionCoordinates[0]=0;
		assertTrue(SquarePaint.isGoForwardValid());
	}

	@Test
	public void isGoForwardValidR0F() {
		SquarePaint.step ='F';
		SquarePaint.direction="UP";
		SquarePaint.positionCoordinates[0]=0;
		assertFalse(SquarePaint.isGoForwardValid());
	}

	@Test
	public void isGoForwardValidR6F() {
		SquarePaint.step ='F';
		SquarePaint.direction ="DOWN";
		SquarePaint.positionCoordinates[1]=6;
		assertFalse(SquarePaint.isGoForwardValid());
	}

	@Test
	public void isGoForwardValidR6T() {
		SquarePaint.step ='F';
		SquarePaint.direction="UP";
		SquarePaint.positionCoordinates[1]=6;
		assertTrue(SquarePaint.isGoForwardValid());
	}

//	rotatePosition
	@Test
	public void rotatePositionT1() {
		SquarePaint.step ='R';
		SquarePaint.direction ="RIGHT";
		SquarePaint.rotatePosition();
		assertEquals("DOWN",SquarePaint.direction);
	}
	
	@Test
	public void rotatePositionT2() {
		SquarePaint.step ='R';
		SquarePaint.direction ="DOWN";
		SquarePaint.rotatePosition();
		assertEquals("LEFT",SquarePaint.direction);
	}
	
	@Test
	public void rotatePositionT3() {
		SquarePaint.step ='R';
		SquarePaint.direction ="LEFT";
		SquarePaint.rotatePosition();
		assertEquals("UP",SquarePaint.direction);
	}
	
	@Test
	public void rotatePositionT4() {
		SquarePaint.step ='R';
		SquarePaint.direction ="UP";
		SquarePaint.rotatePosition();
		assertEquals("RIGHT",SquarePaint.direction);
	}
	
	//positionCoordinates ********** DÚVIDA ESCLARECER **********
	public void positionCoordinates1() {
		SquarePaint.positionCoordinates[0]=3;
		SquarePaint.positionCoordinates[1]=3;
		SquarePaint.step ='R';
		SquarePaint.direction ="LEFT";
		SquarePaint.rotatePosition();
		int[] expectedArray = {3,4};
		SquarePaint.goForward();
		assertArrayEquals(expectedArray,SquarePaint.positionCoordinates);
	}
	
	public void positionCoordinates2() {
		SquarePaint.positionCoordinates[0]=3;
		SquarePaint.positionCoordinates[1]=3;
		SquarePaint.step ='R';
		SquarePaint.direction ="UP";
		SquarePaint.rotatePosition();
		int[] expectedArray = {3,4};
		SquarePaint.goForward();
		assertArrayEquals(expectedArray,SquarePaint.positionCoordinates);
	}
	
	// 
//	@Test
//	public void charFind() {
//		
//		SquarePaint.charFind();
//		assertEquals(4,SquarePaint.charFind);
//	}
	
	
}
