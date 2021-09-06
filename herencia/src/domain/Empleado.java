package domain;

public class Empleado extends Persona {

	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	public Empleado() {
		super();
		this.idEmpleado=Empleado.contadorEmpleado++;
	}
	
	public Empleado(String nombre, char genero, int edad, String direccion) {
		super(nombre, genero, edad, direccion);
		// TODO Auto-generated constructor stub
	}
	public Empleado(String nombre, double sueldo) {
		//super(nombre);
		
		this();
		this.sueldo = sueldo;
		this.nombre=nombre;
		//this.idEmpleado=++contadorEmpleado;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
}
