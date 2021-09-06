package bucles_for;

public class for_dentro_de_for_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*for (char letraInicial = 'Z';letraInicial >= 'A'; letraInicial--) {
            for (char LetraSiguienteLinea = letraInicial; LetraSiguienteLinea >= 'A'; LetraSiguienteLinea--) {
                System.out.print(LetraSiguienteLinea);
            }
            System.out.println("\n");
        }
		*/
		
		for(char a='A';a<='Z';a++) {
			for(char b=a;b<='Z';b++) {
				System.out.print(b);
			}
			System.out.println("\n");
		}
	}

}
