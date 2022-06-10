package menagino.flujo;

import javax.swing.JOptionPane;

public class Condicional_Switch_ej1 {

        public static void main(String[] args) {
                // TODO Auto-generated method stub

                int hijos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos hijos tienes?"));
                        
                switch (hijos) {
                case 0: 
                        System.out.println("La natalidad es baja");
                        break;
                case 1:
                        System.out.println("Por algo se empieza");
                        break;
                case 2:
                        System.out.println("Tienes la pareja");
                        break;
                case 3:
                        System.out.println("Te estas animando");
                        break;
                case 4:
                        System.out.println("Ya tienes familia numerosa");
                        break;
                        
                 default: //este es el equivalente al "else", si el usuario introduce un valor no contemplado salta en el default
                                
                         System.out.println("Vas a tener que trabajar un monton");
                }
                
        }

}
//Si no ponemos un break, se imprimiran todos los valores.(fall.through)
//El condicional switch solo puede evaluar char, byte, short, int, String o un enum
//En los cse no se permiten operadores relacionales, solo se puede evaluar igualdad. (Op. rel <, >,  etc)
//La instruccion break es opcional y la utilizaremos dependiendo de como queremos que funcione el switch