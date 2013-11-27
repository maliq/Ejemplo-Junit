package cl.usm.testing.db;

public class UsuarioService {
	private UsuarioDao usuarioDao;
	
	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	public boolean save(String user){
		if(usuarioDao.getUser(user) == null ){
			usuarioDao.createUser(user);
			return true;
		}else
			return false;
	}

}
