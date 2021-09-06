package ejercicios;

public class piramideInvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		piramide_invertida();
		
	}

	public static void piramide_invertida() {
		
	System.out.println("introduce un numero:");
	int numero_filas=Consola.leeInt();
	String espacio="";
	int totalnumerofilas=(numero_filas*2)-1;
	
	
	for(int fila=0;fila<=numero_filas;fila++) {
		System.out.print(espacio);
		
		if(fila%2==0) {	
			for(int imprimir=0;imprimir<=totalnumerofilas;imprimir++) {
				if(fila%4==0) {
					
					System.out.print("<");
					
				}else {
					System.out.print(">");
					
				}
			}
		
		
		}else {
			System.out.print("(");
				for(int num_final=0;num_final<=totalnumerofilas-2;num_final++) {
					System.out.print(" ");
				}System.out.print(")");
			
		}
		
		System.out.println();
		espacio+=" ";
		totalnumerofilas-=2;
		
	}
		
	}
	
}
