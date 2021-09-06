package domain;

public class Persona {

	
	protected String nombre;
	protected char genero;
	protected int edad;
	protected String direccion;
	
	public Persona() {
		
	}
	
	
	public Persona(String nombre) {
		this.nombre=nombre;
		
	}


	public Persona(String nombre, char genero, int edad, String direccion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	
	
	
	
}
