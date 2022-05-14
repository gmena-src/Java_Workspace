package menagino.EntradaSalida;

import java.util.Scanner;

public class Entrada_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre por favor: ");
		
		String nombre = entrada.nextLine();
		
		System.out.println("Hola " + nombre);
		
		
	}

}
