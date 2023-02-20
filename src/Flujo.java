
public class Flujo {

	public static void main (String[] args) {
		System.out.println("Inicio de main");
		try {
			metodo1();
		} catch (MiException e) {
			e.printStackTrace();
		}
		System.out.println("Fin de main");
	}
	 private static void metodo1() throws MiException {
		System.out.println("Inicio metodo1");
			
		metodo2();
		
		System.out.println("Fin Metodo1");	
	 }
	 
	 
	 private static void metodo2() throws MiException {
		System.out.println("Inicio Metodo2");
		/*for ( int i=1; i<=5; i++) {
			System.out.println(i);
			
			try { //intenta esto
				
				if (i ==3 ) {
					int num =0;
					int resultado = i/num;
					System.out.println(resultado);
					}
				
				String test = null;
				System.out.println(test.toString());
			}catch (ArithmeticException | NullPointerException exception) { //atrapa el error

				System.out.println("Atrapo exception" );
				System.out.println(exception.getMessage());
				exception.printStackTrace();
				}
			
			}*/
		
		throw new MiException("Mi execepcion fue lanzada");
		// System.out.println("Fin Metodo2");	
	 }

}
