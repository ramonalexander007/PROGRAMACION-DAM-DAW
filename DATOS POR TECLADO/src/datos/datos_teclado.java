package datos;

public class datos_teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//importar primero la clase CONSOLA.JAVA
		int num;
		String nombre;
		//1
		//le pedimos al usuario un nombre
		//guardamos el valor en la variable
		//imprimimos por pantalla el resultado que hemos guardado
		System.out.println("INTRODUCE UN NOMBRE: ");
		nombre=Consola.leeString();
		System.out.println(nombre);
		
		//pedida del nombre:
		//ejemplo--> jorge
		//se imprime--> jorge
		
		
		
		
		//2
		//le pedimos al usuario un numero  entero ya que la variable int no acepta 
		//decimales.
		//guardamos el numero en la variable
		//imprimimos por pantalla el numero que hemos guardado en la variable
		
		System.out.println("INTRODUCE UN NUMERO: ");
		num=Consola.leeInt();
		System.out.println(num);
	}

}
