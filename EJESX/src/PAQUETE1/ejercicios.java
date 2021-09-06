package PAQUETE1;



public class ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println("INTRODUCE LOS SEGUNDOS: ");
		int segundos=Consola.leeInt();
		
		 int minutos,segundos2, horas;
		  minutos=segundos/60;
		  horas=segundos/3600;
		  int operacion=(-((horas*60)+(minutos*60)))+(segundos);
		 
		 
		 System.out.println(minutos+" minutos "+horas+" horas "+operacion+" segundos");
		*/
		 
		 //piramide();
		 //piramideInvertida();
		// piramidInvert();
		//pir();
		//mostrarpir();
		//ejercicio1Examen();
		//mostrarEjercicio();
		//piramideInvertida2();
		prueba3();
	}

	
	public static void piramide() {
		
		String espacio=" ";
		
		for(int numeroInicio=10;numeroInicio>0;numeroInicio--) {
			System.out.print(espacio);
			for(int numeroFila=0;numeroFila<numeroInicio;numeroFila++) {
				if(numeroInicio%2==0) {
					System.out.print("#");
				}else {
					System.out.print("$");
				}
			}espacio+=" ";
			System.out.println();
			
		}
	}
	
	public static void piramideInvertida() {
		
		System.out.println("introduce un numero: ");
		int num=Consola.leeInt();
		String espacio="";
		
		for(int numero=num;numero<=0;numero++) {
			System.out.println(espacio);
			for(int fila=numero;fila<=num;fila--) {
				if(fila%2==0) {
					System.out.println("<");
				}else {
					System.out.println(">");
				}
			}
			}
			System.out.println();
			espacio+=" ";
			
		}
	
	public static void piramidInvert() {
		System.out.println("introduce el numero que quieres que se repita: ");
		int numero=Consola.leeInt();
		
		for(int num=0;num<=numero;num++) {
			System.out.println("numero "+num+" ");
		}
	}
		
	
	public static void pir() {
		System.out.println("INTRODUCE UN NUMERO DE REPETICIONES: ");
		int numero=Consola.leeInt();
		String espacio="";
		
		for(int i=numero;i<=0;i++) {
			System.out.print(espacio);
			
			for(int j=i;j<=i;j++) {
				if(i%2==0) {
					System.out.print("<");
				}else {
					System.out.print(">");
				}
				
			
			}System.out.println();
				espacio+=" ";
			
			
		}
	}
	
	public static void mostrarpir() {
		System.out.println("cuantas filas quieres introducir?");
		int numeroFilas=Consola.leeInt();
		String espacio="";
		int totalCaracteresFila=(numeroFilas*2)-1;
		
		for(int fila=1;fila<=numeroFilas;fila++) {
			System.out.print(espacio);
			for(int caracterFila=1;caracterFila<=totalCaracteresFila;caracterFila++) {
				if(fila%2==0) {
					System.out.print(">");
				}else {
					System.out.print("<");
				}
			}
			System.out.println();
			espacio+=" ";
			totalCaracteresFila-=2;
		}
		}
	
	
		
		
	
		public static void ejercicio1Examen() {
			
			System.out.println("cuantas filas quieres introducir?");
			int numeroFilas=Consola.leeInt();
			String espacio="";
			int totalValoresFila=(numeroFilas*2)-1;
			
			for(int fila=0;fila<=numeroFilas;fila++) {
				System.out.print(espacio);
				if(fila%2==0) {
					for(int caracterFila=0;caracterFila<=totalValoresFila;caracterFila++) {
						if(fila%4==0) {
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
			
		
		public static void mostrarEjercicio() {
			
			
			System.out.println("cuantas filas quieres introducir?");
			int numFilas=Consola.leeInt();
			String espacio="";
			int totalValoresFila=(numFilas*2)-1;
			
			
			for(int fila=0;fila<numFilas;fila++) {
				System.out.print(espacio);
				if(fila%2==0) {
					for(int valorActualFlecha=0;valorActualFlecha<=totalValoresFila;valorActualFlecha++) {
						if(fila%4==0) {
							System.out.print("<");
						}else {
							System.out.print(">");
						}
					}
				}else {
					System.out.print("(");
					for(int valorActualEspacios=0;valorActualEspacios<=totalValoresFila-2 ;valorActualEspacios++) {
						System.out.print(" ");
					}
					System.out.print(")");
				}
				System.out.println();
				espacio+=" ";
				totalValoresFila-=2;
			}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		public static void piramideInvertida2() {
			System.out.println("introduce el numero de filas:");
			int numFila=Consola.leeInt();
			String espacio="";
			int totalNumeroFilas=(numFila*2)-1;
			
			for(int fila=0;fila<=numFila;fila++) {
				System.out.print(espacio);
				if(fila%2==0) {
					for(int numeroImprimido=0;numeroImprimido<=totalNumeroFilas;numeroImprimido++) {
						if(fila%4==0) {
							System.out.print("<");
						}else {
							System.out.print(">");
						}
				}
				}else{
					System.out.print("(");
					for(int numeroFinal=0;numeroFinal<=totalNumeroFilas-2;numeroFinal++) {
						System.out.print(" ");
					}System.out.print(")");
				}
				System.out.println();
				espacio+=" ";
				totalNumeroFilas-=2;
				
				}
			}
		
		
		
		
		
		public static void prueba3() {
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
}
