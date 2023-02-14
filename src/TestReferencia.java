
public class TestReferencia {

	public static void main(String[] args) {
		 Cuenta primeraCuenta = new Cuenta(784);
		 primeraCuenta.depositar(200);
		 
		 
		 Cuenta segundaCuenta = primeraCuenta;
		 segundaCuenta.depositar(100);
		 System.out.println("saldo primera cuenta: "+ primeraCuenta.getSaldo());
		 System.out.println("saldo segunda cuenta: "+ segundaCuenta.getSaldo());
		 
		 segundaCuenta.depositar(400);

		 System.out.println("saldo primera cuenta: "+ primeraCuenta.getSaldo());

		 System.out.println("saldo primera cuenta: "+ primeraCuenta);
		 System.out.println("saldo primera cuenta: "+ segundaCuenta);
	}

}
