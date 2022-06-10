package menagino.flujo;

import javax.swing.JOptionPane;

public class Ejemplo_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Este programa cuanta la cantidad de caracteres que tiene cada palabra \n" + "Para terminar escribe Salir");

		String palabra;
		
		do {//La diferencia de este bucle indeterminado es que al menos se ejecutara una vez el programa.
			palabra=JOptionPane.showInputDialog("Introduce la palabra");
			System.out.println("La palabra introducida tiene " + palabra.length() + " caracteres.");
		}while (!palabra.equals("Salir"));//A diferencia del bucle while este evalua la condicion al final.
	
		System.out.println("Has terminado el programa");
	}

}
