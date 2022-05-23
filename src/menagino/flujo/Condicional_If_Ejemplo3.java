package menagino.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int distanciaColegio;

		double montoNucleoFamiliar;

		byte cantidadHermanos;

		distanciaColegio = Integer.parseInt(
				JOptionPane.showInputDialog("Ingresa la distancia a la que vives del Instituto en Kilometros"));

		montoNucleoFamiliar = Double
				.parseDouble(JOptionPane.showInputDialog("Ingresa el monto que percibes en tu casa al mes"));

		cantidadHermanos = Byte.parseByte(JOptionPane.showInputDialog("Ingresa cuantos hermanos tienes"));

		if (distanciaColegio > 10 && montoNucleoFamiliar <= 20000 && cantidadHermanos >= 2) {// Se evaluan las
																								// condiciones "&&" para
																								// que sea "true" deben
																								// cumplirse las dos

			System.out.println("Cumples satisfactoriamente con todos los requisitos te corresponde la Beca");

		} else {

			System.out.println("No cumples los requisitos necesarios para la Beca");
		}
	}

}
/*
 * Utilizamos la Clase Double para poder ingresar datos con Decimales 19999.999
 * Utilizamos la Clase Byte + parseByte para convertir el Objeto String a una
 * variable de tipo byte, esta variable es mas razonable ya que va desde -127 /
 * 128. Se pueden agregar la cantidad de condiciones que quieras utilizando el
 * operador booleano "&&"
 **/
