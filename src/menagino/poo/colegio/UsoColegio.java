package menagino.poo.colegio;

//import java.util.Scanner;

public class UsoColegio {

	public static void main(String[] args) {
	
	Colegio C2 = new Colegio ("San Martin", 5);
	C2.addStudent("Juanito", 9);
	C2.addStudent("Marianela", 5);
	C2.addStudent("Joaquina", 7);
	C2.addStudent("Juanita", 5);
	C2.addStudent("Toto", 7);
	C2.findStudentByName("Juanita");
	C2.expelStudent("Juanita");
	C2.showAllStudent();
	
		
				
	}

}
/*El programa debe de ser capaz de crear multiples colegios, estos deben tener nombre, y una capacidad inicial de alumnos.
 * Cada colegio debe ser capaz de agregar alumnos y notas, debe poder eliminar alumnos, modificar sus notas, encontrar alumnos, 
 * y listar todos los alumnos. Ademas deben de tener un ID incremental independientemente del colegio en el que se encuentren.
 * Crear una funcion para listar todos los datos de un alumno y su colegio*/
 