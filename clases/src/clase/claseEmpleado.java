package clase;

public class claseEmpleado {

	
	public String nombre="ramon";
	public int edad = 21;
	public int sueldo=1000;
	public String puesto="programador";
	
	//constructores
	
	public claseEmpleado() {
		
	}
	
	public claseEmpleado(String nombre) {
		
	}
	
	public claseEmpleado(String nombre, int edad, String puesto, int sueldo) {
		
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

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public void saludo(){
		System.out.println("Bienvenido "+nombre);
	}

	public void datosEmpleado() {
		
		System.out.println("estos son tus datos ");
		System.out.println("NOMBRE: "+nombre);
		System.out.println("EDAD: "+edad+" años");
		System.out.println("PUESTO: "+puesto);
		System.out.println("SUELDO: "+sueldo+" euros");
		
		
	}

	
	public static void main(String[]args) {
		
		
		
		claseEmpleado miObjeto=new claseEmpleado();
		
		System.out.println(miObjeto.nombre);
		System.out.println(miObjeto.edad);
		System.out.println(miObjeto.puesto);
		System.out.println(miObjeto.sueldo);
		
		//modificamos los valores anteriores
		
		miObjeto.nombre="emilio";
		miObjeto.edad=35;
		miObjeto.puesto="analista";
		miObjeto.sueldo=2800;
		
		
		//imprimimos los nuevos valores
		
		System.out.println("\nimprimimos los nuevos valores accediendo directamente a las propiedades");
		System.out.println(miObjeto.nombre+"\n"+miObjeto.edad+"\n"+miObjeto.puesto+"\n"+miObjeto.sueldo);

		System.out.println("imprimimos los nuevos valores accediendo a las propiedades con get");
		System.out.println(miObjeto.getNombre());
		System.out.println(miObjeto.getEdad());
		System.out.println(miObjeto.getPuesto());
		System.out.println(miObjeto.getSueldo());
		
		//modificamos los valores accediendo a las propiedades con get
		miObjeto.setNombre("Ramontxu");
		miObjeto.setEdad(21);
		miObjeto.setPuesto("programador");
		miObjeto.setSueldo(1000);
		
		System.out.println("\nimprimimos los nuevos valores accediendo a las propiedades con set");
		
		System.out.println(miObjeto.getNombre());
		System.out.println(miObjeto.getEdad());
		System.out.println(miObjeto.getPuesto());
		System.out.println(miObjeto.getSueldo());
		
		miObjeto.saludo();
		miObjeto.datosEmpleado();
		
		
		
	}
	
}
