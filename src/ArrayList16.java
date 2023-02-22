import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Model.Alumno;
import Model.Curso;

public class ArrayList16 {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Historia", 30);

		
		Alumno alumno1 = new Alumno("Luis Miguel", "001");
		Alumno alumno2 = new Alumno("Pepito Los Palotes", "002");
		Alumno alumno3 = new Alumno("Juan Carlos", "003");
		Alumno alumno4 = new Alumno("Pedro Pedrito", "004");
		Alumno alumno5 = new Alumno("Gustavo Sanchez", "005");
		Alumno alumno6 = new Alumno("Marcia Martinez","006");
		Alumno alumno7 = new Alumno("Claudia Patricia", "007");
		
		
		
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		curso1.addAlumno(alumno7);
		
		//curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
		
		Iterator<Alumno> alumnoInterator = curso1.getAlumnos().iterator();
		
		while (alumnoInterator.hasNext()){
			System.out.println(alumnoInterator.next());
		}
		//Error porque ya esta al final de la lista ->
		//alumnoInterator.next();
	}
}