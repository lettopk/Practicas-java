
public class EjemploCondicionales2 {

	public static void main(String[] args) {

		int edad = 20;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;

		if (puedeEntrar) {
			System.out.println("Puedes ingresar");
		} else {
				System.out.println("Usted no puede entrar");
		}

	}

}
