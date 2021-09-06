package paquetePruebas;

public class prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean salir=false;
		int opcion=0;
		
		while(!salir) {
			
			System.out.println("1. suma");
			System.out.println("2. resta");
			System.out.println("3. division");
			System.out.println("4. resto division");
			System.out.println("5. salir");
			
			opcion=Consola.leeInt();
			
			switch(opcion) {
			case 1:
				
				if(opcion==1) {
					System.out.println("EL TOTAL DE LA SUMA ES: " +(10+30));
					
				}
				
				break;
			case 2:
				
				if(opcion==2) {
					System.out.println("EL TOTAL DE LA RESTA ES: " +(10-7));
					
				}
				
				break;
			case 3:
				
				if(opcion==3) {
					System.out.println("EL TOTAL DE LA DIVISION ES: " +(10/2.5));
					
				}
				
				break;
			case 4:
				
				if(opcion==4) {
					System.out.println("EL RESTO DE LA DIVISION ES: " +(10%2));
					
				}
				
				break;
			case 5:
				
				 salir=true;
				 
				 System.out.println("USTED HA SALIDO DEL PROGRAMA");
				
				break;
				
			default:	
			System.out.println("ELIGE UNA OPCION DEL 1 AL 5");
			}
			
			
			
			
			
			
			
		}
	}

}
