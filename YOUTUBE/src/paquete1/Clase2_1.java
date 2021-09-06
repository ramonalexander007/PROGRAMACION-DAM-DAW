package paquete1;

public class Clase2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//hallar la hipotenusa
		
		double x;
		double y;
		double z;
		
		System.out.println("introduce la x:");
		x=Consola.leeDouble();
		System.out.println("introduce la y:");
		y=Consola.leeDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		System.out.println("la hipotenusa es: "+z);
		
		
		
	}

}
