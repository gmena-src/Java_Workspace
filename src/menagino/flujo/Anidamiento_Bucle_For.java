package menagino.flujo;

public class Anidamiento_Bucle_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

				for(int i=0;i<10;i++) {
					
					for(int j=0;j<10;j++) {
						
						System.out.println("Hola");
						
					}		
					
				}
			System.out.println("Fin del programa");
	}

}
//break: sirve para while, do while, sale de cualquier tipo de bucle.
//ejemplo queremos que salga del bucle antes de tiempo, antes de cumplir con las 10 vueltas

/*	for(int i=0;i<10;i++) {
	
	System.out.println("Hola");
	
	if(i==4) break; // en estes caso el programa terminara a la 5 vuelta ya que comienza desde 0.
	
}		

*/
