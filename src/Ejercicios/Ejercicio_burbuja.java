package Ejercicios;

public class Ejercicio_burbuja {

	public static void main(String[] args) {
		
		
		int auxiliar;
		
		int [] lista=new int [20];
		
		for (int i=0;i<20;i++) {
			
			lista[i]=(int)(Math.random()*100);
			System.out.print(lista[i]+" ");
							
		}
		System.out.println("\n");
		
		for(int j=0;j<lista.length;j++) {
			
			for(int z=j+1;z<lista.length;z++) {
				
				if(lista[j]>lista[z]) {
					
					auxiliar=lista[j];
					lista[j]=lista[z];
					lista[z]=auxiliar;					
				}
			}
									
		}
		for(int burbuja:lista) {
			System.out.print(burbuja+" ");
		}
		
	}

}


