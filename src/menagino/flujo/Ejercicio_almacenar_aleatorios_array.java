package menagino.flujo;

public class Ejercicio_almacenar_aleatorios_array {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                
                /*En este ejercicio debes crear un array de 100 elementos que guarde en cada una de las posiciones un nº aleatorio entre 1 y 100. 
                El programa debe imprimir en consola todos los valores almacenados en el array. 
                Utiliza un bucle for-each para leer los valores almacenados. (Debes utilizar el método random() de la clase Math).*/
                System.out.println("Lista de 100 numeros random");                
                                
                int[] numeros=new int[100];
                
                for(int i=0;i<100;i++) {
                        
                       //int random=(int)(Math.random()*100);//   ASI LO HICE YO
                       
                       numeros[i]=(int)(Math.random()*100);  // ASI LO HIZO EL PROFESOR, OPTIMIZO UNA LINEA DE CODIGO                                            
                }
               
                for(int lista:numeros) {
                        
                        System.out.println(lista+" \n ");
                }
        }
}