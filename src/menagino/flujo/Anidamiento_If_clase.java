package menagino.flujo;

import javax.swing.JOptionPane;

public class Anidamiento_If_clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Que edad tienes?"));
		
		boolean mayor_edad=(edad>=18);
		
	
		if (mayor_edad){//no es necesario dictaminarla como false, cuando aparece de esta manera si cumple con la condicion entrara satisfactoriamente al condicional
			
			JOptionPane.showMessageDialog(null, "Eres mayor de edad");
			
			String Libreta=JOptionPane.showInputDialog("¿Tienes Lireta de conducir?");
			
			if (Libreta.equalsIgnoreCase("si")) JOptionPane.showMessageDialog(null, "Todos los datos estan correto, puedes conducir");
												
			else JOptionPane.showMessageDialog(null, "Eres mayor de edad pero no tienes libreta de conducir por lo contrario no pueder circular");
														
		}else JOptionPane.showMessageDialog(null, "Lo siento los menores de edad no pueden conducir");
								
	}

}

/*//Codigo Base, arriba implementamos Booleanos y simplificacion del codigo, cuando en un "IF" hay solo una linea de codigo podemos omitir las "{}" lo mismo en el ELSE. 
 * int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Que edad tienes?"));
		
		if (edad>=18){
			
			JOptionPane.showMessageDialog(null, "Eres mayor de edad");
			
			String Libreta=JOptionPane.showInputDialog("¿Tienes Lireta de conducir?");
			
			if (Libreta.equalsIgnoreCase("si")) {
				
				JOptionPane.showMessageDialog(null, "Todos los datos estan correto, puedes conducir");
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Eres mayor de edad pero no tienes libreta de conducir por lo contrario no pueder circular");
			}
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Lo siento los menores de edad no pueden conducir");
		}*/
 