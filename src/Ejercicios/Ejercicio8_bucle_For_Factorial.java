package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio8_bucle_For_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que deseas factorizar"));

		long factorial=numero;

		for(int i=numero-1;i>0;i--) {
			
			factorial = factorial*i;
						
		}

		System.out.println("El factorial del numero " + numero + " es " + factorial);
	}

}
