package ejercicios;

public class ej_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Imprimir los n�meros del 1 al 50, si el n�mero
		//de la iteraci�n actual es divisible por 5, om�telo.
		for(int i=1;i<=50;i++) {
			if(i%5==0) {
				System.out.print("\s"+"");
			}else {
				System.out.print(i);
			}
			
		}
		
	}

}
