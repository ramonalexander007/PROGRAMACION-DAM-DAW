package Biblioteca;
import java.util.ArrayList;



public class principal {

	
	public void datos() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
	}
	
	public static void main(String[]args) {
		
		int opcion;
		
		ArrayList<libro> biblio=new ArrayList<libro>();
		
		do {
			libro libros=new libro();
			System.out.println("id libro:");
			libros.setId_libro(Consola.leeInt());
			System.out.println("titulo:");
			libros.titulo=Consola.leeString();
			System.out.println("paginas:");
			libros.paginas=Consola.leeInt();
			System.out.println("ISBN:");
			libros.isbn=Consola.leeInt();
			System.out.println("autor:");
			libros.autor=Consola.leeString();
			
			biblio.add(libros);
			System.out.println();
			opcion=Consola.leeInt();
			
		}while(opcion !=0);
			for(int info=0;info<biblio.size();info++) {
				System.out.println("libro "+(info+1));
				biblio.get(info);
				System.out.println();
				
				
			}
		}
	}

