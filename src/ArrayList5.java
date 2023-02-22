
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Model.Curso;

public class ArrayList5 {

	public static void main(String[] args) {
					
		Curso curso1 = new Curso("Ruby", 30);
		Curso curso2 = new Curso("JavaScript", 10);
		Curso curso3 = new Curso("PHP", 20);
		Curso curso4 = new Curso("Java", 50);
				
				
		java.util.ArrayList<Curso> cursos = new java.util.ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		//Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
		//System.out.println(cursos);
		
		
		//										(______utilizacion de lapida para ignorar un elemento______)
		List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
		System.out.println(cursoList);
	}
}