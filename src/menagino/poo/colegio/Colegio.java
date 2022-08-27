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
				
				stds[i]=nota;
				
			
		}
	}

	

	}

	public void expelStudent(String name) {
		// Llamo al metodo Alumno que retorna "vacio" para limpiar un valor dentro de un
		// array
		Alumno expulsado = new Alumno();

		for (int i = 0; i < stds.length; i++) {

			// Chequeo para no aceptar valores null
			if (stds[i] != null) {

				if (stds[i].getName() == name) {
					// Para limpiar un elemento primero duplico su valor
					stds[i] = stds[i + 1];

					// For -anidado lee y compara posicion 0/n+, en array Students("stds") y
					// Qualify("qlfc") para encontrar duplicados

				}
			}
			for (int z = 0; z < stds.length; z++) {

				for (int k = 0; k < stds.length - 1; k++) {

					if (z != k) {// recorre 1/n posiciones para buscar el repetido

						if (stds[z] == stds[k]) {

							stds[k] = expulsado;

						}
					}
				}
			}
		}
	}

	public void getDatosColegio() {

		System.out.println("Nombre Colegio: " + nameColegio + "\n" + "Capacidad: " + capacity + "\n");

	}
}
