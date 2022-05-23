package menagino.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		if (edad < 18) {
			System.out.println("Eres muy joven tienes " + edad + " años de edad.");
		}else if ( edad < 40) {
			System.out.println("Eres joven tienes " + edad + " años de edad.");
		}else if (edad < 65) {
			System.out.println("Eres maduro tiense " + edad + " años de edad.");
		}else {
			System.out.println("Cuidate");
		}
	}
}

/*El "else if" todas las condiciones forman una unidad un bloque
 * y se evaluen las condiciones hasta que coincida
 * Si tuvieramos una condicion con dos IF y se cumplen las dos, }
 * este imprimiria por consola las dos salidas
 * por eso es importante utilizar el ELSE IF. */
 