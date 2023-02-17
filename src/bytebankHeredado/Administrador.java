package bytebankHeredado;

public class Administrador extends Funcionario implements Autenticable {
	
	private AutenticacionUTil util;
	
	Administrador () {
		this.util = new AutenticacionUTil();
	}
	@Override
	public double getBonificacion() {
		return this.getSalario()
;	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
		
	}

	@Override
	public boolean inciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
		
	}

}
