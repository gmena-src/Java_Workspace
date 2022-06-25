package menagino.poo;

public class UsoVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
												//Sinonimos
		Vehiculos miAuto = new Vehiculos(4);//-Objeto de tipo vehiculo
										   //-Instancia perteneciente a la clase vehiculo
										   //-Hemos instanciado la clase vehiculo
		miAuto.setColor("naranja");
		
		//Obtenemos el color y vemos que color tiene por consola
		System.out.println(miAuto.getColor());
		System.out.println(miAuto.datosVehiculo());
		
		Vehiculos moto=new Vehiculos(2);
		moto.setColor("Blanca");
		moto.setLargo(2);
		moto.setAncho(1);
		
		System.out.println(moto.datosVehiculo());
		
		Vehiculos bicicleta=new Vehiculos(2);
		bicicleta.setColor("Azul marino");
		bicicleta.setAncho(1);
		bicicleta.setLargo(2);
		bicicleta.setPeso(6);
		
		
		
	
	
	
	}

}
