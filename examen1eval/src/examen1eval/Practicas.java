package examen1eval;


public class Practicas
{
	
	public static void main(String[] args)
	{
		Boolean salir = false;
		char opcion;
		char opcion_mayus;
		
		do{
			System.out.println("### MENÚ PRINCIPAL ###");
			System.out.println("Elige una opcion:");
			System.out.println("A. Ver serie\nB. Número Disarium\nC. Simplificar fracción\nD. FIN");
			opcion = Consola.leeChar();
			opcion_mayus =Character.toLowerCase(opcion);
		
		
		switch(opcion_mayus){
			case 'a':
				System.out.println("A) Ver serie");
				int numFilas;
				do {					
					System.out.println("Introduce el número de filas de la serie, el número introducido debe ser par y mayor o igual a 2:");
					numFilas = Consola.leeInt();							
									
					int valoresFila = (numFilas * 2)-1;//los valoresFila son el doble que las filas introducidas(el -1 es para no ponerlo en el bucle for xk el bucle empieza en 0)
					//si numFilas es 10: valoresFila = (10*2)-1 = 19, así cuando usemos el bucle para imprimir los caracteres de cada fila se iniciará en 0 y llegara hasta <= 19, asi imprimirá 20 caractéres en la primera fila, contando desde 0 hasta 19 incluído.
					String espacioAntesDeFila = "";  //variable que guardara los espacios en blanco, que irá incrementándose con un espacio más cada vuelta que de el primer bucle	
					
					
					if(numFilas % 2 == 0 && numFilas >= 2) {//comprobamos numero introducido sea par y mayor que 2
					
						for (int filaActual = 0; filaActual < numFilas; filaActual++) {//recorremos las filas, empezamos en la fila 0 y nos coloca cada vuelta en la fila actual, vamos incrementando hasta recorrer todas las filas.
		
							System.out.print(espacioAntesDeFila); // imprime el contenido de la variable espacioAntesDeFila al inicio de cada fila
							
							if(filaActual%2 == 0){//si la fila actual es par entramos en el bucle encargado de mostrar los caracteres "<" o ">".
								
								for (int valorActualCaracter = 0; valorActualCaracter <= valoresFila; valorActualCaracter++) {//explicado arriba: //si numFilas es 10: valoresFila= (10*2)-1 = 19, así cuando usemos el bucle para imprimir los caracteres de cada fila se iniciará en 0 y llegara hasta <= 19, asi imprimirán 20 caractéres en la primera fila, contando desde 0 hasta 19, ambos incluídos
									if(filaActual%4==0){//calculamos los multiplos de 4 para saber en que orientacion imprimimos el caracter.
										System.out.print("<"); //imprime flecha izquierda < cuando filaActual sea multiplo de 4(imprimirá todas las de la fila).			
									}
									else{//si filaActual NO es múltiplo de 4 imprime flecha derecha > (imprimirá todas las de la fila).	
										System.out.print(">");
									}					
								}																																																																				
							}											
							else{//si la fila actual NO es par, en las filas impares imprimimos los parentesis y espacios dentro de ellos.
								System.out.print("(");//imprimimos parentesis al inicio de la fila.
								for (int valorActualEspacios = 0; valorActualEspacios <= valoresFila-2; valorActualEspacios++) {
									/*imprimimos los espacios dentro de los parentesis y le quitamos 2 caracteres a valoresFila xk cada linea(fila) 					
									va a tener 2 parentesis que ocupan 2 huecos	y vamos a tener 2 caracteres menos por la izquierda y derecha	*/
									System.out.print(" ");																		
									 // imprime los ESPACIOS de la fila  							
								}
								System.out.print(")");//parentesis al final de la fila				
							}
							valoresFila -= 2; //cada vuelta vamos a tener 2 caracteres menos en cada fila.
							espacioAntesDeFila += " "; //cada vez se añade 1 espacio en blanco al inicio de cada fila y lo añadimos a la variable espacioAntesDeFila,
							System.out.println(); //salta a la siguiente fila.							
						}					
					}else {
						System.out.println("El número introducido NO ES CORRECTO.");//imprimimos este MENSAJE si el número introducido no es par y mayor que 2
					}
				}while(numFilas % 2 != 0 || numFilas < 2);//repetimos todo mientras el número introducido no sea par o menor que 2.
				
				System.out.println("\n");
				break;
																				
			case 'b':
				System.out.println("Número Disarium");
									
			    //Disarium sin array
			   			    
			    System.out.println("Introduce una serie de número para sumar: ");
				int num = Consola.leeInt();//135
				String cadena = Integer.toString(num);
			    
			    int suma= 0;
			    int resultado = 0;
			    for(int i = 0; i < cadena.length() ; i++){	    	
			      	    	
			    	 resultado = Character.getNumericValue(cadena.charAt(i));//cogemos el valor del índice actual
			    	 //int potencia = i;
			    	 System.out.print("El número "+resultado+" elevado a su posición "+(i+1)+" es = ");
			    	
			    	 for(int j = 1; j<= i/*potencia*/; j++ ) {
		    	     resultado *= Character.getNumericValue(cadena.charAt(i));		    	        	       				      		    		      		      
			    	 }
			    	 System.out.print(+resultado+"\n");
			    	 suma += resultado;		    	
			    }
			    if(num == suma) {
					 System.out.print("El número introducido "+num+" es disarium, porque la suma de sus digitos elevados a su respectiva posición es igual a "+suma);
				}else {
					System.out.print("El número introducido "+num+" NO es disarium, porque la suma de sus digitos elevados a su respectiva posición NO es igual, la suma es "+suma); 
				}
			    
			    System.out.println("\n");
						 			
				break;
			case 'c':
				System.out.println("Simplificar fracción");
																					    					     				     
					     //forma sencilla que me he currado y creo que va bien
						
					     System.out.println("numerador");
					     int numerador = Consola.leeInt();
					     System.out.println("denominador");					 
					     int denominador = Consola.leeInt();
					     int contador = 0;
					     
					     if(numerador > denominador){//asi podemos conseguir los primos o multiplos del numero mas grande, por tanto
					    	 contador = numerador;// los del numero mas pequeño tambien al recorrerlos todos desde contador.
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
					    				    				     			     				     				     		    				     				  
				break;
			case 'd':
				System.out.println("Has salido del programa");
				System.exit(0);//Le pasamos un 0 a la función exit(), que indica que EL PROGRAMA TERMINA con éxito y sin ningún error

			  
				break;	
				
		}
		
		}while(opcion_mayus != 'A' && opcion_mayus != 'B' && opcion_mayus != 'C' && opcion_mayus != 'D' || salir == false);
	} 			
}

/*/////Disarium con array://///

/*System.out.println("Introduce una serie de número para sumar: ");
int num = Consola.leeInt();
String cadena = Integer.toString(num);
							
int[] intArray = new int[cadena.length()]; 
			
for(int i=0; i<cadena.length(); i++){
    intArray[i] = Character.getNumericValue(cadena.charAt(i));		    
}
		 
 int suma= 0;
 int resultado = 0;
 int potencia = 0;
 
 for(int i = 0; i < intArray.length ; i++){	
	 resultado = intArray[i];
	 potencia = i;
	 System.out.print("res:"+resultado+"\n");
	 
	 for(int j = 1; j<= potencia; j++) {
	     resultado *= intArray[i];
	 }
	 System.out.print("result:"+resultado+"\n");
 	 suma += resultado;			
 }
 
 if(num == suma) {
 System.out.print("El número introducido "+num+" es disarium, porque la suma de sus digitos elevados a su posición es igual a "+suma);
 }else {
	 System.out.print("El número introducido "+num+" NO es disarium, porque la suma de sus digitos elevados a su posición NO es igual, la suma es "+suma);
 }*/



//////simplificar fracciones complicado://///

/*El valor absoluto de un número consiste en su valor, sin importar su signo.
Cuando tomamos el valor absoluto de un número, éste es siempre positivo o cero.
Por ejemplo, el valor absoluto de 5 es 5. El valor absoluto de -5 es también 5					  					 
			
Calcula y devuelve el Máximo Común Divisor del numerador y del denominador.
El MCD son los factores comunes con su menor exponente, esto es:*/

/*System.out.println("numerador");
int numerador = Consola.leeInt();
System.out.println("denominador");					 
int denominador = Consola.leeInt();
					     				     
int mcd_num = Math.abs(numerador);
int mcd_den = Math.abs(denominador);
   
int resto;
while(mcd_den!=0 && mcd_num!=0){
     resto=mcd_num%mcd_den;				          
     mcd_num=mcd_den;//maximo comun divisor			         
     mcd_den=resto;//resto				          		         
}
System.out.println("Máximo comun divisor: "+mcd_num);
System.out.println("Resto: "+mcd_den);

if(numerador==0){
     System.out.print("numerador de fracciones no puede ser cero");
}
else if(denominador==0){
     System.out.print("denominador de fracciones no puede ser cero");
}else {
		    	  		    	  	 
	 System.out.print("Fracción simplificada: ");
	 System.out.print(numerador/=mcd_num);//numerador = numerador/mcd_num;
	 System.out.print("/");
	 System.out.print(denominador/=mcd_num);//denominador = denominador/mcd_num;						  
}*/
		
