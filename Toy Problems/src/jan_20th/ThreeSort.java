package jan_20th;
import java.util.Arrays;
import java.lang.Math;

//THREESORT
//LANGUAGE: JAVA

//Create a ThreeSort class with a threeSort method and a main method.
//The threeSort method should contain the algorithm and the main method
//should be used for testing your algorithm. To make that easier, make the
//threeSort method static.

//Given three numbers as input, find the min, middle and max of the three.
//Return an array of the numbers in ascending order.
//Hint: to easily see your output, import java.util.Arrays
//and use the Arrays.toString(array) method to convert the Array to a string 
//and then log it using System.out.println();

//Example:
//ThreeSort.threeSort(9,4,6); // [4,6,9]
//ThreeSort.threeSort(3,2,1); // [1,2,3]

public class ThreeSort { //the class
	
	public static int[] threeSort (int a, int b, int c){ //declaring method with return type array
		int[]  num={a,b,c}; // assigning variables to new array
		Arrays.sort(num); // sort method of the array class
		return num;
	}

	
	public static void main(String[] args) { 
		System.out.println(Arrays.toString(ThreeSort.threeSort(9,4,6))); //printing out the converted array to string
		System.out.println(Arrays.toString(ThreeSort.threeSort(3,2,1))); //printing out the converted array to string
		}
	}
