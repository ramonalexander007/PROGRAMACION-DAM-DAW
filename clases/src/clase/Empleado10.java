package clase;

public class Empleado10 {

	
	public String nombre;
	public int edad;
	public int sueldo;
	public int pluses;
	public String puesto;
	public char seccion;
	
	
	
	public Empleado10() {
		
	}
	
	public Empleado10(String nombre) {
		
	}
	
	public Empleado10(String nombre, int edad, int sueldo, int pluses, String puesto, char seccion) {
	
	}

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

	public int getPluses() {
		return pluses;
	}

	public void setPluses(int pluses) {
		this.pluses = pluses;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public char getSeccion() {
		return seccion;
	}

	public void setSeccion(char seccion) {
		this.seccion = seccion;
	}

	
	public static void main(String[]args) {
		Empleado10 miObjeto=new Empleado10();
		
	
		
	
		System.out.println("nombre");
		miObjeto.setNombre(Consola.leeString());
		System.out.println("Edad");
		miObjeto.setEdad(Consola.leeInt());
		System.out.println("pluses");
		miObjeto.setPluses(Consola.leeInt());
		System.out.println("puesto");
		miObjeto.setPuesto(Consola.leeString());
		System.out.println("sueldo");
		miObjeto.setSueldo(Consola.leeInt());
		System.out.println("seccion");
		miObjeto.setSeccion(Consola.leeChar());
		
		miObjeto.saludar();
		miObjeto.empleado();
		
		System.out.println("introduce cuantas veces quieres que se muestren los datos: ");
		int numero=Consola.leeInt();
		
		for(int num=0;num<=numero;num++) {
			System.out.println(num);
		}
	}
	
	public void saludar() {
		System.out.println("Bienvenido a la empresa ");
	}
	
	public void empleado() {
		System.out.println("HOLA "+nombre+" estos son tus datos que estan guardados en la base de datos:");
		System.out.println("NOMBRE: "+nombre);
		System.out.println("EDAD: "+edad);
		System.out.println("CANTIDAD ADQUIRIDA POR PLUSES: "+pluses+" €");
		System.out.println("SU PUESTO ACTUALMENTE ES: "+puesto);
		System.out.println("SU SUELDO ACTUAL MENSUAL ES DE: "+sueldo+" € brutos");
		System.out.println("USTED PERTENECE A LA SECCION: "+seccion);
	}
}
