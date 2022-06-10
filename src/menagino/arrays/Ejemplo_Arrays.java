package menagino.arrays;

public class Ejemplo_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int [] valores= new int[5];
		
		valores[0]=15;
		valores[1]=7;
		valores[2]=1500;
		valores[3]=9;
		valores[4]=-5;*/
		
		//int [] valores = {15,7,1500,9,-5}; //esto es otra manera simplificada de declarar un <ARRAY> DE NUMEROS ENTEROS
		
		//System.out.println("El valor de esta posicion es " + valores[4]);
		
		/*for(int i=0 ; i<valores.length ; i++) {//pasandole el nombre del array.length(nos imprime hasta el ultimo valor)
			
			System.out.println(valores[i]);
			
		}*/
			
		/*for (int elemento:valores) {//ESTO ES UN BUCLE <FOR EACH>, se declara el tipo de dato "int"+nombre de variable que quieras : "<NOMBRE DEL ARRAY>"
			
			System.out.println(elemento);
		}*/
		
		String [] array_de_string= {"gino", "pepe", "juan", "roberto", "juanito"};
		
		/*for(String nombres:array_de_string) {
			
			System.out.println(nombres);
			
		}*/
		for(int i=0;i<array_de_string.length;i++) {
			
			System.out.println(array_de_string[i]);
			
		}
		
		
	}

}
