package pruebas;
import java.util.ArrayList;


public class Profesores_fp {

	public String codigo_profesor;
	public String nombre_profesor;
	public String aula_asignada;
	public int horas_a_la_semana;
	public int anio_escolar;
	public int numero_alumnos;
	public int numero_aprobados;
	
	
	//constructores
	public Profesores_fp() {
		
	}
	
	public Profesores_fp(String codigo_profesor, String nombre_profesor, String aula_asignada, int horas_a_la_semana, int anio_escolar, int numero_alumnos, int numero_aprobados) {
		this.codigo_profesor=codigo_profesor;
		this.nombre_profesor=nombre_profesor;
		this.aula_asignada=aula_asignada;
		this.horas_a_la_semana=horas_a_la_semana;
		this.anio_escolar=anio_escolar;
		this.numero_alumnos=numero_alumnos;
		this.numero_aprobados=numero_aprobados;
	}

	public String getCodigo_profesor() {
		return codigo_profesor;
	}

	public void setCodigo_profesor(String codigo_profesor) {
		this.codigo_profesor = codigo_profesor;
	}

	public String getNombre_profesor() {
		return nombre_profesor;
	}

	public void setNombre_profesor(String nombre_profesor) {
		this.nombre_profesor = nombre_profesor;
	}

	public String getAula_asignada() {
		return aula_asignada;
	}

	public void setAula_asignada(String aula_asignada) {
		this.aula_asignada = aula_asignada;
	}

	public int getHoras_a_la_semana() {
		return horas_a_la_semana;
	}

	public void setHoras_a_la_semana(int horas_a_la_semana) {
		this.horas_a_la_semana = horas_a_la_semana;
	}

	public int getAnio_escolar() {
		return anio_escolar;
	}

	public void setAnio_escolar(int anio_escolar) {
		this.anio_escolar = anio_escolar;
	}

	public int getNumero_alumnos() {
		return numero_alumnos;
	}

	public void setNumero_alumnos(int numero_alumnos) {
		this.numero_alumnos = numero_alumnos;
	}

	public int getNumero_aprobados() {
		return numero_aprobados;
	}

	public void setNumero_aprobados(int numero_aprobados) {
		this.numero_aprobados = numero_aprobados;
	}
	
	
	public void clases() {
		System.out.println("el codigo del profesor es: "+codigo_profesor);
		System.out.println("el nombre del profesor es: "+nombre_profesor);
		System.out.println("el aula asignada es: "+aula_asignada);
		System.out.println("las horas a la semana son :"+horas_a_la_semana+" horas");
		System.out.println("el año del curso escolar es: "+anio_escolar);
		System.out.println("el numero de alumnos: "+numero_alumnos);
		System.out.println("el numero de aprobados son: "+numero_aprobados);
	}
	
	public static void main(String[]args) {
		
		int opcion;
		
		ArrayList<Profesores_fp> lista_profesores=new ArrayList<Profesores_fp>();
		
		do {
			
			Profesores_fp profesores=new Profesores_fp();
			System.out.println("introduce el codigo del profesor:");
			profesores.codigo_profesor=Consola.leeString();
			System.out.println("introduce el nombre del profesor:");
			profesores.nombre_profesor=Consola.leeString();
			System.out.println("introduce el aula asignada:");
			profesores.aula_asignada=Consola.leeString();
			System.out.println("introduce las horas a la semana:");
			profesores.horas_a_la_semana=Consola.leeInt();
			System.out.println("introduce el año escolar:");
			profesores.anio_escolar=Consola.leeInt();
			System.out.println("introduce el numero de alumnos:");
			profesores.numero_alumnos=Consola.leeInt();
			System.out.println("introduce el numero d aprobados:");
			profesores.numero_aprobados=Consola.leeInt();
			
			
			lista_profesores.add(profesores);
			System.out.println();
			profesores.clases();
			System.out.println();
			
			System.out.println("quieres introducir mas datos? 1/0");
			opcion=Consola.leeInt();
		}while(opcion !=0);
			
		
			
			System.out.println("Estos son los profesores que existen actualmente en el instituto:");
				for (int info = 0; info < lista_profesores.size(); info++) {
	    	 System.out.println("profesor "+(info+1));
	    	 lista_profesores.get(info).clases();
	         System.out.println();
		
				
			}
		}
	}
