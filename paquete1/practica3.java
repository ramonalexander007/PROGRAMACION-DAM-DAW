package paquete1;


public class practica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ESCRIBE TU NOMBRE:");
		
		
		var usuario=Consola.leeString();
		System.out.println("USUARIO= "+usuario);
		System.out.println("ESCRIBE EL TITULO:");
		var titulo=Consola.leeString();
		System.out.println("RESULTADO: "+titulo+ " " +usuario);
	}

}
