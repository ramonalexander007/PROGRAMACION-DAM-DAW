package ejercicios;

public class ej_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Imprimir los n�meros del 1 al 50, si el n�mero de la interaci�n
		//actual no es divisible por 2 y el n�mero anterior al de la iteraci�n 
		//actual es divisible por 10, escribe "�Ram�n!".
	
	
		
		/**
		 * for(int i=0;i<=50;i++){
		 * 		if(i%2!=0 && i%10==0){
		 * 			syso("ramon");
		 * 		}else{
		 * 		syso(i);
		 * }
		 * }
		 * 
		 * 
		 */
		/*for(int i=0;i<=50;i++) {
			if(i%2!=0 ) {
				if(i%10==0) {
					System.out.print("�RAM�N!");
				
			}else {
				System.out.print(i);
			}
		}
	}*/
		
		for(int i=1;i<=50;i++) {
			if(i%2!=0 && (i-1)%10==0) {
				System.out.println("�RAM�N!");
			}else {
				System.out.println(i);
			}
			
			}
	
	
	
	
	}

}
