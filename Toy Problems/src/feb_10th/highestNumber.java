package feb_10th;


import java.util.Arrays;

//	########## PSEUDOCODE ########## 
//	Declare and initialize an integer
//	convert integer to an array of characters
//	sort the array
//	loop through the array in reverse order.



public class highestNumber {

	public static void main(String[] args) {
		int number = 1508;
		char[] x = String.valueOf(number).toCharArray();
		Arrays.sort(x);
		
		for (int i = x.length - 1;	i>=0;	i--){
			System.out.print(x[i]);
		}
	}	


}
