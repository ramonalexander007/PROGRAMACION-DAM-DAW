package EJERCICIOS;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Solicitar 2 números y un signo matemático (validar que sea
		//+, -, x, :) y mostrar el resultado de la correspondiente operación 
		//(Anidar if’s)
		
		double num1, num2, resultado;
		char signo;
		
		System.out.println("INTRODUCE EL PRIMER NUMERO:");
		num1=Consola.leeDouble();
		System.out.println("INTRODUCE EL SEGUNDO NUMERO:");
		num2=Consola.leeDouble();
		System.out.println("INTRODUCE UN SIGNO MATEMATICO(+,-, x, :):");
		signo=Consola.leeChar();
		
		if(signo=='-'){
			resultado=num1-num2;
			System.out.println(resultado);
		}else if(signo=='+') {
			resultado=num1+num2;
			System.out.println(resultado);
		}else if(signo=='x') {
			resultado=(num1)*(num2);
			System.out.println(resultado);
		}else {
			resultado=num1/num2;
			System.out.println(resultado);
			  }
		}
	}


