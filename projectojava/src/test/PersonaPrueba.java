package test;
import domain.Persona;


public class PersonaPrueba {

	public static void main(String[]args) {
		
		
		/*Persona persona1=new Persona("juan", 5000.00, false);
		System.out.println("persona1: " +persona1.ToString());
		persona1.setNombre("juan carlos");
		//persona1.nombre="juan";
   		System.out.println("persona1 nombre: " +persona1.getNombre());
		System.out.println("persona1 sueldo: " +persona1.getSueldo());
		System.out.println("persona1 eliminado: " +persona1.isEliminado());
		
		System.out.println("persona1: " +persona1.ToString());
			
		*/
		
		Persona persona1=new Persona("juan");
		Persona persona2=new Persona("karla");
		
	}
		
		public static void imprimir(Persona persona) {
			System.out.println("persona= " +persona);
		
	}
}
