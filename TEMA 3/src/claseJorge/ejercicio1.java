package claseJorge;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*1.Escribe un programa, que solicite un número y que muestre 
 si es impar o par.

2.Realiza el programa que con el sueldo de un trabajador,
le aplique un aumento del 15% si su sueldo es inferior o igual a 1000 y 10%
en caso contrario.Imprima el nuevo sueldo del trabajador.*/
	
		
		double numero, resto;
		
		
		
		System.out.println("INTRODUCE UN NUMERO: ");
		numero=Consola.leeDouble();
		resto=numero%2;
		
		if(resto==0) {
			System.out.println("EL NUMERO "+numero+" ES PAR");
		}else {
			System.out.println("EL NUMERO "+numero+" ES IMPAR");
		}
		
		
		
		}
	}


