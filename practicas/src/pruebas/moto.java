package pruebas;

public class moto {

	
	//propiedades
		private int velocidad, aceleracion, frenada;
		private String nombre;
		
		//Constructor
		public moto(){
			
		}
		public moto(int velocidad, int aceleracion, int frenada){
			
		}
		public moto(String nombre, int velocidad, int aceleracion, int frenada){
			
		}
		
		
		
		//Metodos Set and get
		public int getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}

		public int getAceleracion() {
			return aceleracion;
		}

		public void setAceleracion(int aceleracion) {
			this.aceleracion = aceleracion;
		}

		public int getFrenada() {
			return frenada;
		}

		public void setFrenada(int frenada) {
			this.frenada = frenada;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nom) {
			this.nombre = nom;
		}
		
		public void acelerar(int ace){
			//this.aceleracion = aceleracion;//directamente acceder a la propiedad
			this.setAceleracion(ace);//acceder a la propiedad con set
			velocidad = velocidad + aceleracion;		
		}
		
		public void frenar(int fre){
		
			this.frenada = fre;
			velocidad = velocidad - frenada;
		}
		
	
}
