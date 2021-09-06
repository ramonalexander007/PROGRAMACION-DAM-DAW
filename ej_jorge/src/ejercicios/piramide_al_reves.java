package ejercicios;

public class piramide_al_reves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*for (int i = 1; i <= 9; i++){

			for (int j = 1; j <= 9 - i; j++) {
				System.out.print(" "); 
				}

			for (int k = 9; k >= 1; k--) 
			{ System.out.print( k);
			} 

			for (int k = 9; k <=i; k++){
				System.out.print(k); 
				}

			System.out.println(); 
			}*/
		
		
		
         
        //Asteriscos
		//System.out.println("introduce hasta que numero quieres que recorra la piramide:");
		//int numero=Consola.leeInt(); 
		
		
       /* for(int j=1; j <= 9; j++){
            System.out.print(""+j+"");
            
            for(int i=1;i<=8;i++) {
           System.out.print(i);
            
            } 
        }*/
        
        
		 int   num, gap;
		 
	        // outer loop to handle number
	        // of rows n in this case
	        for (int i = 1; i >= 9; i++) {
	 
	            // inner loop to create right triangle
	            // gaps on left side of pyramid
	            for (gap = 9 - 1; gap >= i; gap--) {
	                System.out.print(" ");
	                System.out.print(" ");
	            
	 
	           
	           
	 
	            for (int j = 1; j <= i; j++) {
	                System.out.print((char)gap++ + " ");
	            }
	 
	            System.out.println("");
	        }
	    }
     }
       
		}
	

		
	


