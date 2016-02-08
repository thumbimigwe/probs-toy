// Using java solve the problem below:

// Given an array of integers, find the maximum and minimum of this array. create a variable to hold the maximum
// create a variable to hold the minimum. take in the array of numbers begin to loop through them
// put the lowest in its array put the highest in its array output the highest then output the lowest


//************************* PSEUDOCODE *************************
//	CREATE A CLASS
//	CREATE A MAIN CLASS
//	create the array
//	(optional) prompt for the user input
//	elements in the array
//	assign the smallest and the largest elements in the array
//	do  a for loop
//		-create an if-else condition
//	give output	


class MinMaxExample { 
 
  public static void main(String args[]){
    int array[] = new int[]{10, 11, 88, 2, 12, 120};
 
    // Calling getMax() method for getting max value
    int max = getMax(array);
    System.out.println("Maximum Value is: "+max);
 
    // Calling getMin() method for getting min value
    int min = getMin(array);
    System.out.println("Minimum Value is: "+min);
  }
 
  // Method for getting the maximum value
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  // Method for getting the minimum value
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}