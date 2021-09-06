package paquete1;

public class clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=Consola.leeInt();
		
		for(int i=0;i<numero;i++) {
			if(i%2==0) {
				System.out.println("divisible entre 2");
			}else if(i%5==0) {
				System.out.println("divisible entre 5");
			}else if(i%10==0) {
				System.out.println("divisible entre 10");
			}
		}
		
	}

}
