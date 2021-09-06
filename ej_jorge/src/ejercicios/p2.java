package ejercicios;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduce cuantas veces quieres que se repita la serie:");
		int numero=Consola.leeInt();
	
		for(int i=0;i<numero;i++) {
			System.out.print("#");
			System.out.print("***");
		}System.out.println("#");
	}

}
