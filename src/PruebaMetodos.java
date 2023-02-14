
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuentaDeDiego =new Cuenta(555);
		cuentaDeDiego.depositar(300); 
		cuentaDeDiego.depositar(200);
		System.out.println(cuentaDeDiego.getSaldo());
		
		
		cuentaDeDiego.retirar(100);
		System.out.println(cuentaDeDiego.getSaldo());
		
		
	
		Cuenta cuentaDeJimena = new Cuenta(666);
		cuentaDeJimena.depositar(1000);
		
		boolean puedeTranferir= cuentaDeJimena.transferir(400,cuentaDeDiego);
		
		if (puedeTranferir) {
			System.out.println("Transferencia exitosa");
			} else {
			System.out.println("No es posible realizar la transferencia");
			}
		
		
		System.out.println(cuentaDeJimena.getSaldo());
		System.out.println(cuentaDeDiego.getSaldo());
	}

}
