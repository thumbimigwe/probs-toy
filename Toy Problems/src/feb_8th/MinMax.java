package feb_8th;
import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] x = {3,5,0,8,2,-6,-9,0,20,25};
		
		int minimum =0;
		int maximum = 0;
		int result[] = x;
		
		for(int i = 0;	i < x.length;	i++){
			
			if(x[i] < minimum)
				minimum = x [i];
			
			else if(x[i] > maximum)
				maximum = x [i];
		}
			
		
		System.out.println("Minimum: "+minimum+"\nMaximum: "+maximum);
	}
}
