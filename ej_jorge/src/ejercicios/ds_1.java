package ejercicios;



public class ds_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//piramideNormal();
		//sumarNumerosConFor();
		//tablasMultiplicar();
		//piramideAlReves();
		//piramide();
		piramNormal();
	}
	
	
	public static void piramideNormal() {
		System.out.println("columnas");
		int numFilas=Consola.leeInt();  
		
		
		
		for(int fila=1;fila<=numFilas;fila++) {
			
			for(int espacios = 1; espacios <= numFilas - fila; espacios++) {
				//aqui imprimimos los espacios
				System.out.print(espacios);//aqui va un espacio " "
			}
			
			for(int asteriscos = 1; asteriscos <= (fila*2)-1; asteriscos++) {
				//aqui imprimimos los asteriscos
				System.out.print("*");
			}
			System.out.println();//aqui hacemos salto de fila
		}
		
	}
	
	/*Solicitar cuantos números quiere sumar el usuario, después pedir al usuario 
    que introduzca uno a uno cada número mediante un bucle FOR, informándole cada
    vez que tenga que meter un nuevo número con un mensaje (Introduce el número 1,2,3,etc..) 
    y por último realizar la suma.*/
	
	public static void sumarNumerosConFor() {
		System.out.println("introduce la cantidad de numeros a introducir:");
		int numeros=Consola.leeInt();
		int numero, suma=0;
		
		for(int i=1;i<=numeros;i++){
			System.out.println("introduce el numero "+i+" :");
			numero=Consola.leeInt();
			suma+=numero;
			
			
		}System.out.println("suma: "+suma);
		
	}
	
	
	public static void tablasMultiplicar() {
		/*int numero;
		System.out.println("introduce un numero:");
		int multiplicarNumero=Consola.leeInt();
		
		for(int i=0;i<=multiplicarNumero;i++){
			int  operacion=i*multiplicarNumero;
			System.out.println(i+"x"+multiplicarNumero+"= "+operacion);
		}*/
		System.out.println("introduce un primer numero:");
		int numero=Consola.leeInt();
		System.out.println("introduce el segundo numero:");
		int multiplicarNumero=Consola.leeInt();
		
		for(int i=0;i<=multiplicarNumero;i++) {
			System.out.println("TABLA DEL: "+i);
			for(int j=0;j<=numero;j++) {
				
				int operacion=j*i;
				System.out.println(i+" x "+j+" = "+operacion);
			}
		}
	}
	
	/*public static void piramideAlReves() {
		
		int numero=Consola.leeInt();
		
		
		for(int i=numero;i>=1;i--) {
			
			for(int j=i;j>=i;j++) {
				System.out.print("#");
				System.out.print("\n");
			}System.out.print("*");
		}*/
	
	public static void piramide() {
	
		System.out.println("Numero filas");
        int totalFilas = Consola.leeInt();
        String espacio = "";

        for(int fila = 0; fila <= totalFilas ; totalFilas--){

           System.out.print(espacio);

           for(int valoresFila = 0; valoresFila< totalFilas; valoresFila++ ) {
               if(totalFilas%2==0) {
                   System.out.print("# ");
               }
               else {
                   System.out.print("& ");
               }
           }

           System.out.println();
           espacio+= " ";
        }
		
	}
	
	public static void piramNormal() {
		
		System.out.print("Numero filas");
        int nFilas=Consola.leeInt();

        for(int filas=1;filas<=nFilas;filas++) {
            for(int es=nFilas; es >filas; es--){
                System.out.print(" ");
            }


            for(int asteriscos=0;asteriscos<(filas*2)-1;asteriscos++){
                if(filas%2==0){
                System.out.print("&");
                }
                if(filas%2!=0){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
	}
		
	}


