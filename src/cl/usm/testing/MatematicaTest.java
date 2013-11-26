package cl.usm.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatematicaTest {
	private static Matematica matematica;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		matematica = new Matematica(2,3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuma() {
		int resultado = matematica.suma();
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testSumaCero() {
		matematica = new Matematica(0, 0);
		int resultado = matematica.suma();
		int esperado = 0;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testMultiplicar(){
		int resultado = matematica.multiplicar();
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testRestar(){
		int resultado = matematica.restar();
		int esperado = 0;
		assertEquals(esperado, resultado);
		matematica = new Matematica(4, 0);
		resultado = matematica.restar();
		esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testRestarMayorCero(){
		matematica = new Matematica(2, 4);
		int resultado = matematica.restar();
		int esperado = 0;
		assertEquals(esperado, resultado);
	}

}
