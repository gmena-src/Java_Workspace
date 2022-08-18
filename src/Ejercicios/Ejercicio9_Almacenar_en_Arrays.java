package Ejercicios;

import java.util.Scanner;

public class Ejercicio9_Almacenar_en_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int positivos=0; int negativos=0; int valor0=0;
		 * 
		 * System.out.println("Introduce 10 valores tanto positivos, negativos");
		 * 
		 * Scanner teclado =new Scanner(System.in);
		 * 
		 * int [] numeros = new int [10];
		 * 
		 * for (int i=0;i<numeros.length;i++) {
		 * 
		 * numeros[i]=teclado.nextInt();
		 * 
		 * } for(int valores:numeros) {
		 * 
		 * if(valores>0)positivos++; if(valores<0)negativos++; if(valores==0)valor0++; }
		 * System.out.println("Usted a ingresado " +positivos+
		 * " numeros positivos "+"\n"+negativos +" numeros negativos y " +valor0+
		 * " de valor cero");
		 */
		int arr[][][] = { { { 1, 2, 3, 4, 5 }, { 2, 1, 3, 4, 5 }, { 1, 4, 3, 2, 5 } },
				
						{ { 5, 4, 3, 2, 1 }, { 3, 4, 2, 5, 1 }, { 1, 5, 4, 2, 3 } },
				
						{ { 5, 4, 3, 2, 1 }, { 3, 4, 2, 5, 1 }, { 1, 5, 4, 2, 3 } } };
		// int i=1;
		// imprimir array 2D
		for (int i = 0; i < 3; i++) {
			System.out.print(i+"i");
			for (int j = 0; j < 3; j++) {
				System.out.print(j+"j");
				for (int z = 0; z < 5; z++) {
					System.out.print(" "+z+"z ");
					System.out.print(arr[i][j][z] + " ");

				}
				System.out.println();
			}

			System.out.println();
		}
	}

}
