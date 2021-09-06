package paquete1;

public class practica7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=3,b=2;
		var resultado=a+b;
		System.out.println("resultado suma= " +resultado);
		
		resultado=a-b;
		System.out.println("resultado resta= " +resultado);
		
		resultado=a*b;
		System.out.println("resultado multiplicacion= " +resultado);
		
		resultado=a/b;
		System.out.println("resultado division= " +resultado);
		
		resultado=a%b;
		System.out.println("resultado division= " +resultado);
		
		
		if(a%2==0) {
			
			System.out.println("ES UN NUMERO PAR");
		}else {
			
			System.out.println("ES UN NUMERO IMPAR");
		}
		if(b%2==0) {
			
			System.out.println("ES UN NUMERO PAR");
		}else {
			
			System.out.println("ES UN NUMERO IMPAR");
		}
	}

}
