package pruebas;

public class numero_disarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		numeroDisarium();
	}

	
	public static void numeroDisarium() {
		
		System.out.println("introduce un numero:");
		int numero=Consola.leeInt();
		String cadena=Integer.toString(numero);
		int resultado=0;
		int suma=0;
		
		for(int num=0;num<cadena.length();num++) {
			resultado=Character.getNumericValue(cadena.charAt(num));
			for(int pot=0;pot<num;pot++) {
				resultado*=Character.getNumericValue(cadena.charAt(num));
			}
			suma+=resultado;
		}
		
		System.out.println(suma);
		
		if(numero==suma) {
			System.out.println("el "+numero+ " es disarium");
		}else {
			System.out.println("el "+numero+" no es disarium");
		}
		
		
		
		
	}
}
