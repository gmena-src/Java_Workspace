package menagino.flujo;

import javax.swing.JOptionPane;

public class Operador_Ternario {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                /*double salario1=Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer salario"));
                
                double salario2=Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer salario"));
                
                double salario_mayor;
                
                 if (salario1>salario2) salario_mayor=salario1;
                
                else salario_mayor=salario2;
                
                salario_mayor=(salario1>salario2)?salario1:salario2; //Operador ternario funciona. Variable declarada para almacenar el resultado 
                                                                                                           //(dentro a evaluar)+"?"+valor si se cumple":"valor sino se cumple;
                
                
                System.out.println("Salario mayor es : " + salario_mayor);*/
            
                int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));//Pedimos datos a traves de JOptionPane
                
                String mayor_edad=(edad>18)?"Eres mayor de edad":"No eres mayor de edad";//Usando el OP. Ternario con string
                
                System.out.println(mayor_edad);//Imprimimos los valores segun los datos evaluados
                
                //Op.Ternario
               /* Condición a evaluar.
                   Valor de retorno si condición es true.
                   Valor de retorno si condición es false.*/
 
                
        }

}
