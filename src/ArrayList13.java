import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ArrayList13 {

	public static void main(String[] args) {
		String alumno1 = "Luis Miguel";
		String alumno2 = "Pepito Los Palotes";
		String alumno3 = "Juan Carlos";
		String alumno4 = "Pedro Pedrito";
		String alumno5 = "Gustavo Sanchez";
		String alumno6 = "Marcia Martinez";
		String alumno7 = "Marcia Martinez";
		String alumno8 = "Gustavo Sanchez";
		
		Collection<String> listaAlumnos = new HashSet<>();
		
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		
	
		
		
		//encontrar alumno
		boolean valida = listaAlumnos.contains("Pedro Pedrito");
		
		//cual alumno tiene mas letras
		String max= listaAlumnos.stream().max(Comparator.comparing(String::length)).get();
		
		
		listaAlumnos.removeIf(alumno ->"Pedro Pedrito".equalsIgnoreCase(alumno));
		listaAlumnos.forEach(alumno ->{
			System.out.println(alumno);
		});
		
		//System.out.println(max.length());
									
	}
}