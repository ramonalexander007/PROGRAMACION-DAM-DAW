package test;

import domain.Empleado;
import java.util.Date;
import domain.Cliente;

public class TestHerencia {

	public static void main(String[]args) {
		Empleado empleado1=new Empleado("juan", 5000.0);
		System.out.println("empleado1= "  +empleado1);
		
		
		
		Cliente cliente1=new Cliente(new Date(), true, "karla", 'F', 28, "Saturno 15");
		System.out.println("cliente1= " +cliente1);
	
	
	
	
	}
	
}
