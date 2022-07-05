package Ejercicios;

public class UsoCuentas {

	public static void main(String[] args) {
		
	
		CuentaCorriente cuenta1=new CuentaCorriente("Juan", 52345.45);
		CuentaCorriente cuenta2=new CuentaCorriente("Carlos Perez", 22349.45);
		CuentaCorriente cuenta3=new CuentaCorriente("Gino", 1000);
	
		System.out.println(cuenta1.getDatos());
		System.out.println(cuenta2.getDatos());
		System.out.println(cuenta3.getDatos());
		
		CuentaCorriente.setTransferencia(cuenta1, cuenta2, 200);
		CuentaCorriente.setTransferencia(cuenta3, cuenta2, 500);
		System.out.println("Saldo cuenta 1 "+cuenta1.getSaldo());
		System.out.println(cuenta3.getSaldo());
		System.out.println(cuenta2.getSaldo());
		
		CuentaCorriente c4=new CuentaCorriente("pepe", 10000); 
		System.out.println(c4.getDatos());
		c4.setReintegros(150);
		System.out.println(c4.getSaldo());
		c4.setIngreso(2200);
		System.out.println(c4.getSaldo());
		
	}

}
