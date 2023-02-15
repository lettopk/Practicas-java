package bytebankHeredado;

public class Gerente  extends FuncionarioAutenticable{
	
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		 return 2000;
	}
}
