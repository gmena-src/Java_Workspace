
public class Manipular_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Curso de Java";//Los valores String siempre van entre ""
		
		String cadena = "Hoy es un excelente dia para estudiar el Curso de Java";
		
		int ultima_letra = cadena.length();//Este metodo inicializa el indice con el 1. 
		//Y nos devuelve un int con el largo de la VARIABLE OBJETO(TIPO STRING) "cadena".
		
		System.out.println(" La primera letra de " + nombre + " es la letra " + nombre.charAt(0) + "\n");
		//METODO charAt inicializa el indice con 0 y devuelve el valor de la posicion especificada en este caso la letra "C".
		
		
		System.out.println("La ultima letra de " + cadena + " es " + cadena.charAt(ultima_letra-1));
		
		//En este caso concatenamos e imprimimos en pantalla el valor al macenado en la varible "cadena"
		//usamos una variable auxiliar "ultima_letra" para asignarle el largo de la VARIABLE OBJETO "cadena" mediante el metodo .length que nos 
		// devuelve un valor de tipo int con el numero del largo.
		
		//Luego llamamos a la variable "cadena" y utilizamos el metodo charAt, para que nos de el valor de la ultima letra, 
		// pasamos como parametro la variable ya asignada "ultima_letra-1" esto es porque charAt() comienza su indice en 0 y length() en posicion 1.
		//Con esto arreglamos el problema de desface 
		
	}

}
