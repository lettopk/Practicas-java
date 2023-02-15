package bytebankHeredado;

public class TestdeSistemaInterno {

	public static void main(String[] args) {
		
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admini = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admini);

	}

}
