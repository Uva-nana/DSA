package arrays;

import java.util.Arrays;

public class Basicarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Syntax of the array
		
		//datatype variablename =  new dataype [];
		
		int[] studentrollno = new int [5];
		String [] name = {"Yuva" ,"Queen"};
		String [] str = new String [5];
		studentrollno[0] = 545;
		studentrollno[1] = 745;
		studentrollno[2] = 525;
		studentrollno[3] = 846;
		studentrollno[4] = 385;
		
		// int studentrollno => we are declaring == here it will store in hack the rference
		//= new int [5]; ==> here declaration happens , actually in heap 
		
		System.out.println("Print the Student roll number for this exam hall : " + Arrays.toString(studentrollno) );
		System.out.println("Print the Student roll number for this exam hall : " + studentrollno) ;
		System.out.println("Print the Student roll number for this exam hall : " + studentrollno [4] );
		System.out.println(Arrays.toString(name));
		System.out.println(str[1]);
		
	}

}
