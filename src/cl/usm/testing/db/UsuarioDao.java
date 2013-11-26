package cl.usm.testing.db;

import java.util.List;

public interface UsuarioDao {
	public boolean createUser(String user) ;
	public String getUser(String id) ;
	public List<String> list();
}
