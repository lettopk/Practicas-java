package bytebankHeredado;

public class Gerente extends Funcionario implements Autenticable{
	
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		 return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean inciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
