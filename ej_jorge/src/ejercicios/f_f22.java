package ejercicios;

public class f_f22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("cuantas filas?");
		int numeroFilas=Consola.leeInt();
		
		for(int i=0;i<=numeroFilas;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
