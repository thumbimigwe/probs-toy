package feb_15th;

import java.util.Scanner;

//***********SOLUTION # 1 - for all the fibonacci***********
public class fibonacci
{
	public static void main(String[] args)
	{
	       Scanner scan = new Scanner(System.in);
	       System.out.println("Enter the value of n: ");
	       int n = scan.nextInt();
	       for (int i = 0; i <= n; i++) 
	       {
	           System.out.print(fibonacci(i) + " ");
	       }
	   }

	   public static int fibonacci(int n)
	   {
	       if (n == 0)
	       {
	           return 0;
	       }
	       
	       else if (n == 1)
	       {
	           return 1;
	       }
	       
	       else
	       {
	           return fibonacci(n - 1) + fibonacci(n - 2);
	       }
	   }	   
}