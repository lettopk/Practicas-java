package bytebankHeredado;

public class FuncionarioAutenticable extends Funcionario {

	public String clave;
	
	public void setClave (String clave) {
		this.clave= clave;
	}
	public boolean inciarSesion (String clave) {
		return clave == "AluraCursosOnline";
	}
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
