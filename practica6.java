package paquete1;

public class practica6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		var edad=Integer.parseInt("20");
		System.out.println("edad= " +(edad+1));
		
		
		var valorPI=Double.parseDouble("3.1416");
		System.out.println("ValorPI= " +valorPI);
		
		System.out.println("PROPORCIONA TU EDAD:");
		edad=Consola.leeInt();
		System.out.println("EDAD= " +edad);
		
		
		var edadTexto=String.valueOf(10);
		System.out.println("edadTexto=" +edadTexto);
		
		var caracter="hola";
		System.out.println("caracter= " +caracter);
	
		System.out.println("proporciona un caracter:");
		caracter=Consola.leeString();
		System.out.println("caracter= " +caracter);
	}

}
