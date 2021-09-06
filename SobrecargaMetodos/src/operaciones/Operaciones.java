package operaciones;

public class Operaciones {

	//Sobrecarga
	public static int sumar(int a, int b) {
		System.out.println("sumar(int a, int b)");
		return a+b;
	}
	
	public static double sumar(double a, double b) {
		System.out.println("sumar(double a, double b)");
		return a+b;
	}
	
	//Sobrecarga
	public static int restar(int num) {
		return restar(num, 1);
	}
	public static int restar (int num, int num2) {
		return num-num2;
	}
}
