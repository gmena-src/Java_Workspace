package Ejercicios;

import java.util.Random;

public class CuentaCorriente {
	//Constructor
	public CuentaCorriente(String nombreTitular, double saldo) {
		
		this.nombreTitular=nombreTitular;
		this.saldo=saldo;
		Random rdn=new Random();//creamos un objeto de la clase random para asignar a "nombreCuenta"
		nombreCuenta=Math.abs(rdn.nextLong());//Math.abs devuelve un numero absoluto. Esto se usa para que no nos devuelva numeros negativos.
	}
	public void setIngreso(double ingreso) {
		if(ingreso<0) {
			System.out.println("Cantidad invalida");
		} else saldo=saldo+ingreso;
		
	}
	public void setReintegros(double reintegro) {
		if(reintegro<0) {
			System.out.println("Cantidad invalida");
		}else saldo=saldo-reintegro;
	}
	public void setTransferencia(CuentaCorriente C1, CuentaCorriente C2, double transferencia) {
		C1.saldo-=transferencia;
		C2.saldo+=transferencia;
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	public String getDatos() {
		return "Titular: "+nombreTitular+"\n"+
				"N° de cuenta: "+nombreCuenta+"\n"+
				"Saldo: "+saldo;
	}
	//Propiedades
	private double saldo;
	private String nombreTitular;
	private long nombreCuenta;
}
