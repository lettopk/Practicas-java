import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayList3 {

	public static void main(String[] args) {
					
		String curso1 = "Geometria";
		String curso2 = "Fisica";
		String curso3 = "Quimica";
		String curso4 = "Historia";
				
				
		java.util.ArrayList<String> cursos = new java.util.ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
				
		System.out.println(cursos);
		/*
		Collections.sort(cursos); //organiza lista acendente
		System.out.println(cursos);
		
		Collections.sort(cursos, Collections.reverseOrder()); //organiza lista decendiente
		System.out.println(cursos);
				
		cursos.sort(Comparator.reverseOrder());//decendente 
		System.out.println(cursos);
		
		cursos.sort(Comparator.naturalOrder());//acendente
		System.out.println(cursos);
		*/
		java.util.List <String> cursosList = cursos.stream().sorted().collect(Collectors.toList()); //crea una nueva lista ordenada decendente
		System.out.println(cursosList);
	}
}