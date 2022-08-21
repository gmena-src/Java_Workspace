package menagino.poo.colegio;

//import java.util.Scanner;

public class UsoColegio {

	public static void main(String[] args) {
	
	Colegio JuanPerico = new Colegio ("JuanPerico",3);
	JuanPerico.addStudent("Jose", 9);
	JuanPerico.addStudent("Maria", 5);
	JuanPerico.addStudent("Juan", 7);
	JuanPerico.showAllStudent();
	JuanPerico.findStudentByName("Juan");
	
	Colegio C2 = new Colegio ("Pastor", 5);
	C2.addStudent("Juanito", 9);
	C2.addStudent("Marianela", 5);
	C2.addStudent("Joaquina", 7);
	C2.addStudent("Jolete", 5);
	C2.addStudent("Pipitoto", 7);
	C2.showAllStudent();
	C2.findStudentByName("Juanito");
	
	
	
	
		
	
		

		
				
	}

}
