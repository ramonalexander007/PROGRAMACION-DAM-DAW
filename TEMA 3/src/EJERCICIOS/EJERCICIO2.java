package EJERCICIOS;

public class EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//	Programa que pida la introducci�n de un car�cter (R o C) y calcule y visualice el
		//�rea de un rect�ngulo o de un cubo, respectivamente
		//�rea de un cubo: 	 6 * arista2

		
		//EJERCICIO 2
		char tipo;
		double area;
		double arista;
		double lado=0;
		double altura=0;
		
		System.out.println("INTRODUCE EL TIPO DE AREA QUE QUIERE SABER(ELIJA UNA R SI QUIERE EL RECTANGULO O C PARA EL CUBO):");
		tipo=Consola.leeChar();
		//Character.toLowerCase(tipo);
		if(tipo=='c') {
			System.out.println("INTRODUCE LA ARISTA: ");
			arista=Consola.leeDouble();
			area=Math.pow(arista, 2)*6;
			System.out.println(area);
		}else {
			
			System.out.println("INTRODUCE EL LADO: ");
			lado=Consola.leeDouble();
			System.out.println("INTRODUCE LA ALTURA: ");
			altura=Consola.leeDouble();
			area=(lado)*(altura);
			System.out.println(area);
		}
	}

}
