package firstprogram;

import java.util.Scanner;

public class Twonumbers {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstnum = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondnum = input.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        String selectOperator = input.next();  // reads "+", "-", "*", or "/"

        // perform the chosen operation
        if (selectOperator.equals("+")) {
            int sum = firstnum + secondnum;
            System.out.println("Result: " + sum);

        } else if (selectOperator.equals("-")) {
            int diff = firstnum - secondnum;
            System.out.println("Result: " + diff);

        } else if (selectOperator.equals("*")) {
            int prod = firstnum * secondnum;
            System.out.println("Result: " + prod);

        } else if (selectOperator.equals("/")) {
            if (secondnum != 0) {
                double quotient = (double) firstnum / secondnum;
                System.out.println("Result: " + quotient);
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }

        } else {
            System.out.println("Invalid operator selected.");
        }

        input.close();
    }
}