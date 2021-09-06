package piramides;

public class piramide_jorge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Numero filas");
        int totalFilas = Consola.leeInt();
        String espacio = "";

        for(int fila = 0; fila <= totalFilas ; totalFilas--){

           System.out.print(espacio);

           for(int valoresFila = 0; valoresFila< totalFilas; valoresFila++ ) {
               if(totalFilas%2==0) {
                   System.out.print("# ");
               }
               if(totalFilas%2!=0) {
                   System.out.print("& ");
               }
           }

           System.out.println();
           espacio+= " ";
        }
	}

}
