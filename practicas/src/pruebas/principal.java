package pruebas;

public class principal {

	
	public static void main(String[] args) throws java.lang.Exception, java.lang.IllegalArgumentException, java.lang.IllegalAccessException{
		moto yamaha = new moto();
		yamaha.setNombre("tzr");
		yamaha.setVelocidad(0);
							     	
		System.out.println("mi moto es una yamaha "+yamaha.getNombre()+", tiene una velocidad de: "+yamaha.getVelocidad()+"km/h.");
		int opcion;
		do {
			System.out.println("1.Acelerar\n2.Frenar\n3.Salir");
			opcion = Consola.leeInt();
			
			if(opcion == 1) {
				yamaha.acelerar(10);
				//yamaha.setVelocidad(yamaha.getVelocidad()+10);//ASI TAMBIÉN SE PUEDE HACER
				System.out.println("ahora la "+yamaha.getNombre()+" va a "+yamaha.getVelocidad());
			}
			
			
			else if(opcion == 2 && yamaha.getVelocidad() != 0) {
				yamaha.frenar(10);
				if(yamaha.getVelocidad() == 0) {
					System.out.println("la moto se ha parado");
				}else {
									
				System.out.println("ahora la "+yamaha.getNombre()+" va a "+yamaha.getVelocidad());
				}
			}
			
			
			else if(opcion == 2 && yamaha.getVelocidad() == 0) {				
				System.out.println("la moto ya estaba parada");		
			}
			
				
			else if(opcion == 3) {
				System.out.println("te has bajado de la moto");
			}
			
			
		}while(opcion == 1 || opcion == 2);
	
	}

}
