

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Model.Curso;

public class ArrayList9 {

	public static void main(String[] args) {
					
		Curso curso1 = new Curso("Historia", 30);
		Curso curso2 = new Curso("Algebra", 10);
		Curso curso3 = new Curso("Aritmetica", 20);
		Curso curso4 = new Curso("Geometria", 50);
				
				
		java.util.ArrayList<Curso> cursos = new java.util.ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		//System.out.println(cursos);
		
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
		
		int tiempo =0;
		for (Curso curso:cursos) {
			tiempo +=curso.getTiempo();
		}
		
		System.out.println(tiempo);
		
		
		//										(______utilizacion de lapida para ignorar un elemento______)
		List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
		
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
	}
}