package menagino.flujo;

import javax.swing.JOptionPane;

public class Ejemplo_While {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                
                //Ejemplo didactico
                
                String clave="Gino";
                
                String acceso="";
                
                while (!clave.equals(acceso)) {//Esto es verdad porque no es lo mismo, entonces entra al bloque, 
                                                                   //Mientras la condicion no sea false, no saldra del bucle
                        
                        acceso=JOptionPane.showInputDialog("Introduce la calve de acceso, por favor");
                        
                        if (!clave.equals(acceso)) {
                                
                                System.out.println("La clave es incorrecta");
                        
                        }
                        
                } 
                
                System.out.println("Bienvenido a la zona de Usuariosff");//Si el programa llega a esta linea, es porque la condicion del while es false.
                
        }

}
//El bucle while es indeterminado porque no sabemos cuantas veces se ejecutara el programa
