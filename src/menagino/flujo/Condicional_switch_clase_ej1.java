package menagino.flujo;

import javax.swing.JOptionPane;

public class Condicional_switch_clase_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hijos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa cuantos hijos tienes: "));
		
		switch (hijos) {
		
		case 0:
			System.out.println("Natalidad baja");
			break;
		case 1:			
			System.out.println("Puedes hacerlo mejor");
			break;
		case 2:			
			System.out.println("Ya tienes la pareja");
			break;
		case 3:			
			System.out.println("La familia aumenta");
			break;
		case 4:			
			System.out.println("Ya tienes una familia numerosa");
			break;
		default:
			System.out.println("Suerte en pila");
		}

	}

}
/*
 * Fall Through
 * Se produce cuando no agregas un break; en cada caso. Si el valor ingresado es 0 y no tiene un break, se producira una ejecucion en cascada imprimiendo en cosola todos los casos.
 */
