

public class ArrayList2 {

	public static void main(String[] args) {
		String variable1 = "Clase1";
		String variable2 = "Clase2";
		String variable3 = "Clase3";
		String variable4 = "Clase4";
				
				
		java.util.ArrayList<String> listaString = new java.util.ArrayList<>();
		listaString.add(variable1);
		listaString.add(variable2);
		listaString.add(variable3);
		listaString.add(variable4);
			
		System.out.println(listaString);
				

		/*
		for (int i=0; i <listaString.size(); i++) {
				 
			System.out.println(listaString.get(i));
		}*/
				
		/*
		for (String clase : listaString) {
			System.out.println(clase);
		}*/
				
		listaString.forEach(clase ->{
			System.out.println(clase);
		});	
									
	}
}