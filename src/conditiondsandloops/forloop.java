package conditiondsandloops;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    
     for (int i = 0; i<=5; i++)
     {
    	 System.out.println(i);
     }
     
     
     System.out.println("Please Enter the numbers range you wanted to print ");
     
     Scanner input = new Scanner(System.in);
     int getinput = input.nextInt();
     
     for (int i = 1; i<=getinput;i++ )
     {
    	 System.out.println(i);
     }
	}

}



