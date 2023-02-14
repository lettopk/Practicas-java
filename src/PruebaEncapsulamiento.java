
public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(631);
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("aa12312");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
	}

}
