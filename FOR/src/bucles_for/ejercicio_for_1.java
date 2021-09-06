package bucles_for;

public class ejercicio_for_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1 -->numeros del 0 hasta el numero introducido por teclado(50 incluido)
		
		/*int numero;
		System.out.println("introduce un numero:");
		numero=Consola.leeInt();
		for(int x=0;x<=numero;x++) {
			System.out.println("usted ha introducido el numero "+x);
		}*/
		
		mesesParImpar();
	}
	
	public static void mesesParImpar() {
		
		/*System.out.println("INTRODUCE EL MES CON UN NUMERO: ");
		int meses=Consola.leeInt();
		
		switch(meses) {
		case 1:
			if(meses%2==0) {
				System.out.println("PAR");
			}else if(meses%2!=0){
				System.out.println("IMPAR");
			}
			break;
		}*/
		System.out.println("INTRODUCE EL MES: ");
		String mes=Consola.leeString();
		
		if(mes=="febrero"+1 || mes=="abril" || mes=="junio" || mes=="agosto"+1 || mes=="octubre"+1 || mes=="diciembre"+1) {
			System.out.println("mes par");
		}else {
			System.out.println("mes impar");
		}
		
		
	}

}
