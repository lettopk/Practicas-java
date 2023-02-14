
public class TestReferencia2 {

	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego"); 
		diego.setDocumento("123123");
		diego.setTelefono("311456"); 
		
		Cuenta cuentaDiego = new Cuenta (962);
		cuentaDiego.setTitular(diego);
		
		System.out.println(cuentaDiego.getTitular().getDocumento());
		System.out.println(cuentaDiego.getTitular());
		System.out.println(diego);
		

	}

}
