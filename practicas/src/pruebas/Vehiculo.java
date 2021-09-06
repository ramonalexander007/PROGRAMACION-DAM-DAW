package pruebas;

import java.util.ArrayList;

public class Vehiculo {

	//tipo, color, velocidad maxima, ruedas, extras
	
	public String tipo;
	public String color;
	public int velocidad_maxima;
	public String ruedas;
	public String extras;
	
	//constructores
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String tipo, String color, int velocidad_maxima, String ruedas, String extras) {
		
	}
	
	//getters & setter

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad_maxima() {
		return velocidad_maxima;
	}

	public void setVelocidad_maxima(int velocidad_maxima) {
		this.velocidad_maxima = velocidad_maxima;
	}

	public String getRuedas() {
		return ruedas;
	}

	public void setRuedas(String ruedas) {
		this.ruedas = ruedas;
	}

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}
	
	public void mostrar_datos_vehiculos() {
		System.out.println("tipo de vehiculo: "+tipo);
		System.out.println("color del vehiculo: "+color);
		System.out.println("velocidad maxima del vehiculo: "+velocidad_maxima);
		System.out.println("modelo de las ruedas: "+ruedas);
		System.out.println("extras del vehiculo: "+extras);
	}
	
	
	public static void main(String[]args) {
		
		
	
	
	
    //arayList de objetos de una clase
    System.out.println("\nArrayList1 de objetos de una clase");
    ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
    //var lista= new ArrayList<Persona>();//asi tambien se puede declarar
    int seguir;
    do {
        Vehiculo vehiculo = new Vehiculo();//constructor1 normal sin sobrecarga
        System.out.println("Introduce el tipo de vehiculo");
        vehiculo.tipo = Consola.leeString();
        System.out.println("Introduce el color del vehiculo");
        vehiculo.color = Consola.leeString();
        System.out.println("introduce la velocidad maxima del vehiculo");
        vehiculo.velocidad_maxima=Consola.leeInt();
        System.out.println("introduce el modelo de ruedas del vehiculo");
        vehiculo.ruedas=Consola.leeString();
        System.out.println("introduce los extras que tiene el vehiculo");
        vehiculo.extras=Consola.leeString();
        lista.add(vehiculo);
        System.out.println();
        vehiculo.mostrar_datos_vehiculos();

        System.out.println("¿Quieres introducir mas datos? 1/0");
        seguir = Consola.leeInt();

    }while(seguir != 0);
    System.out.println("Estos son los usuarios que existen actualmente:");
     for (int i = 0; i < lista.size(); i++) {
    	 System.out.println("vehiculo "+(i+1));
    	 lista.get(i).mostrar_datos_vehiculos();
         System.out.println();//con el metodo datos() de la clase persona
        // Otras maneras de acceder a los datos:
         /*System.out.println(lista.get(i).getNombre());
         System.out.println(lista.get(i).getEdad());
         System.out.println(lista.get(i).nombre);
         System.out.println(lista.get(i).edad);    */
      }
}
	} 
