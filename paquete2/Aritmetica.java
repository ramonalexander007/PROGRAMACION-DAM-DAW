package paquete2;

public class Aritmetica {

	int a;
	int b;
	
	//metodo
	public void sumar() {
		
		int resultado=a+b;
		System.out.println("resultado= " +resultado);
		
	
	}
	
	
	public int sumarConRetorno() {
	//int resultado=a+b;
	//return resultado;	
		return a+b;
	}
	
	public int sumarConArgumentos(int arg1, int arg2) {
		this.a=arg1;
		this.b=arg2;
		return a+b;
		
	}
	
}
