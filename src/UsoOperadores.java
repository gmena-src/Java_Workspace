
public class UsoOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 7;

		int num2 = 5;

		num2++; // a esta altura del programa le decimos que la variable num2 incrementa en 1 el
				// valor.

		num1 += 15; // a esta altura del programa le decimos que le sume 15 a la variable num1.

		num1 -= 13; // le indicamos a esta altura que a la variable num1 se le reste 13.

		int resultado = num1 + num2; // usando los operadores aritmeticos //

		System.out.println(resultado);

	}

}
/*OPERADORES RELACIONALES (COMPARACION)
 * > MAYOR QUE
 * < MENOR QUE
 * >= MAYOR O IGUAL QUE
 * <= MENOR O IGUAL QUE
 * == IGUAL QUE : ¡¡¡¡NO PUEDES IGUALAR STRINGS CON ESTE OPERADOR!!!! SE DEBE UTILIZAR EL METODO .equals
 * != DISTINTO QUE
 * 
 * OPERADORES LOGICOS (BOOLEANOS)
 * && "Y" LOGICO en cortocircuito :  Optimizan menos, si la primera condicion no se cumple el programa no se toma la molestia de evaluar el resto de las condiciones
 * || "O" LOGICO en cortocircuito, basta con que se cumpla una condicion para continuar la ejecucion de programa, no se toma la molestia de evaluar el resto de las condiciones 
 * & "Y" este operador de Bite AND . Evaluan todas las condiciones dentro del if a diferencia de los operadores dobles. 
 * | "Ó" este operador de Bite O . Evaluan todas las condiciones dentro del if a diferencia de los operadores dobles. 
 *  * */
 