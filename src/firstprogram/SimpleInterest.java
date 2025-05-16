package firstprogram;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    double principal = input.nextDouble();
	    double time = input.nextDouble();
	    double rate = input.nextDouble();
	    int div = 100;
	    
	    double Simple_Interest = (principal*time*rate)/div;
	    System.out.println("The Simple Interest for the Amount is " + Simple_Interest);
	}

}
