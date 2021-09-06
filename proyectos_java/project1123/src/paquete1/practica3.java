package paquete1;
import java.util.Scanner;

public class practica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ESCRIBE TU NOMBRE:");
		Scanner consola=new Scanner(System.in);
		
		var usuario=consola.nextLine();
		System.out.println("USUARIO= "+usuario);
		System.out.println("ESCRIBE EL TITULO:");
		var titulo=consola.nextLine();
		System.out.println("RESULTADO: "+titulo+ " " +usuario);
	}

}
