package examen1eval;


public class Examen {

	public static void main(String[]args) {
		
		//menu
		boolean salir=false;
		int opcion;
		
		while(!salir) {
		System.out.println();	
		System.out.println("1. VER SERIE");
		System.out.println("2. NUMERO DISARIUM");
		System.out.println("3. DIVISOR");
		System.out.println("4. SALIR");
		
		opcion=Consola.leeInt();
		
		switch(opcion) {
		case 1:
			System.out.println("has elegido la opcion de ver serie: ");
			VerSerie();
			break;
		case 2:
			System.out.println("has elegido disarium: ");
			numeroDisarium();
			break;
		case 3:
			System.out.println("has elegido simplificar:");
			break;
		case 4:
			salir=true;
			System.out.println("USTED HA SALIDO DEL MENU");
			//System.exit(0);
			break;
		default:
			System.out.println("introduce una opcion del 1 al 4");
		
		}
		
		
		
		}
	}
	
	public static void VerSerie() {
		int numeroDeFilas;
		do {
		System.out.println("introduce el numero de filas: ");
		numeroDeFilas=Consola.leeInt();
		String espacioAntesDeFila="";
		int TotalvaloresFila=(numeroDeFilas*2)-1;
		
	if(numeroDeFilas%2==0 && numeroDeFilas>2) {	
		for(int fila=0;fila<=numeroDeFilas;fila++) {
			System.out.print(espacioAntesDeFila);
			if(fila%2==0) {
				for(int caracterFila=0;caracterFila<=TotalvaloresFila;caracterFila++) {
					if(fila%4==0) {
						System.out.print("<");
					}else {
						System.out.print(">");
					}
			}
			}else {
				System.out.print("(");
				for(int valorActualEspacios=0;valorActualEspacios<=TotalvaloresFila-2;valorActualEspacios++) {
					System.out.print(" ");
				}
				System.out.print(")");
			}
			System.out.println();
			espacioAntesDeFila+=" ";
			TotalvaloresFila-=2;
		}
	  }else {
		  System.out.println("el numero de filas introducido tiene que ser mayor que 2 y tiene que ser par");
		  
	  }
	}while(numeroDeFilas%2!=0 || numeroDeFilas<2);
}


	public static void VerSerie2() {
		System.out.println("introduce el numero de filas: ");
		int numFilas=Consola.leeInt();
		String espacio="";
		int totalValoresFila=(numFilas*2)-1;
		
		for(int filaActual=0;filaActual<=numFilas;filaActual++) {
			System.out.print(espacio);
			if(filaActual%2==0) {
				for(int caracterFila=0;caracterFila<=totalValoresFila;caracterFila++) {
					if(filaActual%4==0) {
						System.out.print("<");
					}else {
						System.out.print(">");
					}
				}
			}else {
				System.out.print("(");
				for(int espacioFila=0;espacioFila<=totalValoresFila-2;espacioFila++) {
					System.out.print(" ");
				}
				System.out.print(")");
			}
			
			System.out.println();
			espacio+=" ";
			totalValoresFila-=2;
		}
	}
	
	public static void numeroDisarium() {
		System.out.println("introduce numero:");
		int numero=Consola.leeInt();
		String cadena=Integer.toString(numero);
		int resultado=0;
		int suma=0;
		
		for(int num=0;num<cadena.length();num++) {
		
			resultado = Character.getNumericValue(cadena.charAt(num));
			
			for(int potencia=0;potencia<num;potencia++) {
				
				resultado*=Character.getNumericValue(cadena.charAt(num));
				
				
			}
			
			suma+=resultado;
		}
		
		System.out.println(suma);
		
		if(numero==suma) {
			System.out.println("el numero "+numero+" es disarium");
		}else {
			System.out.println("el numero "+numero+" no es disarium");
		}
	
	}
}