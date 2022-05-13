
public class ConcatenacionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario = 1850.55;
		
		System.out.println("El sueldo de Manuel en Euros es: " + "E" + salario + " a dia de hoy." + "\n"); 
		
		// Concatenamos la cadena de texto + la variable donde tenemos almacenado el valor de salario.
		// Eclipse se da cuenta que el signo "+" esta concatenando y no SUMANDO.

		double salarioEnDolares = 1850.55*1.2;//Usando diferentes maneras de usar los Operadores.
		
		System.out.println("El sueldo de Manuel en Dolares es: " + "U$S" + salarioEnDolares + " al dia de hoy." + "\n");
		
		double salarioEnPesos = 1850.55*45;
		
		System.out.println("El salario de Manuel en Pesos mas un complemento de  $300 es: " + "$" + salarioEnPesos+300 + " al dia de hoy" + "\n");
		//Esta linea de codigo la maquina virtual no podra interpretar que queremos sumar un "Complemento de +300"
		
		double salarioEnPesos1 = 1850.55*45;
		
		System.out.println("El salario de Manuel en Pesos mas un complemento de $300 es: " + "$"  + (salarioEnPesos1+300) + " a dia de hoy.");
		//La forma correct de hacerlo es poner () para que ejecute de manera correcta esa suma.
		
	}

}
//Errores de compilacion ------- Errores de sintaxis ejemplo: ";"
//Error de ejecucion ----------- Excepciones ejemplo: En un programa donde le pedimos al usuario que ingrese su edad y el escribe un numero, 
//si bien el programa esta correctamente escrito sin erroes de sintaxis, al introducir un nombre "Juan" que es de tipo String y el programa 
//espera un valor de tipo Entero, este nos dara error en Ejecucion y nos mostrara Exception in thread "main" y la linea en la que surgue el problema.