package cl.usm.testing.ejercicio.carrito;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

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

	@After
	public void tearDown() throws Exception {
		bookCart = null;
	}

}
