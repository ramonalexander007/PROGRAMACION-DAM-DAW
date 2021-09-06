package paquete1;



public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();
		elevarAlCubo();
		elevarAlNumero();
	}

	public static void menu() {
		char opcion;
		boolean salir=false;
		
		while(!salir) {
			System.out.println("A. VER SERIE");
			System.out.println("B. NUMERO DISARIUM");
			System.out.println("C. SIMPLIFICAR FRACCION");
			System.out.println("D. SALIR");
			
			System.out.println("INTRODUCE UNA OPCION:");
			opcion=Consola.leeChar();
			
			switch (opcion) {
			case  'A': 
				System.out.println("VER SERIE");
				System.out.println("INTRODUZCA UN NUMERO PAR SUPERIOR A 2:");
				piramideInvertida2();
				
				break;
			
			case 'B':
				System.out.println("NUMERO DISARIUM");
				numeroDisarium();
				
				break;
			case 'C':
				System.out.println("SIMPLIFICAR FRACCION");
				simplificarFraccion2();
				
				break;
			case 'D':
				salir=true;
				System.out.println("USTED HA SALIDO DEL PROGRAMA, HASTA PRONTO");
				break;
			default:
				
			}
		}
	}
	
	public static void simplificarFraccion() {
		System.out.println("Simplificar fracción");
	     
	   
		
	     System.out.println("numerador");
	     int numerador = Consola.leeInt();
	     System.out.println("denominador");					 
	     int denominador = Consola.leeInt();
	     int contador = 0;
	     
	     if(numerador > denominador){
	    	 contador = numerador;
	     }else {
	    	 contador = denominador;
	     }
	     
	     if(numerador != 0 && denominador != 0) {
	     
		     for(int i = 2; i <= contador; i++) {
		    	 
		    	 while(numerador%i == 0 && denominador%i == 0) {
		    		 System.out.print("num "+numerador);
		    		 numerador = numerador/i;				  
		    		 System.out.println("/"+i+"="+numerador);
		    		
		    		 System.out.print("den "+denominador);
		    		 denominador = denominador/i;						    		
		    		 System.out.println("/"+i+"="+denominador);
		    	 }
		     }
		     System.out.print("Fracción simplificada = "+numerador+"/"+denominador);
	     }else {
	    	 System.out.print("denominador y numerador de fracciones no puede ser cero, porque no se puede simplificar");
	     }
	     
	     System.out.println("\n");
		
	}
	
	public static void simplificarFraccion2() {
		
		
		
		
		System.out.println("numerador");
		int numerador=Consola.leeInt();
		System.out.println("denominador");
		int denominador=Consola.leeInt();
		int contador;
		
		if(numerador>denominador) {
			contador=numerador;
		}else {
			contador=denominador;
		}
		
		if(numerador!=0 && denominador!=0) {
			
			for(int divisor=2;divisor<=contador;divisor++) {
				while(numerador%divisor==0 && denominador%divisor==0) {
					numerador=numerador/divisor;
					
					denominador=denominador/divisor;
				}
				
			}
			System.out.println("fraccion simplificada ="+numerador+"/"+denominador);
			
		}else {
			System.out.println("el numerador y el denominador no pueden ser 0");
		}System.out.println();
	}
	
	//PEDIR AL USUARIO UN NUMERO POR PANTALLA Y ESE NUMERO ELEVARLO AL CUBO 
	//SIN USAR MATHPOW Y MOSTRAR EL RESULTADO
	
	
	public static void elevarAlCubo() {
		
		System.out.println("introduce un numero:");
		int numero=Consola.leeInt();
		
		numero*=numero*numero;
		System.out.println(numero);
		
	}
	
	//PEDIR AL USUARIO UN NUMERO POR PANTALLA Y ESE NUMERO preguntarle a cuanto quiere elevarlo.
	//SIN USAR MATHPOW Y MOSTRAR EL RESULTADO
	
	
	
	public static void elevarAlNumero() {
		System.out.println("introduce un numero:");
		int numero=Consola.leeInt();
		System.out.println("introduce a que numero lo quieres elevar:");
		int exponente=Consola.leeInt();
		int resultado=1;
		
		for(int num=0;num<exponente;num++) {
			resultado=resultado*numero;
			System.out.println(resultado);
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
