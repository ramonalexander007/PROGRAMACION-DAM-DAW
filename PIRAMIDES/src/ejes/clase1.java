package ejes;

public class clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		creaToken();
	}
	
	public static int NumeroAleatorio(int max, int min) {

        double generarNumero = Math.random()* (max-min +1) + (min);

        int aleatorio = (int) generarNumero;

        return aleatorio;
    }
	
	public static void creaToken() {
        char salir = 'n';
        int num;
        System.out.println("###CrafToken###\n");
        System.out.println("*Info: Eligir los valores(min y max) entre 0 y 9 para crear un token aleatorio \ncomprendido entre el rango seleccionado, estar� combinado con letras de A hasta Z*\n");
                
        do{    
            System.out.println("�Cu�l va a ser el m�nimo?");
            System.out.println("*Info: Introducir un valor entre 0 y 9*");
                
            int min = Consola.leeInt();
            
                if(min > 9 || min < 0) {
                    System.out.println("El minimo no puede se mayor que 9 ni menor que 0");
                    continue;
                }
                
            System.out.println("�Cu�l va a ser el m�ximo?");
            System.out.println("*Info: Introducir un valor entre 0 y 9 que sea igual o mayor que el m�nimo*");
            
            int max = Consola.leeInt();
            
            do {
                
                if(max > 9) {
                    System.out.println("*Info: El maximo no puede se mayor que 9*");
                    System.out.println("�Cu�l va a ser el m�ximo?");
                    System.out.println("*Info: Introducir un valor entre 0 y 9 que sea igual o mayor que el m�nimo*");
                    max = Consola.leeInt();
                }
                else if(max < min) {
                    System.out.println("*Info: El maximo no puede ser menor que el m�nimo*");
                    System.out.println("�Cu�l va a ser el m�ximo?");
                    System.out.println("*Info: Introducir un valor entre 0 y 9 que sea igual o mayor que el m�nimo*");
                    max = Consola.leeInt();
                    
                }
            }while(max > 9 || max < min);
                            
            System.out.println("�De qu� tama�o va a ser el token?");
            int tama�oToken= Consola.leeInt();
            
            char [] tokenChar= new char[tama�oToken/2];
                                                
            int [] tokenNum= new int[tama�oToken/2];
            
            System.out.println();
            System.out.print("Token: ");
            
            int resto = tama�oToken%2;
                    
            if(resto == 0) {
            
                for(int i = 0; i< tokenNum.length;i++){
                    num = NumeroAleatorio(max,min);
                    tokenNum[i] = num;
                    System.out.print(tokenNum[i]);                                                                                                            
                    
                    for(int j = i; j<=i ;j++){
                        int numero = NumeroAleatorio(90,65);                
                        char caracater = (char) numero;
                        tokenChar[j] = caracater;
                        
                        System.out.print(tokenChar[j]);                        
                    }
                }                
            }
            else{
                
                for(int i = 0; i< tokenNum.length;i++){
                    num = NumeroAleatorio(max,min);
                    tokenNum[i] = num;
                    System.out.print(tokenNum[i]);                                                                                                                
                    
                    for(int j = i; j<=i ;j++){
                        int numero = NumeroAleatorio(90,65);                    
                        char caracater = (char) numero;
                        tokenChar[j] = caracater;
                        
                        System.out.print(tokenChar[j]);                    
                    }
                }
                
                int numero = NumeroAleatorio(max,min);//mostramos un numero mas porque es impar
                System.out.print(numero);
            }
            System.out.println();
            System.out.println("\n�Quieres crear otro token? s/n");
            salir= Consola.leeChar();
            
                if(salir == 'n') {
                    System.out.println("Gracias por usar CrafToken");
                    break;
                }
                
        }
        while(true);
        
    }

}
