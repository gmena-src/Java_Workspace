package menagino.poo.colegio;

//import java.util.Scanner;

public class UsoColegio {

	public static void main(String[] args) {
	
	Colegio C2 = new Colegio ("San Martin", 5);
	C2.addStudent("Juanito", 9);
	C2.addStudent("Marianela", 5);
	C2.addStudent("Joaquina", 7);
	C2.addStudent("Jolete", 5);
	C2.addStudent("Pipitoto", 7);
	C2.showAllStudent();
	C2.modifyQualify("Juanito", 5);
	C2.showAllStudent();
	
		
				
	}

}
