package menagino.ejercicios.poo;

public class Paquete {
		//Propiedades:
	    private int referencia_envio;
	    private double peso;
	    private int CI;
	    private int prioridad;
	    private static int cantidad;
	    
	    public Paquete(int referencia_envio, double peso, int CI, int prioridad) {	    	
	    	
	    	this.referencia_envio=referencia_envio;
	    	this.peso=peso;
	    	this.CI=CI;	    		    	
	    	if(prioridad>=0 && prioridad<=2) {
	    		this.prioridad=prioridad;	    	
		    }else {
		    	System.out.println("Prioridad Invalida, Nivel de prioridad 0-1-2.");
		    	this.prioridad=(Integer) null;		    	
		    }
	    	this.cantidad++;
	    }	
	    
	    public void setpeso(double peso) {
	    	this.peso=peso;
	    }
	    
	    public double getpeso() {
	    	return peso;
	    }
	    
	    public void setprioridad(int prioridad) {
	    	if(prioridad>=0 && prioridad<=2) {
	    		this.prioridad=prioridad;	    	
		    }else {
		    	System.out.println("Prioridad Invalida, Nivel de prioridad 0-1-2.");
		    	this.prioridad=(Integer) null;		    	
		    }
	    }
	    
	    public int getprioridad() {
		   return prioridad;
	    }
	    public int getreferencia() {
	    	return referencia_envio;
	    }
	    public String getDatosPaquete() {
	    	return "N� Referencia: "+referencia_envio+"\n"
					+"CI: "+CI+"\n"
					+"Peso: "+peso+"\n"+
					"Prioridad: "+prioridad;
	    }
	    public static String getCantidadPaquetes(Sucursal numSucursal) {
	    	return "La cantidad de paquetes en la Sucursal N� "+numSucursal.getNumSuc()+ " es "+cantidad+" paquetes.";
	    }	    
}

/**/
