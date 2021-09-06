package ruleta;

import piramides.Consola;

public class r1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¿DE CUANTO DINERO DISPONES?");
		int dinero=Consola.leeInt();
		System.out.println("¿CUANTO DINERO QUIERES APOSTAR?");
		int apostar=Consola.leeInt();
		System.out.println("¿A QUE NUMERO QUIERES APOSTAR?");
		int numeroApostar=Consola.leeInt();
		double numeroPremiado=Math.random()*2;
		int numeroP=(int)numeroPremiado;
		int recompensa=dinero+(apostar*2);
		int dineroEnCuenta=dinero-apostar;
		int dineroRestante;
		
		if(dinero>=200) {
			System.out.println("PUEDES APOSTAR");
			if(numeroP==numeroApostar) {
				System.out.println("USTED HA GANADO, Y SU BALACE DE CUENTA ES: "+recompensa);
			}else if(numeroP!=numeroApostar) {
				System.out.println("USTED HA PERDIDO, SU BALANCE ES "+dineroEnCuenta);
			}
			
		}else if(dinero<200) {
			System.out.println("NO PUEDES APOSTAR, PON MAS DINERO");
		}
	}
	
	public static int NumeroAleatorio(int max, int min) {

        double generarNumero = Math.random()* (max-min +1) + (min);

        int aleatorio = (int) generarNumero;

        return aleatorio;
    }

}
