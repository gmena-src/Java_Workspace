package menagino.poo.colegio;

public class Colegio {
	private String nameColegio;
	private int capacity;
	private String namesStudent[];
	private double studentsQualf[];
	private String nameStudent;
	private double studentQualf;
	private int id;

	public Colegio(String namCol, int cap) {

		nameColegio = namCol;
		capacity = cap;
		int i=cap;
		//this.namesStudent[i]=new namesStudent[i];

	}

	public void setNuevoAlumno(String name, double qualif) {
		//Necesito agregar alumnos y sus notas, posible solucion : ArrayList????
		if (id < this.capacity) {

			int i = this.capacity;
			String[] namesStudent = new String[i];
			double[] studentsQualf = new double[i];
			
			
			System.out.println(i);
			System.out.println("nombre a agregar "+name+" y nota "+qualif);
			System.out.println("Creando array de nombres y notas");
			
			namesStudent[i]=name;
			studentsQualf[i]=qualif;
			
			
			//String [] array_de_string= {"gino", "pepe", "juan", "roberto", "juanito"};
			
			System.out.println("Array completado");
			
			//for (i=0;i<namesStudent[i].length();i++) {
			//	System.out.println("Casii");
			//}
			id++;
		}

	}

	public void getDatoAlumno() {
		System.out.println("Colegio: " + nameColegio + "\n" + "Nombre: " + nameStudent + "\n" + "Nota: " + studentQualf
				+ "\n" + "ID Escolar: " + id + "\n");
	}

	public void getDatosColegio() {
		System.out.println("Nombre Colegio: " + nameColegio + "\n" + "Capacidad: " + capacity + "\n");

	}

	public void getNotaAlumno() {
		//Desarrollar un buscador que devuelva un alumno especifico y su nota
		//System.out.println("Alumno: "+namesStudent[i]+"\n"+"Nota: "+studentsQualf[i]);
	}
	
}
