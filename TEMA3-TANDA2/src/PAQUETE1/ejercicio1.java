package PAQUETE1;



public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ejercicio 1  tanda 2 tema 3
		
		char opcion;
		boolean salir=false;
		
		while(!salir) {
			
			System.out.println("A.-DESGLOSAR SEGUNDOS");
			System.out.println("B.-NUMERO TRIANGULAR");
			System.out.println("C.-SUMARIO");
			System.out.println("D.-FACTORIAL");
			System.out.println("E.-SALIR");
			
			opcion=Consola.leeChar();
			
			switch(opcion) {
			case 'A':
				System.out.println("INTRODUCE EL NUMERO DE SEGUNDOS:");
					int segundos=Consola.leeInt();
					int operacion1=segundos/60;
					int operacion2=operacion1/60;
					int operacion3=-(operacion1+operacion2)+(segundos);
					System.out.println(segundos+"segundos = "+operacion1+" horas "+operacion2+" minutos "+operacion3+"segundos");
				
				break;
			case 'B':
				
				break;
			case 'C':
				System.out.println("introduce la cantidad de numeros a introducir:");
				int numeros=Consola.leeInt();
				int numero, suma=0;
				
				for(int i=1;i<=numeros;i++){
					System.out.println("introduce el numero "+i+" :");
					numero=Consola.leeInt();
					suma+=numero;
					
					
				}System.out.println("suma: "+suma);
				
				
				break;
			case 'D':
				System.out.println("INTRODUCE UN NUMERO:");
				int num=Consola.leeInt();
				if(num<20) {
					System.out.println("EL NUMERO QUE HAS PUESTO ES: "+num);
				}else {
					System.out.println("ERROR");
				}
				salir=true;
				break;	
			case 'E':
					salir=true;
				System.out.println("usted ha salido del programa");
				break;
			
				
			}
		}
	}

}
