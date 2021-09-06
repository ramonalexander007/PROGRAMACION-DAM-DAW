package bucles_for;

public class FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 -->numeros del 0 hasta el numero introducido por teclado(50 incluido)
		//2 --> numeros dsede el numero introducido por teclado hasta 0(0 incluido)
		
		
		int numero_hasta_leer;
	
		System.out.println("INTRODUCE UN NUMERO: ");
		numero_hasta_leer=Consola.leeInt();
		
		for(int iteracion=2;iteracion<=numero_hasta_leer;iteracion++) {
			
			if(iteracion%2==0) {
				System.out.println("el numero "+iteracion+" ,es par");
			}else {
				System.out.println("el numero "+iteracion+" , es impar");
			}
			
		
		}
	}

}
