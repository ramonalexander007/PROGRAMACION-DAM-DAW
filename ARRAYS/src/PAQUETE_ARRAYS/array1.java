package PAQUETE_ARRAYS;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//array 5 pos. array de string de coches, y recorrer con bucle 
	//y mostrar todas las posiciones. sustitutir la pos. 2 por otra marca
	//volver a recorrer el array y mostrar todas las posiciones con la ultima
	//modificacion ya vigente
		
	String[]marcasCoches= {"tesla", "audi", "volkswagen", "ford","porche"};	
	
	for(int i=0;i<=marcasCoches.length-1;i++) {
		System.out.println(marcasCoches[i]);
	}
	
	marcasCoches[2]="lexus";
	
	System.out.println();
	
	for(int i=0;i<marcasCoches.length;i++) {
		System.out.println(marcasCoches[i]);
	}
	}

}
