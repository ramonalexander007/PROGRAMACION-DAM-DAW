package TEMA3A;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char opcion;
		boolean salir=false;
		
		while(!salir) {
			System.out.println("A. DESGLOSAR SEGUNDOS");
			System.out.println("B. NUMERO TRIANGULAR");
			System.out.println("C. SUMARIO");
			System.out.println("D. FACTORIAL");
			System.out.println("E. SALIR");
			
			opcion=Consola.leeChar();
			
			switch(opcion) {
			case 'A':
				System.out.println("introduce los segundos: ");
				int segundos=Consola.leeInt();
				int segundo=segundos/60;
				int seg=segundos-segundo;
				int segundo2=segundo/60;
				
				break;
			case 'B':
				
				break;
			case 'C':
				
				break;
			case 'D':
				
				break;
			case 'E':
				
				break;
			}
		}
	}

}
