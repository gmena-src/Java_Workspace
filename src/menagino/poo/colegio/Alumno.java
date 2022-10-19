package menagino.poo.colegio;

public class Alumno {
	//Propiedades del campo de clase
	private String name;
	private double qualification;
	public static int id;
	
	//Constructor
	public Alumno (String name, double qlf) {
		this.name=name;
		this.qualification=qlf;
		
	}
	public Alumno () {
		this.name=" ";
		this.qualification=' ';
	}
	public String getName() {
		return this.name;
	}
	public double getQualification() {
		return this.qualification;
	}
	@Override
	public String toString() {//sobre esribiendo toString para mostrar datos.
		return "Nombre: "+name+"\n"+"Calificacion: "+qualification+"\n"+"ID: "+id+++"\n";
	}
	

}
