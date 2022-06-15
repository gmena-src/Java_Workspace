package Ejercicios;

public class Ejercicio_fibonacci {

	public static void main(String[] args) {
		
		
		
		
		for(int i=0;i<1;i++) {
			
			int a=0;
			int b=1;
			int c=(a+b);
			
			System.out.print(a+","+b+","+c+",");					
			
			if(a<b)
				for (int j=0;j<10;j++) {
					
				a=(b+c);
				b=(c+a);
				c=(a+b);
				
				System.out.print(a+","+b+","+c+",");
			}
			
			}
			
		}
				
	}


/*
 *i=b j=a 
 * 
 * 
 * */
 