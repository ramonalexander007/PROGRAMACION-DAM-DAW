package datos2;

public class datos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ahora vamos a concadenar datos, tanto cadenas de textos como numeros
		//primero ponemos las variables
		
		int numero;
		String texto;
		
		//pedimos al usuario un numero(int) 
		//guardamos el numero en la variable para utilizalo mas tarde
		System.out.println("INTRODUCE UN NUMERO: ");
		numero=Consola.leeInt();
		
		
		//pedimos al usuario un nombre(string)
		//guardamos la cadena de texto en la variable para utilizarlo mas tarde
		System.out.println("INTRODUCE UN NOMBRE: ");
		texto=Consola.leeString();
		
		//ahora concadenamos el string y el int
		//al texto ponemos toUpperCase para que se muestre siempre en mayuscula
		//aunque el usuario introduzca el dato en minusculas
		
		System.out.println("BIENVENIDO "+texto.toUpperCase()+" , USTED HA ELEGIDO EL NUMERO "+numero);
	}

}
