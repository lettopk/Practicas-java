
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Model.Aula;
import Model.Curso;

public class ArrayList6 {

	public static void main(String[] args) {
					
		Curso curso1 = new Curso("Java", 30);
		curso1.addAula(new Aula("ArrayList"));
		curso1.addAula(new Aula("List"));
		curso1.addAula(new Aula("LinkedList"));
		
				
		java.util.ArrayList<Curso> cursos = new java.util.ArrayList<>();
		cursos.add(curso1);
		
		System.out.println(cursos.get(0).getAulaList());
		
		
	}
}