package bytebankHeredado;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente ();
		//gerente.setSalario(2000);
		//funcionario gerente = new funcionario();
		gerente.setSalario(6000);
		gerente.setTipo(1);
		gerente.setNombre("carlos");
		gerente.setClave("AluraCursosOnline");
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.inciarSesion("AluraCursosOnline"));
		
		

	}

}
