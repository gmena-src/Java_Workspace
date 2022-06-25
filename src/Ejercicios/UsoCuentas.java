package Ejercicios;

public class UsoCuentas {

	public static void main(String[] args) {
		
	
		CuentaCorriente cuenta1=new CuentaCorriente("Juan Perez", 52345.45);
		CuentaCorriente cuenta2=new CuentaCorriente("Carlos Perez", 22349.45);
		CuentaCorriente cuenta3=new CuentaCorriente("Gino", 20000);
		
		System.out.println(cuenta1.getDatos());
		System.out.println(cuenta2.getDatos());
		System.out.println(cuenta3.getDatos());
		
		cuenta1.setTransferencia(cuenta1, cuenta2, 200);
		System.out.println("Saldo cuenta 1 "+cuenta1.getSaldo());
		System.out.println("Saldo cuenta 2 "+cuenta2.getSaldo());
		
		cuenta2.setTransferencia(cuenta2, cuenta1, 1000);
		System.out.println("Saldo cuenta 1 "+cuenta1.getSaldo());
		System.out.println("Saldo cuenta 2 "+cuenta2.getSaldo());
		
		
		cuenta3.setTransferencia(cuenta3, cuenta2, 500);
		System.out.println("Saldo cuenta 3 "+cuenta3.getSaldo());
		System.out.println("saldo cuenta 2 "+cuenta2.getSaldo());
	}

}
