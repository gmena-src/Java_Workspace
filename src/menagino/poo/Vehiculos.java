package menagino.poo;

public class Vehiculos {

	
	public Vehiculos(int ruedas) {//Metodo constructor, lleva el mismo nombre que la clase.
								  //Tienen como objetivo dar un Estado inicial a un objeto de clase.
								  //Se le pueden pasar parametros tanto a los metodos como a los metodos
		//Propiedades-Valores
		this.ruedas=ruedas;
		peso=2;
		ancho=2;
		largo=4;
		color="Sin Color";
		
	}
	//Metodo Setter-Establece valor a propiedad
	public void setColor(String colorVehiculo) {//Para poder pasarle el color que queramos setear, es necesario pasarle como ARG
												//Tipo y nombre de argumento, que luego se asignara a la Propiedad "Color"
		this.color=colorVehiculo;				//El <this> siempre hace referencia a la Propiedad de la Clase, y se diferencia del <Argumento o Parametro>
		
	}
	public void setPeso(int pesoVehiculo) {
		
		this.peso=pesoVehiculo;
	}
	public void setAncho(int anchoVehiculo) {
		this.ancho=anchoVehiculo;
	}
	public void setLargo(int largoVehiculo) {
		
		this.largo=largoVehiculo;
		
	}
	//Metodo Getter-Devuelve valor de propiedad
	public String getColor() {
		
		return color;//sino establecemos el valor de retorno, eclipse nos marcara error.
					 //Return devuelve el valor que esta dentro de la propiedad Color
		
	}
	public String datosVehiculo() {
		
		return "Este vehiculo tiene "+ruedas+" ruedas y su color es "+color+"."+" Ademas tiene un largo de "+largo+
				", su ancho es de "+ancho+", y su peso total es de "+peso;
	}
	//CAMPOS DE CLASE-PROPIEDADES
	private int ruedas;	//<PRIVATE>(ENCAPSULACION) SOLO ES ACCESIBLE DESDE LA PRIPIA CLASE.
	private int peso;
	private int ancho;
	private int largo;
	private String color;
	
}
