package menu1;

public class m1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion=0;
		boolean salir=false;
		double num1, num2, num3, num4, suma, RESTA, MUL, DIV;
		
		while(!salir) {
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. MULTIPLICACION");
		System.out.println("4. DIVISION");
		System.out.println("5. SALIR");
		
		opcion=Consola.leeInt();
		
		switch(opcion) {
		case 1:
			System.out.println("INTRODUZCA UN PRIMER NUMERO:");
			num1=Consola.leeDouble();
			System.out.println("INTRODUZCA EL SEGUNDO NUMERO:");
			num2=Consola.leeDouble();
			System.out.println("INTRODUZCA EL TERCER NUMERO:");
			num3=Consola.leeDouble();
			System.out.println("INTRODUZCA EL CUARTO NUMERO:");
			num4=Consola.leeDouble();
			suma=num1+num2+num3+num4;
			System.out.println(suma);
			break;
		case 2:
			System.out.println("INTRODUZCA UN PRIMER NUMERO:");
			num1=Consola.leeDouble();
			System.out.println("INTRODUZCA EL SEGUNDO NUMERO:");
			num2=Consola.leeDouble();
			RESTA=num1-num2;
			System.out.println(RESTA);
			break;
		case 3:
			System.out.println("INTRODUZCA UN PRIMER NUMERO:");
			num1=Consola.leeDouble();
			System.out.println("INTRODUZCA EL SEGUNDO NUMERO:");
			num2=Consola.leeDouble();
			System.out.println("INTRODUZCA EL TERCER NUMERO:");
			num3=Consola.leeDouble();
			MUL=num1*num2*num3;
			System.out.println(MUL);
			break;
		case 4:
			System.out.println("INTRODUZCA UN PRIMER NUMERO:");
			num1=Consola.leeDouble();
			System.out.println("INTRODUZCA EL SEGUNDO NUMERO:");
			num2=Consola.leeDouble();
			DIV=num1/num2;
			System.out.println(DIV);
			break;
		case 5:
			salir=true;
			System.out.println("USTED HA SALIDO DEL PROGRAMA, QUE TENGA UN BUEN DIA");
			break;
		}
		
		}
	}

}
