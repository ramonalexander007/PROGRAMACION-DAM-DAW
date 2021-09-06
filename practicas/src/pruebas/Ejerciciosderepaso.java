package pruebas;

public class Ejerciciosderepaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		verSerie();
		numeroDisarium();
	}

	public static void verSerie() {
		System.out.println("introduce un numero par superior a 2:");
		int numeroDeFilas=Consola.leeInt();
		String espacio="";
		int totalNumeroFilas=(numeroDeFilas*2)-1;
		
		if(numeroDeFilas%2==0 && numeroDeFilas>2) {
			for(int fila=0;fila<=numeroDeFilas;fila++) {
				System.out.print(espacio);
				 if(fila%2==0) {
					for(int numeroImprimido=0;numeroImprimido<=totalNumeroFilas;numeroImprimido++) {
						if(fila%4==0) {
							System.out.print("<");
						}else {
							System.out.print(">");
						}
					}
			}else {
				System.out.print("(");
				 for(int numeroFinal=0;numeroFinal<=totalNumeroFilas-2;numeroFinal++) {
					 System.out.print(" ");
				 }System.out.print(")");
			}
				System.out.println();
				espacio+=" ";
				totalNumeroFilas-=2; 
			}
		}else {
			System.out.println("introduce un numero par que sea mayor que 2");
		}
	}
	
	
	public static void numeroDisarium() {
		System.out.println("introduce un numero:");
		int numero=Consola.leeInt();
		String cadena=Integer.toString(numero);
		int resultado=0;
		int suma=0;
		
		for(int num=0;num<cadena.length();num++) {
			resultado=Character.getNumericValue(cadena.charAt(num));
			for(int potencia=0;potencia<num;potencia++) {
				resultado*=Character.getNumericValue(cadena.charAt(num));
			}
			suma+=resultado;
		}
		System.out.println(suma);
		
		if(numero==suma) {
			System.out.println("el numero "+numero+"  es disarium");
		}else {
			System.out.println("el numero "+numero+" no es disarium");
		}
	}
	
}
