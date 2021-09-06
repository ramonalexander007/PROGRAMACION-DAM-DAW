package bucles_for;

public class for_a_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("INTRODUCE HASTA QUE NUMERO QUIERES QUE IMPRIMIA LA TABLA DE MULTIPLICAR");
		int contador=Consola.leeInt();
		System.out.println("TABLAS DE MULTIPLICAR HASTA EL NUMERO "+contador);
		for(int i=0;i<=contador;i++) {
			System.out.println("\nTABLA DEL "+i+"\n");
			for(int j=0;j<=10;j++) {
				int operacion=i*j;
				System.out.println(i+" x "+j+" = "+operacion);
			}
		}
	}

}
