package ejercicios;

public class ej_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Imprimir los n�meros del 1 al 50, si el n�mero de la iteraci�n actual 
		//es divisible por 10 � 15, escribe 
		//"�Ram�n!".
		
		for(int i=1;i<=50;i++) {
			if(i%15==0 || i%10==0) {
				System.out.println("�RAM�N!");
			}else {
				System.out.println(i);
			}
		}
	}

}
