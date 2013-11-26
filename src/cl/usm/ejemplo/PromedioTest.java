package cl.usm.ejemplo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PromedioTest {
	private Promedio promedio;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		promedio = new Promedio();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMediaCaminoUno() {
		// entrada valor[1] = -999, esperado =-999 (1,2,9,11,12)
		int[] valor = {0,-999};
		int esperado = -999;
		//valores para que funcione invocación de método.
		int minimo = 0;
		int maximo = -100;
		int actual = promedio.media(valor, minimo, maximo);
		assertEquals(esperado, actual);
	}
	
//	@Test
//	public void testMediaCaminoTres() {
//		// entrada valor[1] <> -999, esperado =-999 (1,2,3,9,10/11,12)
//		int[] valor = {0,-999};
//		int esperado = 0;
//		//valores para que funcione invocación de método.
//		int minimo = 0;
//		int maximo = -100;
//		int actual = promedio.media(valor, minimo, maximo);
//		assertEquals(esperado, actual);
//	}
	
	@Test
	public void testMediaCamino4() {
		// entrada valor[1] <> -999, valor[2] = -999, esperado =-999 (1,2,3,9,10/11,12)
		// valor[1]<minimo
		int[] valor = {0,3,-999};
		int esperado = -999;
		//valores para que funcione invocación de método.
		int minimo = 6;
		int maximo = 100;
		int actual = promedio.media(valor, minimo, maximo);
		assertEquals(esperado, actual);
	}
	
	@Test
	public void testMediaCamino6() {
		// entrada valor[1] <> -999, valor[2] = -999, esperado =-999 (1,2,3,9,10/11,12)
		// valor[1]>=minimo, maximo = 5
		// valor[1]<=maximo
		int[] valor = {0,6,-999};
		int esperado = 6;
		//valores para que funcione invocación de método.
		int minimo = 5;
		int maximo = 10;
		int actual = promedio.media(valor, minimo, maximo);
		assertEquals(esperado, actual);
	}
}
