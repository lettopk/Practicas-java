package bytebankHeredado;

public class SistemaInterno {
	
	private String clave = "AluraCursosOnline";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.inciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error al login");
			return false;
		}
	}

}
