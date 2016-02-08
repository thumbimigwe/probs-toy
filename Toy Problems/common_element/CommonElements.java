package feb_3rd;

// Using Java, come up with an algorithm to identify
// common elements or numbers between two given arrays.
// Do NOT use any inbuilt methods.

//**********PSEUDOCODE**********
// * Create a class
// * Create a main method
// * Create two arrays
// * Create a conditional loop
// * find the common element
// * print out the common element


public class CommonElements {
	public static void main(String[] args) {
		int arr1 [] = {1,2,3,4,5,6,7,8,9,0};
		int arr2 [] = {5,8,2,34,6,27,28,33,4};
		
		for(int a=0;	a < arr1.length;	a++)
		{
			for(int b=0;	b <arr2.length;	b++)
			{
            	if(arr1[a]==arr2[b])
            	{
            		System.out.println(arr1[a]);
            	}
            }
		}
	}
}
