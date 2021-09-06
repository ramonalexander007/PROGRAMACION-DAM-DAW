package EJERCICIOS;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		/*
		 * 
		 * 5	Leer tres números que denoten una fecha (día, mes, año).
		 *  Comprobar si es una fecha válida. 
			Si no es válida escribir un mensaje de error. 
			Si es válida escribir la fecha cambiando el número del
 			mes por su nombre. Ej. si se introduce 1 2 2006, se deberá 
 			imprimir “1 de febrero de 2006
		 */
		
		int dia, mes, anio;
		
		System.out.println("INTRODUZCA UN DIA DEL MES:");
		dia=Consola.leeInt();
		System.out.println("INTRODUCA UN MES DEL AÑO:");
		mes=Consola.leeInt();
		System.out.println("INTRODUCA UN AÑO:");
		anio=Consola.leeInt();
		
		if(mes==1) {
			System.out.println(dia+" de enero de "+anio);
		}else if(mes==2) {
			System.out.println(dia+" de febrero de "+anio);
		}else if(mes==3) {
			System.out.println(dia+" de marzo de "+anio);
		}else if(mes==4) {
			System.out.println(dia+" de abril de "+anio);
		}else if(mes==5) {
			System.out.println(dia+" de mayo de "+anio);
		}else if(mes==6) {
			System.out.println(dia+" de junio de "+anio);
		}else if(mes==7) {
			System.out.println(dia+" de julio de "+anio);
		}else if(mes==8) {
			System.out.println(dia+" de agosto de "+anio);
		}else if(mes==9) {
			System.out.println(dia+" de septiembre de "+anio);
		}else if(mes==10) {
			System.out.println(dia+" de octubre de "+anio);
		}else if(mes==11) {
			System.out.println(dia+" de noviembre de "+anio);
		}else if(mes==12) {
			System.out.println(dia+" de dicimebre de "+anio);
		}
		
		
	}

}
