package cl.usm.testing.db;

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
}
