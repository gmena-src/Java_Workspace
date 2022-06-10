package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7_Bucle_for_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub									
		
		boolean emailValido=false;
		
		do {			
			String email=JOptionPane.showInputDialog("Introduce tu email");			
		
				int contador=0;
				
				for (int i=0;contador<email.length();contador++) {
										
					if(email.contains("@") && email.contains(".") && contador>16) { 
						emailValido=true;
					}																																																		
				}
												
		}while (emailValido==false);
		
		System.out.println("Email ingresado correctamente");
	}
}


//Tablas
/*for (int i=1;i<11;i++) {

for (int j=1;j<11;j++) {
	
	System.out.println(i+"x"+j+"="+(i*j));
}
}*/

