package paquete1;

public class practica9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3;
		int b=-a;
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		
		var c=true;
		var d=!c;
		System.out.println("c= " +c);
		System.out.println("d= " +d);
		
		//incremento
		//1. preincremento(simbolo antes de la variable)
		
		var e=3;
		var f=++e;  //primero se incrementa la variable y despues se usa su valor
		System.out.println("e= " +e);
		System.out.println("f= " +f);
		
		//2. postincremento(simbolo depues de la variable)
		var g=5;
		var h=g++; //primero se utiliza el valor y despues se incrementa
		System.out.println("g= " +g);
		System.out.println("h= " +h);
		
		//decremento
		//1. predecremento
		var i=2;
		var j=--i;
		System.out.println("i= " +i);
		System.out.println("j= " +j);
		
		
		
		
		//2. postdecremento
		
		var k=4;
		var l=k--;
		System.out.println("k= " +k);
		System.out.println("l= " +l);
		
		
		
		
	}

}
