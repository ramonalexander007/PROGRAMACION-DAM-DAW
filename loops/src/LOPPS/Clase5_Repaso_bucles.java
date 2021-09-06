package LOPPS;

import java.util.Scanner;



public class Clase5_Repaso_bucles {


	   public static void main(String[] args) {
		   
		  //piramideSimbolosNormalSinEspacios();
		  //piramideSimbolosInvertida();
		  //piramideSimbolosInvertidaSinEpacios();
		  //filasDeNumeros();
		  //piramideNumerosLateral();
		  //tablaDelNumeroIntroducido();
		  //letraRandom();
		  //creaToken();
		  //ruleta();
		  //aleatorio();   	
		  //calcularSueldo();
		  //numerosMultiplos10();		   
		  //piramideAsteriscosLateral1();
		  //piramideAsteriscosLateral2();
		  //piramideNormalNormalSinEspaciosAsteriscos();
		  //piramideInvert();
		  //numeros1a50();
		  //skip5();
		  //ramon1();
		  //ramon2();	  
		  //asteriscos();
		  //reservas();
		  //cuadrado();
		  //cuadrado2();		  
		  		  		  		 		 		 						       	   		  	  	      
	}
	   public static void piramideSimbolosNormalSinEspacios() {
		    
	        System.out.print("Introduzca numero de filas: ");
	        int numFilas = Consola.leeInt();
	       
	        for(int fila = 1; fila<=numFilas; fila++){
	            //espacios en blanco
	            for(int espacios = 1; espacios<=numFilas-fila; espacios++){
	                System.out.print(" ");
	            }
	 
	            //simbolos
	            for(int simbolos=1; simbolos<=(fila*2)-1; simbolos++){
	               
	                if(fila%2 == 0) {
						  
						   System.out.print("<");
					   }
					   else {
						   
						   System.out.print(">");
					   }
					  
	            }
	            System.out.println();
	        }
	   }
	   
	   public static void piramideSimbolosInvertida() {

	        System.out.print("Introduzca numero de filas: ");
	        int numFilas = Consola.leeInt();
	       
	        String esp="";
			   for(int fila=0; fila < numFilas; fila++){
				   System.out.print(esp);
				   for(int simbolos=numFilas; simbolos > fila; simbolos--){
					   
					   if(fila%2 == 0) {
						  
						   System.out.print("< ");
					   }
					   else {
						   
						   System.out.print("> ");
					   }
					  
				   }
				   System.out.println();
					  esp+=" ";
			   }
	   }
	   
	   public static void piramideSimbolosInvertidaSinEpacios() {

	        System.out.print("Introduzca numero de filas: ");
	        int numFilas = Consola.leeInt();
	       
	        for(int fila = 1; fila<=numFilas; fila++){
	            //espacios en blanco
	            for(int espacios = 1; espacios<fila; espacios++){
	                System.out.print(" ");
	            }
	 
	            //simbolos
	            for(int simbolos=(fila*2); simbolos<=numFilas*2; simbolos++){
	               
	                if(fila%2 == 0) {
						  
						   System.out.print("<");
					   }
					   else {
						   
						   System.out.print(">");
					   }
					  
	            }
	            System.out.println();
	        }
	   }
	   
	   
	   
	   
	   /*Utilizando dos bucles for anidados, mostrar los numeros del 1 al 10 en una 
	    misma fila y hacer lo mismo en 10 filas */
	   public static void filasDeNumeros() {
			  
		   for(int fila=0; fila < 10; fila++){
		        for(int numero=1; numero <= 10; numero++){
		            System.out.print(numero + " ");
		        }
		        System.out.println();
		    }
	   }
	   
	   public static void piramideNumerosLateral() {
		   for(int fila=1; fila <= 10; fila++){
		        for(int numero=1; numero <= fila; numero++){
		            System.out.print(numero + " ");
		        }
		        System.out.println(" ");
		    }
	   }
		   
	   public static void tablaDelNumeroIntroducido() {
		  
	        
		    System.out.println("Introduce la tabla de multiplicar que quieres ver");
		    System.out.print("Tabla: ");
		    int tabla = Consola.leeInt();
		    int numeroInicialTabla = 0;

		    while(numeroInicialTabla <= 10){
		        int resultado = tabla * numeroInicialTabla;
		        System.out.println(tabla + " X " + numeroInicialTabla + " = " + resultado);
		        numeroInicialTabla++;
		    }
	   }
	   
	   public static void letraRandom() {
		 
		   System.out.println("¿De que tamaño va a ser el token?");
		   int tamañoToken= Consola.leeInt();
			
			char [] token= new char[tamañoToken];
			System.out.print("token: ");
			
				for(int i = 0; i< token.length;i++){
					int num = NumeroAleatorio(90,65);
					
					char caracater = (char) num;
					token[i] = caracater;
					
					System.out.print(token[i]);
				}
	   }
	   
	   public static void creaToken() {
		char salir = 'n';
		int num;
		System.out.println("###CrafToken###\n");
		System.out.println("*Info: Eligir los valores(min y max) entre 0 y 9 para crear un token aleatorio \ncomprendido entre el rango seleccionado, estará combinado con letras de A hasta Z*\n");
				
		do{	
			System.out.println("¿Cuál va a ser el mínimo?");
			System.out.println("*Info: Introducir un valor entre 0 y 9*");
				
			int min = Consola.leeInt();
			
				if(min > 9 || min < 0) {
					System.out.println("El minimo no puede se mayor que 9 ni menor que 0");
					continue;
				}
				
			System.out.println("¿Cuál va a ser el máximo?");
			System.out.println("*Info: Introducir un valor entre 0 y 9 que sea igual o mayor que el mínimo*");
			
			int max = Consola.leeInt();
			
			do {
				
				if(max > 9) {
					System.out.println("*Info: El maximo no puede se mayor que 9*");
					System.out.println("¿Cuál va a ser el máximo?");
					System.out.println("*Info: Introducir un valor entre 0 y 9 que sea igual o mayor que el mínimo*");
					max = Consola.leeInt();
				}
				else if(max < min) {
					System.out.println("*Info: El maximo no puede ser menor que el mínimo*");
					System.out.println("¿Cuál va a ser el máximo?");
					System.out.println("*Info: Introducir un valor entre 0 y 9 que sea igual o mayor que el mínimo*");
					max = Consola.leeInt();
					
				}
			}while(max > 9 || max < min);
							
			System.out.println("¿De qué tamaño va a ser el token?");
			int tamañoToken= Consola.leeInt();
			
			char [] tokenChar= new char[tamañoToken/2];
												
			int [] tokenNum= new int[tamañoToken/2];
			
			System.out.println();
			System.out.print("Token: ");
			
			
			
			int resto = tamañoToken%2;
					
			if(resto == 0) {
			
				for(int i = 0; i< tokenNum.length;i++){
					num = NumeroAleatorio(max,min);
					tokenNum[i] = num;
					System.out.print(tokenNum[i]);																											
					
					for(int j = i; j<=i ;j++){
						int numero = NumeroAleatorio(60,126);				
						char caracater = (char) numero;
						tokenChar[j] = caracater;
						
						System.out.print(tokenChar[j]);						
					}
				}				
			}
			else{
				
				for(int i = 0; i< tokenNum.length;i++){
					num = NumeroAleatorio(max,min);
					tokenNum[i] = num;
					System.out.print(tokenNum[i]);																												
					
					for(int j = i; j<=i ;j++){
						int numero = NumeroAleatorio(126,60);					
						char caracater = (char) numero;
						tokenChar[j] = caracater;
						
						System.out.print(tokenChar[j]);					
					}
				}
				
				int numero = NumeroAleatorio(max,min);//mostramos un numero mas porque es impar
				System.out.print(numero);
			}
			System.out.println();
			System.out.println("\n¿Quieres crear otro token? s/n");
			salir= Consola.leeChar();
			
				if(salir == 'n') {
					System.out.println("Gracias por usar CrafToken");
					break;
				}
				
		}
		while(true);
		
	}
			
	   
	   
	   public static void ruleta() {
		   System.out.println("Bienvenido");
		   int saldo = 1000;
		   
		   do {
			   if(saldo == 0) {
				   System.out.println("No tienes dinero, adios");
				   break;
			   }
			   
			   System.out.println("saldo" +saldo);
			   System.out.println("cuanto quieres apostar");
			   int apuesta = Consola.leeInt();
			   
			   if(apuesta > saldo) {
				   System.out.println("no tienes dinero suficiente, introduce una cantidad menor");
				   continue;
			   }
			   else{
				   System.out.println("A qué número quieres apostar?");
				   int numeroElegido = Consola.leeInt();
				   int aleatorio = NumeroAleatorio(3,0);
					   if(numeroElegido == aleatorio) {
						   System.out.println("Enhorabuena!, a caido tu numero: "+aleatorio);
						   saldo += apuesta * 3;
					   }else {
						   System.out.println("lo siento!, no a caido tu numero: "+numeroElegido+", a caido el "+aleatorio);
						   saldo -= apuesta;
					   }
			   }
			   
		   }while(true);
		   	  		   
	   }
	   
	   
	   public static int NumeroAleatorio(int max, int min) {
		   	  
		   double generarNumero = Math.random()* (max-min +1) + (min);
		  
		   int aleatorio = (int) generarNumero;
		 		   
		   return aleatorio;
	   }
	   
	   public static void aleatorio() {
		 //double generarNumero = Math.random()*3+2;//(de 0 a 37)
		   /*El segundo valor(0 en este caso) es desde donde empieza y la suma
		   de los 2 némeros(38 + 0 = 38) es hasta donde va el rango sin incluir 
		   el último valor, es decir, sin icluir el valor del resultado de la suma*/
		   
		   /*NumeroAleatorio = (int) generarNumero;
		   
		   System.out.println(NumeroAleatorio);*/
		   
		   int contador = 0;
		   int aleatorio;
		   
		   do{
			   aleatorio = NumeroAleatorio(5, 0);
			   System.out.println(aleatorio);
			   			   			  			   			   			   
			   contador++;
			   					   		   
		   }
		   while(contador < 100);
		   
	   }
	   
	   
	 //Calcular el sueldo segun el aumento o descuento del sueldo
	   public static void calcularSueldo() {
		 //Aumento o Descuento = Valor del objeto * Porcentaje de descuento o aumento / 100	   
		   
		double sueldo, nuevo_sueldo, aumento;
			       
	      System.out.print("ingrese sueldo: ");
	      sueldo =Consola.leeDouble();
	          
	         if(sueldo<=1000) {
	          aumento = sueldo * 15 / 100;
	          nuevo_sueldo = sueldo + aumento;
	          System.out.println("el sueldo final es: "+nuevo_sueldo);   
	         }
	         else if(sueldo>1000) {
	          aumento = sueldo * 10 / 100;
	       	  nuevo_sueldo = sueldo + aumento;
	       	  System.out.println("el sueldo final es: "+nuevo_sueldo);         
	         }
	   }
	   
	  //numerosMultiplos10
	  public static void numerosMultiplos10() {
			   
			   for(int i = 500; i > 0; i--) {
		        	if(i%10 == 0) {
		        	     System.out.println();
		        	}        	
		        	System.out.print(i+" ");
		        }			
		   }
	   
	   
	  //piramideAsteriscosLateral1
	  public static void piramideAsteriscosLateral1() {
		   int filas; 
		   int num = 1;
	       System.out.print("Introduce el número de líneas del triángulo: ");
	       filas = Consola.leeInt();
	       
	        for(int i=1; i<=filas; i++){
	            for(int j=1; j<=i; j++){
	                System.out.print("*");
	                num++;
	            }
	            System.out.println();
	        }
		 }
	   
	   //piramideAsteriscosLateral2
	   public static void piramideAsteriscosLateral2() {
			  System.out.print("introduce el numero de filas");
			  int alturaFilas = Consola.leeInt();
			  for (int fila=1;fila<=alturaFilas;fila++){//1 bucle nos coloca en cada fila	          
		            for(int numerosDeLaFila=1;numerosDeLaFila<=fila;numerosDeLaFila++){ //2 bucle imprime los numeros en cada fila
		                System.out.print(numerosDeLaFila);
		            }		            
		            System.out.println();//Saltamos de linea
		        }
		  }
	   
	  
	   
	   public static void piramideNormalNormalSinEspaciosAsteriscos() {
		    
	        System.out.print("Introduzca numero de filas para pirámide normal sin espacios de *: ");
	        int numFilas = Consola.leeInt();
	       
	        for(int fila = 1; fila<=numFilas; fila++){
	            //espacios en blanco
	            for(int espacios = 1; espacios<=numFilas-fila; espacios++){
	                System.out.print("#");
	            }
	 
	            //asteriscos
	            for(int asteriscos=1; asteriscos<=(fila*2)-1; asteriscos++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	   }
	   
	   
	   	//piramide Invertida    
	   public static void piramideInvert() {
		 
		  int num = 10;
		  String esp = "";
		  
		  for(int i = 0; i < num ; num--){
			  
			 System.out.print(esp);
	    	
	    	 for(int j = 1; j< num; j++ ) {
	    		 System.out.print(j+" ");	    	        	       				      		    		      		      
	    	 }
		 
	    	 System.out.println();
	    	 esp+= " ";		  
		  }		
	  }
	                
	   
	   	 	      
	   // A)imprimir los números del 1 al 50		
	   public static void numeros1a50(){
		 
		    for(int i = 1; i <= 50; i++){	      	     
		      System.out.print(i+" ");	      
		    }
		  }
		
	 
		 
	  //B)imprimir los números del 1 al 50, si el número es divisible por 5, omítalo,
	   public static void skip5(){
		    for(int i = 1; i <= 50; i++){

		      if(i%5 == 0){//cuando encuentra un multiplo de 5 no lo mostramos
		    	  System.out.print(" ");
		      }
		      else{
		    	  System.out.print(i+" ");
		      }
		    }
		  }
	   
	   
	    //C)imprimir los números del 1 al 50, si el número es divisible por 10 o 15, escriba "¡Ramón!",
		  public static void ramon1(){
			
		    for(int i = 1; i <= 50; i++){

		      if(i%10 == 0 || i%15 == 0){//cuando encuentra un multiplo de 10 o 15 mostramos ramon
		        System.out.print( "Ramón ");
		      }
		      else{
		    	  System.out.print(i+" ");
		      }
		    }		    	 
		  }

		  
		 
		
		/*D)imprimir los números del 1 al 50, si el número no es divisible por 2 y el número
		  anterior es divisible por 10, escriba "¡Ramón!".*/
		  public static void ramon2(){
			  
			   System.out.println();
			   System.out.println();
			   double n1 = 1;
			   double n2 = 2;
			   double res= n1/n2;
			   System.out.println("0%2 = "+0%2);
			   System.out.println("-1%10 = "+(-1%10));
			   System.out.println("1%2 = "+1%2);
			  
			  System.out.println("0%10 = "+0%10);
			  System.out.println("2%2 = "+2%2);
			  System.out.println("1%10 = "+1%10);
			  
			  System.out.println();
			  System.out.println();
			  
		    for(int i = 0; i <= 50; i++){

		      if(i%2 != 0 && (i-1)%10 == 0){
		    	  System.out.print("Ramón ");
		      }
		      else{
		    	  System.out.print(i+" ");
		      }
		    }
		  }
		  
		  /*Explicacion
		  System.out.println(0%2);
		  System.out.println(-1%10);
		  System.out.println(1%2);
		  System.out.println(res);
		  System.out.println(0%10);
		  System.out.println(2%2);
		  System.out.println(1%10);		  
		  */
		  
		
		  	 
		 
		  //asteriscos y almohadillas 
		  public static void asteriscos() {
			  System.out.println("tamaño serie");
			  int tamaño = Consola.leeInt();
			  System.out.println("quieres que los numeros pares sean * ó #");
			  char opcion = Consola.leeChar();
					  
			  for(int i = 0; i <= tamaño; i++) {//puedes hacer empezando por 1 ya que el usuario es lo que entiende
				  
				  if(opcion == '*') {
					  if(i%2 == 0) {
						  System.out.println(i+"*");
					  }else {
						  System.out.println(i+"#");
					  }		  
				  }else {
					  if(i%2 == 0) {
						  System.out.println(i+"#");
					  }else {
						  System.out.println(i+"*");
					  }			  
			      }		  			  
			  }
		  }
		  
		  //libre, libre, reservado, libre, libre, libre, reservado
		  
		  public static void reservas() {
			  int tamaño = 50;
			  
			  for(int i = 1; i < tamaño; i++) {
				  System.out.print("Habitación "+i+")");
				  if(i%3 == 0 && i%5 != 0) {
					  System.out.println("Reservado");
				  }
				  if(i%5==0 && i%3 == 0) {
					  System.out.println("Reservado pero en limpieza");
				  }
				  if(i%5!=0 && i%3 != 0 || i%3 !=0){
					  System.out.println("Libre");
				  }
			  }
		 }
		  
		  public static void cuadrado() {
			  int tam = 17;
			 	  				
				  for(int j = 1; j < tam; j++ ) {
					  
					for(int i = 1; i < 10; i++ ) {
						
						
						if(j == 1) {
							System.out.print(i);
						  
						  
						}
						if(j % 2 == 0) {
							  System.out.print(" ");
						}
						if(j % 3 == 0 && j % 6 != 0 && j % 9 != 0) {
							System.out.print(" ");
							
						}
					
						if(j % 5 == 0) {
							System.out.print(" ");						
						}
					
						
						if(j % 7 == 0) {
							System.out.print(" ");
						}
						if(j % 9 == 0 ) {
							System.out.print(i);
						}																							
					} 
					System.out.println();				  				  
			  }
		  }
		  
		  
		  public static void cuadrado2() {
			  System.out.print("introduce la altura del rectangulo, tiene que ser par ");
		        int n = Consola.leeInt();
		        System.out.print("*");
		        if(n >= 0 && n<=n) {
		            //Linea superior
		            for(int i = 1; i < n/2; i++) {
		                System.out.print(" *");
		            }
		            System.out.print(" *");
		            System.out.println();
		           
		            //centro de la forma
		            for(int i = 0; i < n-2; i++) {
		                System.out.print("*");
		                for(int j = 0; j < n-1; j++) {
		                    System.out.print(" ");
		                }
		                System.out.println("*");
		            }
		           
		            //Linea inferior
		            System.out.print("*");
		            for(int i = 1; i < n/2; i++) {
		                System.out.print(" *");
		            }
		            System.out.print(" *");
		        }		               		 
		    }
		  
		  
}





























