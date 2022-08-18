package menagino.poo.colegio;

public class Alumno {

	private String name;
	private double qualification;
	private static int id;

	public Alumno(String name, double qualification) {
		this.name = name;
		this.qualification = qualification;
		id++;
	}

	public String getName() {
		return this.name;
	}

	public double getQualif() {
		return this.qualification;
	}

}
