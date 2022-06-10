package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1_Condicional_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura en centmetros, ejemplo 175"));		

		String genero=JOptionPane.showInputDialog("Ingresa tu genero con la inicial M o F");		
						
		int pesoIdeal=0;
		
		if (genero.equalsIgnoreCase("M")) {	
			
			pesoIdeal = altura - 110;			
			System.out.println("Tu peso ideal es " + pesoIdeal + " kg.");	
		}else if (genero.equalsIgnoreCase("F")) {								
			
			pesoIdeal = (altura - 120);			
			System.out.println("Tu peso ideal es " + pesoIdeal + " kg.");
		}else {
			System.out.println("Valor incorrecto");
		}
						
	}

}
