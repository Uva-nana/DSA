package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int [5];
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i<arr.length; i++) {
			//arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		
		
		//Enhanced for loop . foreachloop
		
		for (int i: arr) {
			//System.out.print(i);
			System.out.print(i + " ");
		}
	}

}
