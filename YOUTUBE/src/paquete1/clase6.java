package paquete1;

public class clase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] cars= {"camaro","corvette", "tesla","bmw"};
		
		cars[0]="mustang";
		
		System.out.println(cars[0]);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println();
		
		String[] car=new String[4];
		
		car[0]="camaro";
		car[1]="corvette";
		car[2]="tesla";
		car[3]="bmw";
		
		System.out.println(car[0]);
		System.out.println(car[1]);
		System.out.println(car[2]);
		System.out.println(car[3]);
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		System.out.println();
		
		for(int i=0;i<car.length;i++) {
			System.out.println(car[i]);
		}
		
	}

}
