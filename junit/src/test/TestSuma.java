package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Suma;

public class TestSuma {
	
	private Suma miSuma = new Suma();
	
	@Before
	public void SetUp(){
		miSuma.setNum1(6);
		miSuma.setNum2(3);
	}
	
	@Test
	public void test() {
		assertEquals(9, miSuma.sumar());
	}

}
