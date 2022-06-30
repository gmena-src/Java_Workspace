package Ejercicios;

import java.util.Random;

public class CuentaCorriente {
	//Constructor					Parametros
	public CuentaCorriente(String nombreTitular, double saldo) {
		
		if(nombreTitular=="") {
		//El <this.> lo usamos para diferenciar la propiedad del parametro que tienen el mismo nombre
			this.nombreTitular="Error al crear cuenta, asigne un Nombre.";
		}else this.nombreTitular=nombreTitular;
		
		if (saldo<=0 && saldo<=999 ) {
			System.out.println("Error el monto minimo para crear una cuenta es $1000");
			int error=0;
			this.saldo=error;
		}else this.saldo=saldo;
		
		if(nombreTitular=="") {
			System.out.println("Imposible crear una cuenta");
		}else {
			Random rdn=new Random();//creamos un objeto de la clase random para asignar a "nombreCuenta"
			nombreCuenta=Math.abs(rdn.nextLong());//Math.abs devuelve un numero absoluto(sin decimales ni negativos)
		}										 //Se puede usar un casting a entero o Math.round por ejemplo
		 
	}
	
	public void setIngreso(double ingreso) {
		if(ingreso<=0) {
			System.out.println("Deposito invalido");
		} else saldo+=ingreso;
		
	}
	public void setReintegros(double reintegro) {
		if(reintegro<=0) {
			System.out.println("Retiro invalido");
		}else saldo-=reintegro;
	}
	public static void setTransferencia(CuentaCorriente C1, CuentaCorriente C2, double transferencia) {
		C1.saldo-=transferencia;
		C2.saldo+=transferencia;
		//Al utilizar la palabra static obligamos a que el que maneje la transferencia sea La clase y no el objeto cuenta que a sido creado
		//En resumen es el banco que realiza la accion transferencia mas alla de que el usuario efetue la misma.
	}
	
	public String getSaldo() {
		return "El saldo actual es $" + saldo;
	}
	public String getDatos() {
		return "Titular: "+nombreTitular+"\n"+
				"N° de cuenta: "+nombreCuenta+"\n"+
				"Saldo: "+saldo;
	}
	//Propiedades, encapsulamiento (private)
	private double saldo;
	private String nombreTitular;
	private long nombreCuenta;
}
