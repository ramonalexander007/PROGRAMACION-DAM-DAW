package ejercicios;

public class f_f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//PEDIR UN NUMERO POR TECLADO PARA LA SERIE, PREGUNTARLE 
		//SI QUIERE MOSTRAR LOS PARES CON * Ó #,  SEGUN SU ELECCION
		//MOSTAREMOS LOS PARES CON LA OPCION ELEGIDA Y LOS IMPARES SE MOSTRARAN 
		//CON LA OPCION DESCARTADA HASTA MOSTRAR LA SERIE COMPLETA MARCADO SU FINAL
		//POR EL NUMERO INTRODUCIDO POR EL USUARIO.

		System.out.println("indica hasta que numero quieres que muestre la serie:");
		int numero=Consola.leeInt();
		System.out.println("los numeros que son pares van a llevar * o #");
		char opcion=Consola.leeChar();
		
		
		
		for(int i=1;i<=numero;i++) {
			if(opcion=='*') {
				if(i%2==0) {
					System.out.println(i+"*");
				}else {
					System.out.println(i+"#");
				}
			}else {
				if(i%2==0) {
					System.out.println(i+"#");
				}else {
					System.out.println(i+"*");
				}
				}
			}
			
		}
		
		
		/*for(int i=0;i<=numero;i++) {
			
			if(numero%2==0) {
			String signo;
			System.out.println("¿QUIERES MOSTRAR ASTERISCO O HASTAG?");
			signo=Consola.leeString();
				if(signo=="*") {
					System.out.println("*");
				}else {
					System.out.println("#");
				}
				System.out.println(i);
			}*/
		
		
		
		}
	


