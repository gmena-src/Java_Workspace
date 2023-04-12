package menagino.poo.colegio;

//import java.util.Scanner;

public class UsoColegio {

	public static void main(String[] args) {
	
		Colegio c1 = new Colegio("Maria", 7);
		c1.addStudent("Juanito", 5);
		c1.addStudent("Juan", 9);
		c1.addStudent("Nito", 7);
		c1.addStudent("Manito", 6);
		c1.showAllStudent();
		
				
	}

}
/*El programa debe de ser capaz de crear multiples colegios, estos deben tener nombre, y una capacidad inicial de alumnos.
 * Cada colegio debe ser capaz de agregar alumnos y notas, debe pode eliminar alumnos, modificar sus notas, encontrar alumnos, 
 * y listar todos los alumnos. Ademas deben de tener un ID incremental independientemente del colegio en el que se encuentren.
 * Crear una funcion para listar todos los datos de un alumno y su colegio*/
 