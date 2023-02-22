import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

import Model.Alumno;
import Model.Curso;

public class ArrayList18 {

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
		
		Optional <Alumno> alumno = curso1.getAlumnos().stream().filter(a -> "003".equalsIgnoreCase(a.getCodigo())).findFirst();
		if (alumno.isPresent()) {
			System.out.println(alumno.get());
		}
		
		Alumno alumnoMap = curso1.getAlumnoMap().get("003");
		System.out.println(alumnoMap);
		
	}
}