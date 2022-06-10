package menagino.proyecto;

import javax.swing.JOptionPane;

public class firstProyect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "Para ingresar debes registrarte siguiendo los pasos");
		
		String email = JOptionPane.showInputDialog(null, "Ingresa un correo electronico: ");
		
		String password =  JOptionPane.showInputDialog(null, "Ingresa un nombre de ingresa una password: ");
				
		boolean emailOK=email.contains(email);
		boolean passwordOK=password.contains(password);
		
	}

}
