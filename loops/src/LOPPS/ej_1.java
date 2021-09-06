package LOPPS;

public class ej_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("inserta una cantidad que quieres apostar:");
		int cantidadApostada=Consola.leeInt();
		int premio=(cantidadApostada)*2;
		int dineroInicial=500;
		System.out.println("indica el numero al que apuestas:");
		int numeroAlApostado=Consola.leeInt();
		double numero=Math.random()*3+0;
		int dineroTotal=dineroInicial-cantidadApostada;
		int dineroTotalGanado=premio;
		//boolean salir=false;
		
		
		//while(!salir) {
		if(numeroAlApostado!=numero) {
			System.out.println("lo siento no has ganado, tu saldo ahora es de: "+dineroTotal+" euros");
			//salir=true;
		}if(numeroAlApostado==numero) {
			System.out.println("enhorabuena has ganado, tu saldo ahora es: "+dineroTotalGanado+" euros");
		// salir=true;
		}
		//}
	}

}
