package PAQUETE_ARRAYS;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("PARTE 1:\n");
		int[]numeros= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("PARTE 2:\n");
		
		numeros[3]=20;
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}

}
