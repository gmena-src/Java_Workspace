package menagino.ejercicios.poo;

public class Sucursal {

	//Propiedades:
	private int numero_sucursal;
	private String direccion;
	private String ciudad;
	
	public Sucursal(int numero_sucursal, String direccion, String ciudad) {
		
		this.numero_sucursal=numero_sucursal;
		this.direccion=direccion;
		this.ciudad=ciudad;
		
	}	
	final double KG = 20;//La declaracion de esta constande es para determinar el precio por Kilogramo.
	public int getNumSuc() {
		return numero_sucursal;
	}
	public String getDatosSucursal() {
		return "N° Sucursal: "+numero_sucursal+"\n"
				+"Direccion: "+direccion+"\n"
				+"Ciudad: "+ciudad;
	}
	public void setPrecioEnvio(Paquete referencia_envio, Paquete peso, Paquete prioridad) {
				
		if(prioridad.getprioridad()==0) {   		
			double precio;
			precio=0+(peso.getpeso()*KG);
			System.out.println("El precio de envio es "+precio+".");
    	}
		if(prioridad.getprioridad()==1) {   		
    		double precio;
			precio=10+(peso.getpeso()*KG);
			System.out.println("El precio de envio es "+precio+".");
    	}
		if(prioridad.getprioridad()==2) {   		
    		double precio;
			precio=20+(peso.getpeso()*KG);
			System.out.println("El precio de envio es "+precio+".");    	
		}		
    	
	}
	
}
/**/
