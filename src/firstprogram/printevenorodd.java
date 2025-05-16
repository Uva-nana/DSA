package firstprogram;

import java.util.Scanner;

public class printevenorodd {

	public static void main(String[] args) {
	//Write a program to print whether a number is even or odd, also take input from the user.
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number%2==0) {
			System.out.println("It is a even number");
		}
		else {
				System.out.println("It is a odd number");
			}
			
		}
		

	}


