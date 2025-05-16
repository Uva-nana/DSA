package firstprogram;

import java.util.Scanner;

public class PrintGreeting {

	public static void main(String[] args) {
		//Take name as input and print a greeting message for that particular name.
		
		Scanner input_as_name = new Scanner(System.in);
		String name = input_as_name.nextLine();
		System.out.println("Hi " + name +" Welcome to DSA Learning");

	}

}
