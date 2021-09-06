package clase;

public class Clases1 {

	
	public String nombre="juan";
	public int edad=25;
	
	//constructor 1
	
	public Clases1() {
		
	}
	
	//constructor 2
	
	public Clases1(String nombre) {
		
	}
	
	//constructor 3
	
	public Clases1(int edad) {
		
	}
	
	//constructor 4
	
	public Clases1(String nombre, int edad) {
		
	}
	
	//metodos get y set
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clases1 miclase=new Clases1();
		
		
		
	}

}
