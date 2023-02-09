
public class EjemploScope {

	public static void main(String[] args) {
		int edad = 20;
		int cantidadPersonas = 2;
		
		boolean esPareja;
		
		if (cantidadPersonas >1) {
			esPareja = true;
		}else {
			esPareja = false;
		}
		boolean puedeEntrar = edad >= 18 && esPareja;

		if (puedeEntrar) {
			System.out.println("Puedes ingresar");
		} else {
				System.out.println("Usted no puede entrar");
		}

	}

}
