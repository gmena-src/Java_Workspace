package Ejercicios;

import javax.swing.JOptionPane;

public class Correccion_Ejercicio_bucle_for_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean valido=false;
		
		do {
			
			String email = JOptionPane.showInputDialog("Ingresa tu correo electronico");
			
			int arroba=0;
			
			boolean punto=false;
			
			for(int i=0;i<email.length();i++) {
				
				if(email.charAt(i)=='@')arroba++;//charAt nos da la posicion actual en la que se encuentra el bucle for (i), con el condicional if(preguntamos si algun caracter es ==@)
												//En caso de contener alguna la variable contador arroba++ almacenara la cantidad de las mismas.
				if(email.charAt(i)=='.')punto=true;//En este caso se utiliza la variable booleana porque se nos pide que al menos contenga 1 punto, no importa si es 1 o 40
				
			}
			
			if(arroba==1 && punto==true && email.length()>=4) valido=true;//luego de serciorar la cadena "email" con el bucle for, utilizamos el condicional if para chekear
																		  //los datos obtenidos.
			
			
		}while(valido==false);

		
		System.out.println("Correo ingresado correctamente");
	}

}
