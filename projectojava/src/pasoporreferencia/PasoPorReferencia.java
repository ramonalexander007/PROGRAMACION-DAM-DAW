package pasoporreferencia;
import clases.Persona; 
public class PasoPorReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona persona1=new Persona();
		persona1.nombre="JUAN";
		System.out.println("PERSONA1 NOMBRE= " +persona1.nombre);
		cambiarValor(persona1);
		System.out.println("persona1 cambio nombre= " +persona1.nombre);
		
	}

	public static void cambiarValor(Persona persona) {
		persona.nombre="karla";
		
	}

}
