package ejercicios;

public class f_f23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*1 2 3 4 5 6 7 8 9 
		   1 2 3 4 5 6 7 8 
		    1 2 3 4 5 6 7 
		     1 2 3 4 5 6 
		      1 2 3 4 5 
		       1 2 3 4 
		        1 2 3 
		         1 2 
		          1*/
		
		System.out.println("numero filas:");
		int numFilas=Consola.leeInt();
		String space="";
		
		for(int numeros=0;numeros<numFilas;numFilas--) {
			System.out.print(space);
			for(int num=1;num<=numFilas;num++) {
				System.out.print("* ");
			}
			System.out.println();
			space+=" ";
		}
			
			
		
	}

}
