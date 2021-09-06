package pruebaExamen;



public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opcion=0;
		boolean salir=false;
		
		while(!salir) {
			System.out.println("1. verSerie");
			System.out.println("2. numero Disarium");
			System.out.println("3. simplificar fraccion");
			System.out.println("4. salir");
			
			opcion=Consola.leeInt();
			
			switch(opcion) {
			
			case 1:
				verSerie();
				System.out.println();
				break;
			case 2:
				numeroDisarium();
				System.out.println();
				break;
			case 3:
				simplificarFraccion3();
				System.out.println();
				break;
			case 4:
				System.out.println("usted ha salido del menu");
				salir=true;
				break;
			default:
				System.out.println("escribe una opcion del 1 al 4");
			}
		}
	}

	
	public static void verSerie() {
		
		int numero;
		do{
		System.out.println("introduce un numero mayor que 2 y que sea numero par:");
	     numero=Consola.leeInt();
		String espacio="";
		int totalNumeros=(numero*2)-1;
		
		
		if(numero%2==0 && numero>2) {
		  	
			for(int fila=0;fila<=numero;fila++) {
				System.out.print(espacio);
					if(fila%2==0) {
						for(int numero2=0;numero2<=totalNumeros;numero2++) {
							if(fila%4==0) {
								System.out.print("<");
							}else {
								System.out.print(">");
							}
						}
					}else {
						System.out.print("(");
						for(int numero3=0;numero3<=totalNumeros-2;numero3++) {
							System.out.print(" ");
						}
						System.out.print(")");
					}
					System.out.println();
					espacio+=" ";
					totalNumeros-=2;
			}
		  
		}else {
			System.out.println("El número introducido no es correcto, por favor");
		}
		}while(numero%2!=0 || numero<=2);
		}
		
		
	public static void numeroDisarium() {
		
		System.out.println("introduce un numero:");
		int numero=Consola.leeInt();
		String cadena=Integer.toString(numero);
		int suma=0, resultado;
		
		for(int numero1=0;numero1<cadena.length();numero1++) {
			resultado=Character.getNumericValue(cadena.charAt(numero1));
			
			for(int numero2=0;numero2<numero1;numero2++) {
				resultado*=Character.getNumericValue(cadena.charAt(numero1)); 
			}
			
			suma+=resultado;
		}
		System.out.println(suma);
		
		if(numero==suma) {
			System.out.println("el numero es disarium");
		}else {
			System.out.println("el numero no es disarium");
		}
		
	}	
		
		public static void simplificarFraccion(){
			System.out.println("numerador:");
			int numerador=Consola.leeInt();
			System.out.println("denominador:");
			int denominador=Consola.leeInt();
			int contador=0;
			
			if(numerador<denominador) {
				contador=numerador;
			}else {
				contador=denominador;
			}
			
			if(numerador!=0 && denominador!=0) {
				
					for(int div=2;div<=contador;div++) {
						while(numerador%div==0 && denominador%div==0) {
						
						numerador/=div;
						
						denominador/=div;
					
					
					}
						
					}
					System.out.println(numerador+"/"+denominador);
					
				
				
				
			}else {
				System.out.println("el numerador ni el denomindor pueden ser 0");
			}
			
		}
		
		
		
		
		public static void simplificarFraccion3(){
			
			System.out.println("numerador:");
			int numerador=Consola.leeInt();
			System.out.println("denominador:");
			int denominador=Consola.leeInt();
			int contador=0;
			
			if(numerador<denominador) {
				contador=denominador;
				
			}else {
				contador=numerador;
			}
			
			if(numerador!=0 && denominador!=0) {
				
				for(int divisor=2;divisor<=contador;divisor++) {
					
				while(denominador%divisor==0 && numerador%divisor==0) {	
					numerador=numerador/divisor;
					
					denominador=denominador/divisor;
				}
				
			}
				System.out.println("fraccion="+numerador+"/"+denominador);
				
			}else {
				System.out.println("el numerador ni el denominador pueden ser 0");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
