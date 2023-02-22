
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import Model.Aula;
import Model.Curso;

public class ArrayList8 {
	
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<>());
			add(new ArrayList<>());
		}
	};

	public static void main(String[] args) {
		
		for (List<Integer> lista: listas) {
			final String nombreImplementacion = lista.getClass().getSimpleName();
			
			//add
			long inicio = System.currentTimeMillis();
			for (int i=0; i<100000; i++) {
				lista.add(i);
			}
			long fin = System.currentTimeMillis();
			long duracion = fin-inicio;
			System.out.println(nombreImplementacion + " add: " + duracion);
			
			//get
			inicio = System.currentTimeMillis();
			for (int i=0; i< 100000; i++){
				lista.get(i);
			}
			fin = System.currentTimeMillis();
			duracion = fin - inicio;
			System.out.println(nombreImplementacion + " get: " + duracion);
			
			//remove
			inicio = System.currentTimeMillis();
			for (int i=99999; i>=0; i--){
				lista.remove(i);
			}
			fin = System.currentTimeMillis();
			duracion = fin - inicio;
			System.out.println(nombreImplementacion + " remove: " + duracion);
			
			
			//LINKEND LIST A<->B<->C<->D
			
			//ARRAYLIST A->B->C->D
		}
		
	}
}