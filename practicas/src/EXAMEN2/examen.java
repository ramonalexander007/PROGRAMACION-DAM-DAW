package EXAMEN2;

public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int numero=Consola.leeInt();
		String espacio="";
		int num2=(numero*2)-1;
		
		for(int num=0;num<=numero;num++) {
			System.out.print(espacio);
			if(num%2==0) {
			for(int num3=0;num3<=num2;num3++) {
				if(num%4==0) {
					System.out.print("<");
				}else {
					System.out.print(">");
				}
			}
				
			}else {
				System.out.print("(");
				for(int num4=0;num4<num2-2;num4++) {
					System.out.print(" ");
				}System.out.print(")");
				}
			System.out.println();
			espacio+=" ";
			num2-=2;
			}*/
			
		
		numeroDisarium();
		}
	
	public static void numeroDisarium() {
	
		System.out.println("introduce un numero: ");
		int numero=Consola.leeInt();
		String operacion=Integer.toString(numero);
		int resultado=0;
		int suma=0;
		
		for(int numero1=0;numero1<operacion.length();numero1++) {
			resultado=Character.getNumericValue(operacion.charAt(numero1));
			for(int numero2=0;numero2<numero1;numero2++) {
				resultado*=Character.getNumericValue(operacion.charAt(numero1));
			}
			suma+=resultado;
		}
		System.out.println("La suma es "+suma);
		if(numero==suma) {
			System.out.println("el numero "+numero+" es disarium");
		}else {
			System.out.println("el numero "+numero+" no es disarium");
		}
	}
	
	}



	
