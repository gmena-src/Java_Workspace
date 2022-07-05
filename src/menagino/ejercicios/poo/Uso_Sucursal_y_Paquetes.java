package menagino.ejercicios.poo;

public class Uso_Sucursal_y_Paquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sucursal s1=new Sucursal(1, "1 de Agosto","Lascano");
		System.out.println(s1.getDatosSucursal());
		System.out.println("\n");
		
		
		Paquete p1=new Paquete(1234, 82, 60741759, 1);
		System.out.println(p1.getDatosPaquete());
		s1.setPrecioEnvio(p1, p1, p1);
		System.out.println("\n");
		Paquete p2=new Paquete(14, 15, 901759, 2);
		System.out.println(p2.getDatosPaquete());
		s1.setPrecioEnvio(p2, p2, p2);
		System.out.println("\n");
		Paquete p3=new Paquete(134, 8, 80741759, 0);
		System.out.println(p3.getDatosPaquete());
		s1.setPrecioEnvio(p3, p3, p3);
		System.out.println("\n");
		Paquete p4=new Paquete(234, 22, 50741759, 1);
		System.out.println(p4.getDatosPaquete());
		s1.setPrecioEnvio(p4, p4, p4);
		System.out.println("\n");
		System.out.println(Paquete.getCantidadPaquetes(s1));
		
			
	}

}
