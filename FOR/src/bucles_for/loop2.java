package bucles_for;

public class loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero = 10;
		  String espacio = "";
		  
		  for(int i = 0; i < numero ; numero--){
			  
			 System.out.print(espacio);
	    	
	    	 for(int j = 1; j< numero; j++ ) {
	    		 System.out.print(j+" ");	    	        	       				      		    		      		      
	    	 }
		 
	    	 System.out.println();
	    	 espacio+= " ";		
	}
	}
}
