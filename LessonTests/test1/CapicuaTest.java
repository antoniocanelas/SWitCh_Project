package test1;

import static org.junit.Assert.*;

import org.junit.Test;
import exercise1.Capicua;

public class CapicuaTest {

	@Test
	public void Capicua0() {
		assertEquals(false, Capicua.capicua(123456));

	}

	@Test
	public void Capicua1() {
		assertEquals(true, Capicua.capicua(123321));

	}
}
