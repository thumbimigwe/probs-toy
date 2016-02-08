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
			
		int j = 0;
		
		do{
			j = 0;
			for (int k = 0;	k<result.length-1;	k++){
				
				if (result[k] > result[k+1]){
					int temp = result [k];
					result[k] = result [k + 1];
					result [k + 1] = temp;
					j++;
				}	
			}
		}
		
		while(j!=0);
		System.out.println("Minimum: "+minimum+"\nMaximum: "+maximum);
	}
}
