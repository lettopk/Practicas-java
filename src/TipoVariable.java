
public class TipoVariable {
	public static void main(String[] args) {
		System.out.println("Hola Mundo!!!");
		
		int edad =28; //Entero
		System.out.println(edad);
		
		edad = 47+10;
		System.out.println("mi edad es: " + edad);
		
		double salario = 1250.50; //decimal

		System.out.println(salario);
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1;  //Cast (forzar cambio de tipo de variable
		System.out.println(variable1Entero);
		
		//tamaños de variables
		int entero =28; //32bits
		double decimal = 1250.50; //64bits
		
		long prueba = 122222222222L; // 64bits Entero
		short numeroPequeño = 13555; //16bits Entero
		byte numeroAunMasPequeño = 18;//8bits Entero
		float numeroDecimalPeuqeno = 2.5F; //8 bits decimal 
		
	}
		
}
