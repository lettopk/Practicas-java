
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta =new Cuenta (2);
		primeraCuenta.depositar(1000); 
		//primeraCuetna.pais = "peru"; no compila porque este atributo no existe 
		
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta(66);
		segundaCuenta.depositar(500); 
		
		System.out.println(segundaCuenta.getSaldo());

		System.out.println(primeraCuenta.getTitular());
		

		 System.out.println("saldo primera cuenta: "+ primeraCuenta.getSaldo());
		 System.out.println("saldo primera cuenta: "+ segundaCuenta.getSaldo());
	}
}
