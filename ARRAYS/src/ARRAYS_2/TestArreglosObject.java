package ARRAYS_2;

import java.util.ArrayList;

import domain.Persona;

public class TestArreglosObject {

	
	public static void main(String[]args) {
//		Persona personas[]=new Persona[2];
//		
//		
//		
//		
//		personas[0]=new Persona("juan");
//		personas[1]=new Persona("karla");
//		
//		
//		System.out.println("persona 0= "  +personas[0]);
//		System.out.println("persona 1= "  +personas[1]);
		
		
		//DEFINIR ARRAY Y ARRAYLIST
		String listado[]=new String[10];
		ArrayList<String> listado2 = new ArrayList<String>();
		
		//INSERTAR UN DATO
		listado[0]="manzanas";
		listado2.add("peras");
		
		//INSERTAR UN SEGUNDO DATO
		listado[1]="platano";
		listado2.add("kiwis");
		listado2.add("mangos");
		
		System.out.println(listado2);
		
		//INSERTAR DATOS DE FORMA DINAMICA
		String nombres[]=new String[5];
		
		for(int i = 0; i<nombres.length; i++) {
			System.out.println("introduce un nombre: ");
			String nombre=Consola.leeString();
			nombres[i]=nombre;
		}
		
		
		ArrayList<String> apellidos = new ArrayList<String>();
		
		//for(int i=0; i<apellidos.size();i++) {
		for(int i=0; i<5 ;i++) {
			System.out.println("Introduce un apellido: ");
			String apellido=Consola.leeString();
			apellidos.add(apellido);
		}
		
	}
}
