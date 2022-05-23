package menagino.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));//Declaracion e Inicializacion 
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad puedes pasar");
		}else {
			System.out.println("No puedes pasar no eres mayor de edad");
		}
	}

}
