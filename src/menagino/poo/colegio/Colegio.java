package menagino.poo.colegio;

public class Colegio {
	
	private String nameColegio;
	private int capacity;
	private Alumno[] stds;
	private Alumno[] qlfc;
	private int index;
	private int indexq;

	public Colegio(String namCol, int cap) {
		stds = new Alumno[cap];
		qlfc = new Alumno[cap];
		nameColegio = namCol;
		capacity = cap;

	}

	public void addStudent(String student, double qlfy) {
		
		String name = student;
		double qlfs = qlfy;

		Alumno a1 = new Alumno(name, qlfs);
		stds[index++] = a1;
		qlfc[indexq++] = a1;
	}

	public void getDatosColegio() {
		System.out.println("Nombre Colegio: " + nameColegio + "\n" + "Capacidad: " + capacity + "\n");

	}

	public void showAllStudent() {
		System.out.println("Lista Alumnos del Colegio: "+this.nameColegio+"\n");
		for (int i = 0; i < stds.length; i++) {

			if (stds != null) {// solo entrara sino esta vacio
				System.out.println(stds[i].getName() + "\n" + stds[i].getQualification()+"\n");
			} 
		}
	}

	public Alumno findStudentByName(String name) {
		
		Alumno match = null;// variable aux para guardar el nombre Buscado en el array stds[];

		for (int i = 0; i < stds.length; i++) {

			if (stds[i] != null) {

				if (stds[i].getName() == name) {// probar con .equals(name),
					match = stds[i];

					System.out.println("Datos Alumno buscado: "+"\n"+"\n"+match);
				}
			}
		}
		return match;
	}

}
