
public class Condicionales {

	public static void main(String[] args) {

		int edad = 17;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("Puedes ingresar");
		} else {
			if (cantidad >= 2) {
				System.out.println("ud es menor de edad pero esta " 
						+ "permitido el ingreso");
			} else {
				System.out.println("Lo siento, eres muy pequeno aun");
			}
		}
	}

}
