
public class Manipular_Cadena2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "No hay nada mejor que levantarse un domingo para estudiar Java";
		
		System.out.println(frase.substring(22,43));//los argumentos se separan por ","
		//con este metodo extraemos una parte del String mediante numeros le decimos de donde hasta donde.
		
		
		String palabra1="Casa";
		
		String palabra2="casa";
		
		
		System.out.println(palabra1.equals(palabra2));//el metodo .equals compara dos OBJETOS y es sensible a mayusculas y minusculas(devuelve un booleano)
		
		System.out.println(palabra2.equalsIgnoreCase(palabra2));//el metodo .equalsIgnoseCase ignora las mayusculas (devuelve booleano) y comprara los OBJETOS
		
		
	}

}
