package paquete2;

public class PruebaAritmetica {

	
 public static void main(String[] args) {
	Aritmetica aritmetica1=new Aritmetica();
	aritmetica1.a=3;
	aritmetica1.b=2;
	aritmetica1.sumar();
	
	var resultado=aritmetica1.sumarConRetorno();
	System.out.println("resultado desde la prueba= " +resultado);
	
	
	aritmetica1.sumarConArgumentos(5, 8);
	System.out.println("resultado usando argumentos= "+resultado);
 	}
}
