package arrays;

public class ArrayStrustures {

	private int [] theArray = new int [50]; // Creates an array with 50 indexes
	
	private int arraySize = 10; // Elements in theArray

// Fills the Array with random values
	public void generateRandomArray(){
		for(int i = 0; i < arraySize; i++){
			
// Random number 10 through 19
	theArray[i] = (int)(Math.random()*10)+10;
	}
}
	public int[] getTheArray(){
	
		return theArray;
	}
	
	public int getArraySize(){
		
		return arraySize;
	}

// Prints the Array on the screen in a grid

	public void printArray(){
		System.out.println("----------");
		for(int i = 0; i < arraySize; i++){
			
			System.out.print(" | " +i+" | ");
			System.out.println(theArray[i] + " | ");
			
			System.out.println("----------");
		}
	}
	
// Gets value at provided index
	   public int getValueAtIndex(int index){
		   
		   if(index < arraySize) return theArray[index];
		   
		   return 0;
		   }
	   
// Returns true or false if a value is in the Array
	   
	   
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ArrayStrustures newArray = new ArrayStrustures();
		
		newArray.generateRandomArray();
		
		newArray.printArray();

	}

}
