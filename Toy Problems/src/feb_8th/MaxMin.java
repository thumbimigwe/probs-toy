package feb_8th;

import java.util.Arrays;
public class MaxMin {

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