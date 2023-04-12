package menagino.poo.colegio;

public class Colegio {

	private String nameColegio;
	private int capacity;
	private int cupos;
	private Alumno[] stds;
	private int index;

	public Colegio(String namCol, int cap) {
		capacity = cap;
		stds = new Alumno[capacity];
		nameColegio = namCol;
		this.cupos=capacity-cupos;

	}

	public void addStudent(String student, double qlfy) {
		// Atraves de la Clase colegio paso por parametro los datos del nuevo estudiante
		String name = student;
		double qlfs = qlfy;
		int cupos_restantes=0;
		
		// LLamo al construcctor Alumno
		Alumno a1 = new Alumno(name, qlfs);
		// Solo agregara mas alumnos si la capacidad no es excedida.
		if (index < capacity) {
			stds[index++] = a1;
			cupos--;
		} else {
			System.out.println("No es posible agregar a " + student + " estamos sin cupos.");
		}
		

	}

	public void showAllStudent() {
		
		System.out.println("Lista Alumnos del Colegio: " + this.nameColegio + "\n");
		
		for (int i = 0; i < stds.length; i++) 
			

			if (stds[i] != null) {// solo entrara sino esta vacio
				
				System.out.println(stds[i]);

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

	public void expelStudent(String name) {

		Alumno[] arrAux = new Alumno[this.capacity];// array aux
		
		for (int i = 0; i < stds.length; i++) {// recorre lista

			if (stds[i] != null) {// chekea posiciones vacias

				if (stds[i].getName() == name) {// nombre del alumno posicion "i".

					System.out.println("ALUMNO EXPULSADO: " + name + "\n");

					for (int j = 0; j < i; j++) {

						arrAux[j] = stds[i];

					}
					for (int z = 0; z < stds.length; z++) {
						stds[i] = arrAux[z];
					}
					break;
				}
			}
		}
	}

	public void modifyQualify(String name, double nota) {

		String equalName = name;
		double updateNota = nota;

		Alumno updateNotaAlumno = new Alumno(equalName, updateNota);

		for (int i = 0; i < stds.length; i++) {

			if (equalName == stds[i].getName() && updateNota != stds[i].getQualification()) {

				stds[i] = updateNotaAlumno;
			}
		}
	}

	public void getDatosColegio() {

		System.out.println("Nombre Colegio: " + nameColegio + "\n" + "Capacidad: " + capacity + "\n" + "Cupos restantes: " + cupos +"\n");

	}
}
