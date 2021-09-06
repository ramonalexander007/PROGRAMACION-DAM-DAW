package ejercicios;

public class ej_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Imprimir los números del 1 al 50, si el número de la iteración actual 
		//es divisible por 10 ó 15, escribe 
		//"¡Ramón!".
		
		for(int i=1;i<=50;i++) {
			if(i%15==0 || i%10==0) {
				System.out.println("¡RAMÓN!");
			}else {
				System.out.println(i);
			}
		}
	}

}
