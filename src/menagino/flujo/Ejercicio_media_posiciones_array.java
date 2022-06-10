package menagino.flujo;

import java.util.Scanner;

public class Ejercicio_media_posiciones_array {

        public static void main(String[] args) {

                /*Ejercicio 2. Media en posiciones pares del Array:

               En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. Los números se almacenarán en un array 
               y el programa calculará la media de los números introducidos en las posiciones pares del array.
               (Debes utilizar el operador módulo “%”).*/               
                
               System.out.println("Ingresa 10 numeros enteros");
                
                Scanner teclado=new Scanner(System.in);
                
                int [] numeros=new int[10];
                               
                for (int i=0;i<numeros.length;i++) {       
                        
                        numeros[i]=teclado.nextInt();
                       
                        if(i%2==0 && i!=0) {
                               
                                int media=numeros[i]/2;
                                
                                System.out.println("La media de la posicion " + i + " es " + media);
                                                                 
                        }
                    
                }
                           
        }

}
/*  
CORRECCION//RESOLUCION DEL PROFESOR
 int media=0;
                int pares=0;

                System.out.println("Ingresa 10 numeros");

                Scanner entrada=new Scanner(System.in);

                int [] numeros=new int[10];

                for (int i =0;i<10;i++) {
                        numeros[i]=entrada.nextInt();                                         
                }//LLENADO DE ARRAY
                
                for (int z=0; z<10;z++) {
                        if(z%2==0 && z!=0) {
                                pares++;//CADA VES QUE UNA POSICION ES PAR, EL CONTADOR INCREMENTA EN UNO
                                
                                media=media+numeros[z];
                        }
                }
                  System.out.println("La media de las posiciones  pares del array es: " + media/pares); 
*/   


