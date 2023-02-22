import java.util.Collections;

import Model.Curso;

public class ArrayList4 {

	public static void main(String[] args) {
					
		Curso curso1 = new Curso("Genometria", 30);
		Curso curso2 = new Curso("Fisica", 10);
		Curso curso3 = new Curso("Quimica", 20);
		Curso curso4 = new Curso("Historia", 50);
				
				
		java.util.ArrayList<Curso> cursos = new java.util.ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
	}
}