package conditiondsandloops;

import java.util.Scanner;

public class PrintLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int max = c;
		if (b>max)
		{
			max = b;
		}
		if (a>max) {
			max = c;
		}
		System.out.println("The Maximum num : " + max );
	
	
	int maximum = Math.max(c,Math.max(a, b));
	System.out.println("The Maximum of all Number is : " + maximum);
	
	System.out.println(Math.max(60, 84));

}
}
