package menagino.poo.colegio;

public class Colegio {

	private String nameColegio;
	private int capacity;
	private Alumno[] stds;
	private int index;

	public Colegio(String namCol, int cap) {
		capacity = cap;
		stds = new Alumno[capacity];
		nameColegio = namCol;

	}

	public void addStudent(String student, double qlfy) {
		// Atraves de la Clase colegio paso por parametro los datos del nuevo estudiante
		String name = student;
		double qlfs = qlfy;
		// LLamo al construcctor Alumno
		Alumno a1 = new Alumno(name, qlfs);
		// Almaceno en el Array de clase los datos
		stds[index++] = a1;

	}

	public void showAllStudent() {

		System.out.println("Lista Alumnos del Colegio: " + this.nameColegio + "\n");

		for (int i = 0; i < stds.length; i++) {

			if (stds != null) {// solo entrara sino esta vacio
				System.out.println(stds[i]);
			}
		}
	}

	public void findStudentByName(String name) {

		Alumno match = new Alumno();// variable aux para guardar el nombre Buscado en el array stds[];

		for (int i = 0; i < stds.length; i++) {

			if (stds[i] != null) {

				if (stds[i].getName() == name) {// si el name ingresado es == a algun nombre dentro del Array se extre
												// en la variable <match>
					match = stds[i];

					System.out.println("Alumno encontrado:" + "\n" + "\n" + match);

				}
			}
		}
	}

	public void modifyQualify(String name, double nota) {

		for (int i = 0; i < stds.length; i++) {
				
				if(nota!=stds[i].getQualification()) {
					
					//working ...
					
				
			}
		}
	}

	public void expelStudent(String name) {
		
		Alumno[] newstds=null;

		
		for (int i = 0; i < stds.length-1; i++) {

			if (stds[i] != null) {

				if (stds[i].getName() == name) {
					
					newstds = new Alumno[stds.length-1];
					
					for(int index=0; index < i; index++) {
						newstds[index] = stds[index];
					}
					for (int j = i; j < stds.length - 1;j++) {
						newstds[j] = stds[j+1];
					}
					break;
				}
			}
		}
	}

	public void getDatosColegio() {

		System.out.println("Nombre Colegio: " + nameColegio + "\n" + "Capacidad: " + capacity + "\n");

	}
}
