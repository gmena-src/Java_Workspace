package Ejercicios;

public class UsoCuentas {

	public static void main(String[] args) {
		
	
		CuentaCorriente cuenta1=new CuentaCorriente("Juan", 52345.45);
		CuentaCorriente cuenta2=new CuentaCorriente("Carlos Perez", 22349.45);
		CuentaCorriente cuenta3=new CuentaCorriente("Gino", 1000);
	
		System.out.println(cuenta1.getDatos());
		System.out.println(cuenta2.getDatos());
		System.out.println(cuenta3.getDatos());
		
		cuenta1.setTransferencia(cuenta1, cuenta2, 200);
		System.out.println("Saldo cuenta 1 "+cuenta1.getSaldo());
		
		CuentaCorriente c4=new CuentaCorriente("", 0); 
		System.out.println(c4.getDatos());
		
	}

}
