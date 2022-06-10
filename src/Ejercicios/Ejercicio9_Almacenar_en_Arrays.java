package Ejercicios;

import java.util.Scanner;

public class Ejercicio9_Almacenar_en_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int positivos=0;
		int negativos=0;
		int valor0=0;
		
		System.out.println("Introduce 10 valores tanto positivos, negativos");
		
		Scanner teclado =new Scanner(System.in);
		
		int [] numeros = new int [10];
																
		for (int i=0;i<numeros.length;i++) {
			
		numeros[i]=teclado.nextInt();	
			
		}
		for(int valores:numeros) {
			
			if(valores>0)positivos++;
			if(valores<0)negativos++;
			if(valores==0)valor0++;
		}
		System.out.println("Usted a ingresado " +positivos+ " numeros positivos "+"\n"+negativos +" numeros negativos y " +valor0+ " de valor cero");

	}

}
