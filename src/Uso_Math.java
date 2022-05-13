
public class Uso_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Math.sqrt(9); Recibe el parametro numero "9" y para mostrarla en pantalla usamos "syso"
		
		//System.out.println(Math.sqrt(9));
		//System.out.println(Math.round(3.4));// este metodo (metodo round) redondea y recibe como parametros un "Value" de Tipo float, y nos devuelve un entero.
	
		double numero=3.4;
		
		//int resultado=Math.round(numero); EJEMPLO ERROR AL PASAR VALORES DE PARAMETROS 
		
		//Error, si bien el metodo round recibe un parametro de tipo double
		// no puede convertirlo en un int, ya que este espera un tipo Long.
		// En estos casos hacemos un llamado "Casting" ó "Refundicion" que lo implementamos de la siguiente manera
		
		int resultado=(int)Math.round(numero);
		
		System.out.println(resultado);
	
	
	
	}

}
