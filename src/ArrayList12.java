import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayList12 {

	public static void main(String[] args) {
		String alumno1 = "Luis Miguel";
		String alumno2 = "Pepito Los Palotes";
		String alumno3 = "Juan Carlos";
		String alumno4 = "Pedro Pedrito";
		String alumno5 = "Gustavo Sanchez";
		String alumno6 = "Marcia Martinez";
		String alumno7 = "Marcia Martinez";
		String alumno8 = "Gustavo Sanchez";
		
		//clase padre -----------------------> tipo a usar: hashSet, ArrayLits, LinkendList
		Collection<String> listaAlumnos = new HashSet<>();
		
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		
		//Sin alumno repetidos
		
		/*for (String alumno:listaAlumnos) {
			System.out.println(alumno);
		}*/
		
		listaAlumnos.forEach(alumno ->{
			System.out.println(alumno);
		});
		
									
	}
}