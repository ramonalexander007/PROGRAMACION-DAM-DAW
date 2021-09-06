package EJERCICIOS;

public class ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double num1, num2, resultado;
		String signo;
		
		System.out.println("INTRODUCE EL PRIMER NUMERO:");
		num1=Consola.leeDouble();
		System.out.println("INTRODUCE EL SEGUNDO NUMERO:");
		num2=Consola.leeDouble();
		System.out.println("INTRODUCE UN SIGNO MATEMATICO(+,-, x, :):");
		signo=Consola.leeString();
		
		if(signo=="-"){
			resultado=num1-num2;
			System.out.println(resultado);
		}else if(signo=="+") {
			resultado=num1+num2;
			System.out.println(resultado);
		}else if(signo=="x") {
			resultado=(num1)*(num2);
			System.out.println(resultado);
		}else {
			resultado=num1/num2;
			System.out.println(resultado);
			  }
		}
	}


