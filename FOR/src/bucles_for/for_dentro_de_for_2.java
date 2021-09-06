package bucles_for;

public class for_dentro_de_for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("INTRODUCE HASTA LA TABLA DE QUE NUMERO QUIERES INSERTAR:");
		int numero=Consola.leeInt();
		for(int  i=0;i<=numero;i++) {
			System.out.println("TABLAS DE MULTIPLICAR DEL "+numero);
			
				for(int k=0;k<=20;k++) {
					int num1=i*k;
					System.out.println(i+ "x" +k+" =" +num1);
				}
		}
	}

}
