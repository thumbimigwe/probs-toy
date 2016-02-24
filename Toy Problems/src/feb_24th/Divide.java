package feb_24th;

public class Divide {
	public static int divide(int a, int b){
	    
		   int x;
		   do{
		        x = a % b ;
		           if(x!=0)
		           {
		             a = b;
		             b = x;
		           }
		        
		    	}
		    		while(x!=0);
		    return b;
		   }
		}
