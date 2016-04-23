package feb_24th;

import java.util.Scanner;

public class Gcf extends Divide{

	public static void main(String[] args) {
		Divide d = new Divide();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the first num: 1");
		int a = sc.nextInt();
		
		System.out.print("Input the Second num: ");
		int b = sc.nextInt();
		
		int y = divide(a, b);
		
		System.out.print("The Highest Common factor is: " +y);
	}
}
