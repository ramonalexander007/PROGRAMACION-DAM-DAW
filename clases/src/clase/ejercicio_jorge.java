package clase;

public class ejercicio_jorge {
	
	public String nombre;
	public int edad;
	public int sueldo;
	public int pluses;
	public String puesto;
	public char seccion;
	
	

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


	public void saludar() {
		System.out.println("BIENVENIDO "+nombre);
	}
	
	public void empleado1() {
		System.out.println("HOLA "+nombre+" LOS DATOS GUARDADOS DEL TRABAJADOR "+nombre+"\n"+"NOMBRE: "+nombre+"\n"+"EDAD: "+edad+" años"+"\n"+"LA CANTIDAD DE DINERO QUE PERCIBES POR LOS PLUSES ES: "+pluses+" €"+"\n"+"SU PUESTO ACTUALMENTE EN LA EMPRESA ES: "+puesto+"\n"+"ACTUALMENTE SU SUELDO ES DE: "+sueldo+" € brutos"+"\n"+"USTED PERTENECE A LA SECCION DENTRO DE LA EMPRESA DE: "+seccion);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ejercicio_jorge miObjeto=new ejercicio_jorge();
		
		
		
		
		//System.out.println("quieres seguir introduciendo datos:");
		//String opcion=Consola.leeString();
		
		int opcion;
		boolean salir=false;
		
		while(!salir) {
			System.out.println("ELIGE UNA OPCION (1 o 2)");
			System.out.println("1. INTRODUCIR DATOS");
			System.out.println("2. NO INTRODUCIR MAS DATOS");
			
			opcion=Consola.leeInt();
			
			switch(opcion) {
			case 1:
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
			  miObjeto.empleado1();
			
			  System.out.println();
				break;
			case 2:
				salir=true;
				System.out.println("usted ha decidido no introducir mas datos");
				break;
			
			
			}
			
		}
		
		/*do {
			
			
			
			
			
			
			miObjeto.saludar();
			miObjeto.empleado1();
		}while(opcion=="si");
		*/
	}

}
