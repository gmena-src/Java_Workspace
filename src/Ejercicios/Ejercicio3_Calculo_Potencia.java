package Ejercicios;

public class Ejercicio3_Calculo_Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base, exponente;
		
		base = 1.75;
		exponente = 1.75;
		
		int resultado =(int)Math.pow(base, exponente);//Casting double to int

		//Imprimir en pantalla el resultado de la Potencia
		System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
		
	}

}
