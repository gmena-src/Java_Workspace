package menagino.poo.colegio;

public class Alumno {
	//Propiedades del campo de clase
	private String name;
	private double qualification;
	public static int id;
	
	//Metodos
	public Alumno (String name, double qlf) {
		this.name=name;
		this.qualification=qlf;
		this.id++;
	}
	public String getName() {
		return this.name;
	}
	public double getQualification() {
		return this.qualification;
	}
	@Override
	public String toString() {
		return "Nombre: "+name+"\n"+"Calificacion: "+qualification+"\n"+"ID: "+id+"\n";
	}

}
