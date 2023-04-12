package menagino.encriptador;

import java.util.Scanner;


public class encript_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el mensaje para encriptar ...");

		String mensaje = sc.next();
		
		char[] array = mensaje.toCharArray();
		System.out.println("Imprimiendo el largo "+array.length);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'a') {
				array[i] = (char) (array[i]+'i');
				System.out.println("Indice:"+" "+i+" "+"Character: "+ array[i]);
			}
		
			
		}
		String encriptado = String.valueOf(array);
		System.out.println("Mensaje encriptado "+encriptado+" largo final del mensaje "+encriptado.length());
		
	
	}
}
