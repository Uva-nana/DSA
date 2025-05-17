package conditiondsandloops;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Area Of Circle Java Program
		//A= pi*r*r
		double pi = 3.14;
		System.out.println("Print the radius r value = ");
		Scanner in = new Scanner (System.in);
		int r= in.nextInt();
		double areaofcircle = pi*r*r;
		System.out.println("The are of the circle is: " + areaofcircle);

	}

}
