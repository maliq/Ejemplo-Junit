package cl.usm.testing.ejercicio.carrito;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingCartTest {
	
	private ShoppingCart bookCart;
    private Product defaultBook;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		bookCart = new ShoppingCart();
        defaultBook = new Product("Extreme Programming", 23.95);
        bookCart.addItem(defaultBook);
	}
	
	@Test
	//Prueba que después de ejecutar el método empty() 
	//sobre la instancia del carrito de compras "bookCart" esta queda vacía (isEmpty()). 
	public void testEmpty() {
		bookCart.empty();
		assertTrue(bookCart.isEmpty());
//		int expected = 0 ;
//		int actual = bookCart.getItemCount();
		assertEquals(0, bookCart.getItemCount());
	}
	
	@Test
	//Al carrito inicial de compras que ya tenía un ítem se le 
	//agrega otro y luego se verifica que el balance de la compra 
	// (getBalance()) sea la suma del costo de los dos ítems y 
	//que el número de ítems final (getItemCount()) sea igual a dos.
	public void testProductAdd(){
		Product p = new Product("item2", 10);
		bookCart.addItem(p);
		assertEquals(33.95, bookCart.getBalance(),0);
		assertEquals(2, bookCart.getItemCount());
	}
	
	@Test (expected = ProductNotFoundException.class)
	public void testProductNotFound() throws ProductNotFoundException{
		Product p = new Product("", 123);
		//Product p =new Product("Extreme Programming", 23.95);
		bookCart.removeItem(p);
	}

	@After
	public void tearDown() throws Exception {
		bookCart = null;
	}

}
