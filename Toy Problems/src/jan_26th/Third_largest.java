package jan_26th;
import java.util.Arrays;

public class Third_largest {
	
	public String ThirdGreatest(String[]strArr){
		
		int [] words = new int [strArr.length];
		for(int x=0; x <strArr.length; x++){
			words[x] = strArr[x].length();
		}
		
		Arrays.sort(words);
		String ThirdLargest = "";
			
			for(int y=0; y <strArr.length; y++){
			if(strArr[y].length() == words[words.length-3]){
				ThirdLargest = strArr[y];
			}
		}
		return ThirdLargest;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Third_largest third = new Third_largest();
		
		string[] strArr = {"Thumbi", "shh", "Migwe", "Nebuchadnezer", "Kiprotich", "Segu"};
		
		System.out.println(third.ThirdGreatest(strArr));

	}

}
