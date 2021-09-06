package LOPPS;

public class Clase6_Ec_Bucle_for {
	
public static void main(String [] args) {
		
		//ejemploFor();
		//condicionesDentroFor();
		//condicionesForParImpar();
		recorrer2BuclesForTablas();
		
		//mostrarDe0aNum();
		//mostrarDeNumHasta0();
		
		//sumarNumerosString();
		//sumarNumerosStringIntroXteclado();
		//mostrarLetrasString();
		
		//abecedario();
		//abecedarioAlReves();
		//piramideLetras();
		
		//bucleForNormalBasico();
		//bucleForNormal();
		//bucleForaWhile();
				
	}	
	
	public static void ejemploFor() {
		 System.out.println("Ejemplo bucle for:");
	        // bucle for comienza cuando x=2
	        // Iteramos hasta x <=4
	        for(int x = 2; x <= 4; x++) {
	            System.out.println("Valor de x = " + x);
	        }
	}
	
	public static void condicionesDentroFor() {
		System.out.println("\nCondiciones dentro del for:");    
        //condiciones dentro del for
        for(int x = 0; x <= 10; x++) {
        	if(x == 5 || x == 10) {
            System.out.println("Existe el " + x);
        	}
        	
        }
	}
	
	public static void condicionesForParImpar() {
		   
        System.out.println("\nCondiciones dentro del for, PAR O IMPAR:"); 
        for(int x = 0; x <= 10; x++) {
        	if(x%2 == 0) {
            System.out.println("El número " + x + " es PAR.");
        	}
        	else {
        		System.out.println("El número " + x + " es IMPAR.");
        	}
        }
        
	}
	
	public static void recorrer2BuclesForTablas() {

        System.out.println("\nRecorrer con 2 bucles for:");  
        System.out.println("\nHasta que número quiere mostrar las tablas?:");
        
		int tablas_hasta_el_numero = Consola.leeInt();
		
		for(int i = 0; i <= tablas_hasta_el_numero; i++){
			
			System.out.println("\nTABLA DEL "+i+":\n");
			
			for(int j = 0; j <= 10; j++) {
				
				System.out.println(i+"x"+j+"="+i*j);	
			}		
		}
	}
	
	
	
	public static void sumarNumerosString(){
		String cadena = "12345";
	    int suma = 0;
	    for(int i = 0; i < cadena.length() ; i++){
	       suma += Character.getNumericValue(cadena.charAt(i));  
	    }
	    System.out.print(suma); 
	      
	 }
	
	public static void sumarNumerosStringIntroXteclado(){
		System.out.println("Introduce una serie de número para sumar: ");
		String cadena = Consola.leeString();
	    int suma = 0;
	    for(int i = 0; i < cadena.length() ; i++){
	       suma += Character.getNumericValue(cadena.charAt(i));   
	       System.out.print(cadena.charAt(i));
	       if(i < cadena.length()-1) {
	    	   System.out.print("+"); 
	       }
	    }
	    System.out.print("="+suma);           
	}
	
	public static void mostrarLetrasString() {
		String letras = "abcdefghijklmnñopqrstuvwxyz";
		for(int i = 0; i < letras.length(); i++) {
			System.out.print(letras.charAt(i));
		}	
	}
	
	public static void mostrarDe0aNum() {
		int numero;
		System.out.println("introduce un numero:");
		numero=Consola.leeInt();
		System.out.println("numeros de 0 al "+numero);
		for(int x=0;x<=numero;x++) {
			System.out.println(x);
		}
	}
	
	public static void mostrarDeNumHasta0() {
		int numero;
		System.out.println("INTRODUCE UN NUMERO: ");
		numero=Consola.leeInt();
		System.out.println("numeros desde "+numero+" hasta 0");
		for(int x=numero;x>=0;x--) {
			System.out.println(x);
		}
	}
	
	//Puedes recorrer de la A a la Z utilizando el bucle for porque se almacenan como caracteres ASCII en Java,
	//internamente, recorre del 65(letra A) al 90(letra Z) para imprimir el abecedario.
	public static void abecedario() {
		for (char x = 'A'; x <= 'Z'; x++) { //Mientras A sea menor que Z, Aumentamos a la siguiente letra(a,b,c,d...)   
            System.out.print(x);
		}
	}
	
	public static void abecedarioAlReves() { //Mientras Z sea mayor que A, Disminuimos a la siguiente letra(z,y,x,w...)   
		for (char x = 'Z'; x >= 'A'; x--) {    
            System.out.print(x);
		}
	}
	
	public static void piramideLetras() {
		for (char PrimeraLetraVertical = 'Z'; PrimeraLetraVertical >= 'A'; PrimeraLetraVertical--) {
            for (char LetraHorizontal = PrimeraLetraVertical; LetraHorizontal >= 'A'; LetraHorizontal--) {                                                                          
                System.out.print(LetraHorizontal);
            }
            System.out.println();
        }
	}
	
	public static void bucleForNormalBasico() {
		for(int a=0, b=0; a < 7; a++,b++) {
			System.out.print("a = "+a+" ");
			System.out.println("b = "+b);
		}
	}
	
	
	
	public static void bucleForNormal() {
		System.out.println("con for");
		for(int a=0, b=0; a < 7; a++,b+=2) {
			System.out.print("a = "+a+" ");
			System.out.println("b = "+b);
		}
	}
	
	public static void bucleForaWhile() {
		System.out.println("con while");
		int a = 0;
		int b = 0;
		while( a < 7) {
			System.out.print("a = "+a+" ");
			System.out.println("b = "+b);
			a++;
			b+=2;
		}
	}
	
	
				                                         	
}

