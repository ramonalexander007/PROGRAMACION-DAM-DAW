package piramides;

public class piramide1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fila=9;
		String espacio="";
		
		
		for(int i=0;i<=fila;fila--) {
			
			System.out.print(espacio);
			
			for(int j=0;j<fila;j++) {
				if(fila%2==0) {
					System.out.print("# ");
				}else if(fila%2!=0){
					System.out.print("$ ");
				}
				
			}
			System.out.println();
			espacio+=" ";
		}
	}

}
