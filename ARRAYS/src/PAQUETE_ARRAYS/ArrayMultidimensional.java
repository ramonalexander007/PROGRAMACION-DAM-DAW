package PAQUETE_ARRAYS;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		int[][][] myArray = 
				
			{
				   {//i-0
					   { 1, 2, 3 },/*j-0*/ { 4, 5, 6 } /*j-1*/
				   },  //k0	k1 k2	 	   //k0 k1 k2
				   
				   {//i-1
					   { 7, 8, 9 },/*j-0*/ { 10, 11, 12 } /*j-1*/
				   },  //k0	k1 k2	 	   //k0  k1  k2
				   
				   
				   {//i-2
					   { 13, 14, 15 },/*j-0*/ { 16, 17, 18 } /*j-1*/
				   },  //k0	 k1  k2	 	      //k0  k1  k2
				    
				   {//i-3
					   { 19, 20, 21 },/*j-0*/ { 22, 23, 24 } /*j-1*/
				   },  //k0	 k1  k2	 	      //k0  k1  k2
				    
				   {//i-4
					   { 25, 26, 27 },/*j-0*/ { 28, 29, 30 } /*j-1*/
				   }   //k0	 k1  k2	 	      //k0  k1  k2
				     
		   
		   }; 	 
		 
		System.out.println("lecturaArrayMultidimensional");  
			
		for (int i = 0; i < myArray.length; i++) {
					
			for(int j = 0; j < myArray[i].length; j++) {
							   
				for(int k = 0; k <= myArray[j].length; k++) {
					
					System.out.print(myArray[i][j][k]+" ");
					
				}
			}
		}
	}	
}
