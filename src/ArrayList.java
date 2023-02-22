public class ArrayList {

	public static void main(String[] args) {
		String variable1 = "Ejemplo1";
		String variable2 = "Ejemplo2";
		String variable3 = "Ejemplo3";
		String variable4 = "Ejemplo4";
		
		
		java.util.ArrayList<String> lista = new java.util.ArrayList<>();
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		
		System.out.println(lista);
		
		lista.remove(2);//Eliminar elementos
		System.out.println(lista);
		
		lista.set(2, "ejemplo alterado"); //modificar valores de la lista
		System.out.println(lista.size());
		
		
	}


}
