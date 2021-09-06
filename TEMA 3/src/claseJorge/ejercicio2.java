package claseJorge;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		  2.Realiza el programa que con el sueldo de un trabajador,
			le aplique un aumento del 15% si su sueldo es inferior o igual a 1000 y 10%
			en caso contrario.Imprima el nuevo sueldo del trabajador.
		 */
		//Descuento = Valor del objeto * Porcentaje de descuento / 100
		
		double sueldo=0;
		double aumento=0;
		double descuento=0;
		
		System.out.println("INTRODUCE EL SUELDO: ");
		sueldo=Consola.leeDouble();
		System.out.println(sueldo);
		if(sueldo<=1000) {
			aumento=sueldo*1.15;
			System.out.println(aumento);
		}else {
			descuento=sueldo*0.90;
			System.out.println(descuento);
		}
	}

}
