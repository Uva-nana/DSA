package arrays;

import java.util.Arrays;

public class PassinginFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {2,4,6,7,8};
		
		System.out.println("Printing the inital assinged numbers of int arrays : " + Arrays.toString(numbers));
		passinginfunctions(numbers);
	}

	static void passinginfunctions(int [] arr) {
		arr[1] = 10;
		System.out.println("Print the nums now : "  + arr[1]);
		
		
String [] alphabets = {"a", "b", "d"};
		
		System.out.println("Printing the inital assinged numbers of int arrays : " + Arrays.toString(alphabets));
		passinginfunctionsstring(alphabets);
	}

	static void passinginfunctionsstring(String [] str) {
		str[2] = "c";
		System.out.println("Print the nums now : "  + str[2]);
	}
}
