package cl.usm.testing.db;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class UsuarioServiceTest {
	UsuarioService usuarioService;
	
	@Mock
	UsuarioDao usuarioDao;
	
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		usuarioService = new UsuarioService();
		usuarioService.setUsuarioDao(usuarioDao);
	}

	@Test
	public void testSave() {
		String user= "user 1";
		usuarioService.save(user);
		Mockito.verify(usuarioDao).getUser(user);
	}
	
	@Test
	public void testSaveExists() {
		String user= "user 1";
		Mockito.when(usuarioDao.getUser(user)).thenReturn(user);
		boolean actual = usuarioService.save(user);
		assertEquals(false,actual);
		Mockito.verify(usuarioDao).getUser(user);
		Mockito.verify(usuarioDao).createUser(user);
	}
	
	@Test
	public void testSaveAndCreate() {
		String user= "user 1";
		Mockito.when(usuarioDao.getUser(user)).thenReturn(null);
		boolean actual = usuarioService.save(user);
		assertEquals(true,actual);
		Mockito.verify(usuarioDao).getUser(user);
		Mockito.verify(usuarioDao).createUser(user);
	}
}
