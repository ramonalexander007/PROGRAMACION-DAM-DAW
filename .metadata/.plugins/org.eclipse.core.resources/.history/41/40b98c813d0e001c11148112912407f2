package LOPPS;

public class LOOP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//piramideInvert();
		//filasDeNumeros();
		//piramideLateral();
		//tablaDeMultiplicar();
		//piramideAlRevesSimbolos();
		piramideReves();
	}
	/*public static void loop1() {
		int numero=Consola.leeInt();	
		
		
		for(int i=numero;i>1;i--) {
			
		}
		
		}*/
	
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
	    
	  public static void filasDeNumeros() {
		  
		for(int fila=0;fila<10;fila++) {
			
			for(int numeroFila=1;numeroFila<=10;numeroFila++) {
				System.out.print(numeroFila+" ");
			}
			System.out.println();
		}
	  }
	  
	  public static void piramideLateral() {
		  
		  for(int fila=1;fila<=10;fila++) {
			  for(int numero=1;numero<=fila;numero++) {
				 System.out.print(numero+" "); 
			  }
			  System.out.println();
		  }
	  }
	  
	  
	  public  static void tablaDeMultiplicar() {
		  System.out.println("INTRODUCE LA TABLA DE MULTIPLICAR QUE QUIERAS: ");
		 int TABLA=Consola.leeInt();
		 int inicio=0;
		 
		 while(inicio<=10) {
			 int multiplicador=inicio*TABLA;
			 System.out.println(TABLA+" X "+inicio+" = "+multiplicador);
			 inicio++;
		 }System.out.println();
	  }
	  
	  public static void piramideAlRevesSimbolos() {
		  int numeroFinal=9;
		  String espacio=" ";
		  
		  for(int i=0;i<=numeroFinal;numeroFinal--) {
				
				System.out.print(espacio);
				
				for(int j=0;j<numeroFinal;j++) {
					if(numeroFinal%2==0) {
						System.out.print("# ");
					}else if(numeroFinal%2!=0){
						System.out.print("& ");
					}
					
				}
				System.out.println();
				espacio+=" ";
			}
	  }
	  
	  public static void piramideReves() {
		  System.out.print("Introduce un valor");
		  int numeroFilas=Consola.leeInt();
		  String espacio="";
		  
		  for(int fila=0;fila<numeroFilas;fila++) {
			  System.out.print(espacio);
			  for(int valoresFila=numeroFilas;valoresFila>fila;valoresFila--) {
				  if(fila%2==0) {
					  System.out.print("< ");
				  }else {
					  System.out.print("> ");
				  }			 
				  
			  }
			  System.out.println();
			  
			  
			  espacio+=" ";
		  }
	  }
}
