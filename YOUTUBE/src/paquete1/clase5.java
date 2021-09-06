package paquete1;

public class clase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("you are playing a game! Press q or Q to quit");
		String response=Consola.leeString();
		
		if(response.equals("q") || response.equals("Q")) {
			
			System.out.println("you quit the game");
			
		}else {
			
			System.out.println("you are still playing the game!");
			
		}
		
	}

}
