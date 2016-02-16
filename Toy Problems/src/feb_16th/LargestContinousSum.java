package feb_16th;

public class LargestContinousSum
{

	public static int findMaxSum(int[]anArray)
	{
		int currentSum = 0;
		int currentMax = 0;
		
		for (int j = 0; j< anArray.length; j++)
		{
			currentSum += anArray[j];
			
			if (currentMax < currentSum)
				currentMax = currentSum;
			else if (currentSum < 0)
				currentSum = 0;
		}
		return currentMax;
	}
	

}
