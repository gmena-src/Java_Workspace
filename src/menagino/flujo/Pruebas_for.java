package menagino.flujo;

import java.util.Scanner;

public class Pruebas_for {

        public static void main(String[] args) {
                // TODO Auto-generated method stub

               /* int a=25;
                int b=43;
                int c=1234;
                
                int sum=(a*b)+(c/b+(a+b+c))%2;
                
                if(sum==1) System.out.println("El resultado es impar");
                else System.out.println("El resultado es par");*/
                int aprobado=5;
                int reprobado=2;
                int examen=3;
                
                System.out.println("Asignaremos la nota correspondiente a cada alumno" + "\n  ");
                
                Scanner teclado=new Scanner(System.in);
                
                int [] notas=new int[10];
                
                notas[0]=5;
                notas[1]=10;
                notas[2]=1;
                notas[3]=3;
                notas[4]=5;
                notas[5]=2;
                notas[6]=3;
                notas[7]=2;
                notas[8]=1;
                notas[9]=3;
                
                for (int i=0;i<notas.length;i++); {                                                                                                                                                                  
                                         
                        for(int resultados:notas) {
                                
                                if(resultados>=5) aprobado++;
                                if(resultados==3)examen++;
                                if(resultados<=2)reprobado++;
                        }
                        
                }                                                                                          
               System.out.println("En la clase de Matematicas hay " + aprobado + " aprobados/as, deben realizar examen " + examen + " alumnos/as, y deben recursar la materia " + reprobado + " alumnos/as.");
        }

}
