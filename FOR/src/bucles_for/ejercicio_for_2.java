package bucles_for;

public class ejercicio_for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//2 --> numeros dsede el numero introducido por teclado hasta 0(0 incluido)

		int numero;
		System.out.println("INTRODUCE UN NUMERO: ");
		numero=Consola.leeInt();
		System.out.println("vamos a introducir los numero del "+numero+"  al 0");
		for(int x=numero;x>=0;x--) {
			System.out.println(x);
		}
		
	}

}
