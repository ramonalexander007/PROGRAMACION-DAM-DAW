package bucles_for;

public class for_letras_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nom;
		System.out.println("INTRODUCE UNA CADENA DE TEXTO:");
		nom=Consola.leeString();
		
		for(int x=0; x<nom.length();x++) {
			System.out.println(nom.charAt(x));
		}
	}

}
