package PAQUETE1;

public class PRACTICAS_AGOSTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numeroDisarium();
		
	}

	
	public static void filasNum() {
		
		for(int fila=0;fila<10;fila++) {
			for(int numero=1;numero<=10;numero++) {
			System.out.println(numero+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void numeroDisarium() {
		int suma=0;
		int resultado=0;
		int potencia=0;
		
		
		System.out.println("introduce un numero: ");
		int num=Consola.leeInt();
		String cadena=Integer.toString(num);
		
		int []intArray=new int [cadena.length()];
		
		for(int i=0;i<cadena.length();i++) {
			
			intArray[i]=Character.getNumericValue(cadena.charAt(i));
		}
		
		for(int j=0;j<intArray.length;j++) {
		resultado=intArray[j];
		potencia=j;
		System.out.println("respuesta: "+resultado+"\n");
		for(int x=1;x<=potencia;x++) {
			
			resultado*=intArray[j];
			
			
		}
		System.out.println("resultado: "+resultado+"\n");
		suma+=resultado;
		}
		
		if(num==suma) {
			System.out.println("el numero "+num+" es disarium");
			
		}else {
			System.out.println("el numero "+num+" no es disarium");
		}
		
	}
	
}
