package bucles_for;

public class practicando_bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//stackoverflow
		
	
		//numeroParImpar();
		//recorrerBuclesFor();
		//sumarNumerosString();
		//sumarString();
		//numero0anumero();
		//numeroa0();
		//numeros();
		//vocalesConsonantes();
		//mostrar();
		mostrar2();
}
	
	public static void numeroParImpar() {
		for(int numero=0;numero<=10;numero++) {
			if(numero%2==0) {
				System.out.println("el numero "+numero+" es par");
			}else if(numero%2!=0) {
				System.out.println("el numero "+numero+" es impar");
			}
			}
	}
	
	public static void recorrerBuclesFor() {
		
		System.out.println("hasta que numero quieres recorrer");
		
		int numero=Consola.leeInt();
		
		for(int i=0;i<=numero;i++) {
			
			for(int j=0;j<=10;j++) {
				int suma=i*j;
				System.out.println(i+" x "+j+" = "+suma);
			}
		}
	}
	
	public static void sumarNumerosString() {
		String cadenaTexto = "12345";
	    int suma = 0;
	    for(int i = 0; i < cadenaTexto.length() ; i++){
	       suma += Character.getNumericValue(cadenaTexto.charAt(i));  
	    }
	    System.out.print(suma); 
	}
	
	public static void sumarString() {
		String cadenatexto="12649";
		int suma=0;
		
		for(int i=0;i<cadenatexto.length();i++) {
			suma+=Character.getNumericValue(cadenatexto.charAt(i));
		}
		System.out.println(suma);
	}
	
	public static void numero0anumero() {
		System.out.println("INTRODUCE HASTA QUE NUMERO QUIERES QUE IMPRIMA EL BUCLE:");
		System.out.print("NUMERO: ");
		int numero=Consola.leeInt();
		
		for(int i=0;i<=numero;i++) {
			System.out.print(i+" ");
		}
	}
	
	public static void numeroa0() {
		System.out.println("¿DESDE QUE NUMERO QUIERES QUE EMPIECE?");
		System.out.print("NUMERO: ");
		int num=Consola.leeInt();
		
		for(int i=num;i>=0;i--) {
			
			System.out.print(i+" ");
		}
	}
	
	public static void numeros() {
		System.out.println("hasta que numero quieres introducir?");
		System.out.print("numero: ");
		int numero=Consola.leeInt();
		
		for(int i=0;i<=numero;i++) {
			if(i%10==0) {
				System.out.println("esto es puro codigo");
			}else if(i%2==0) {
				System.out.println("esto es el comienzo");
			}else if(i%5==0){
				System.out.println("esto es muy guay");
			}else if(i%20==0) {
				System.out.println("java mola!");
			}else {
				System.out.println(i);
			}
		}
		
		//string cuantas vocales 
		
		
	}
	public static void vocalesConsonantes() {
		String cadenaTexto="ramontxu ";
		int vocales=0;
		int consonantes=0;
		String strvocales=""; 
		String	strconsonantes="";
		
		for(int i=0;i<cadenaTexto.length();i++) {
			if(cadenaTexto.charAt(i)=='a' || cadenaTexto.charAt(i)=='e' ||cadenaTexto.charAt(i)=='i' ||cadenaTexto.charAt(i)=='o' ||cadenaTexto.charAt(i)=='u') {
				vocales++;
				strvocales+=cadenaTexto.charAt(i);
			}else {
				consonantes++;
				strconsonantes+=cadenaTexto.charAt(i);
			}
		
		}
		System.out.println("vocales = "+vocales+" | "+strvocales);
		System.out.println("consonantes = "+consonantes+" | "+strconsonantes);
		
		
	}
	
	public static void mostrar() {
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
	
	public static void mostrar2() {
		int a=0;
		int b=0;
		while(a<7) {
			System.out.print("a = "+a+" ");
			System.out.println("b = "+b);
			
			a++;
			b+=2;
		}
	}
	
	
}

