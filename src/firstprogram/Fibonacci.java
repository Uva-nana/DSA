package firstprogram;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner (System.in);
		int in = input.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 0; i<in; i++) {
			System.out.println(a + "");
			int next = a+b;
			a= b;
			b = next;
		}

	}

}
