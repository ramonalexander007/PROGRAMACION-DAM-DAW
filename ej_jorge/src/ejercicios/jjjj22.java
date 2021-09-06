package ejercicios;

public class jjjj22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		disariumConArray();
	}

	
	public static void disariumConArray () {

	    System.out.println("Introduce una serie de número para sumar: ");
	    int num = Consola.leeInt();//135
	    String cadena = Integer.toString(num);

	    int[] intArray = new int[cadena.length()]; 

	    for(int i=0; i<cadena.length(); i++){
	        intArray[i] = Character.getNumericValue(cadena.charAt(i));
	    }

	     int suma= 0;
	     int resultado = 0;
	     int potencia = 0;

	     for(int i = 0; i < intArray.length ; i++){
	         resultado = intArray[i];
	         potencia = i;
	         System.out.print("res:"+resultado+"\n");

	         for(int j = 1; j<= potencia; j++) {
	             resultado *= intArray[i];
	         }
	         System.out.print("result:"+resultado+"\n");
	          suma += resultado;
	     }

	     if(num == suma) {
	         System.out.print("El número introducido "+num+" es disarium, porque la suma de sus digitos elevados a su posición es igual a "+suma);
	     }
	     else{
	         System.out.print("El número introducido "+num+" NO es disarium, porque la suma de sus digitos elevados a su posición NO es igual, la suma es "+suma);
	     }
	    }
	
}
