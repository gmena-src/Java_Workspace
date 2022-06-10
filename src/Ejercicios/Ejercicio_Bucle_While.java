package Ejercicios;

import java.util.Scanner;

public class Ejercicio_Bucle_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entradaNumero = new Scanner(System.in);
				
		int intentos=0;
		
		int numero=0;
		
		while (numero!=aleatorio) {
			
			System.out.println("Introduce un numero del 1 al 100");
			
			intentos++;

			numero=entradaNumero.nextInt();
			
			if (numero<aleatorio) {
				System.out.println("El numero que buscas es mayor");
			}else if (numero>aleatorio) {				
				System.out.println("El numero que buscas es menor");
			}			
			
		}		
				
		System.out.println("El numero introducido es Correcto! lo has logrado con " + intentos + " intentos!");

	}

}
