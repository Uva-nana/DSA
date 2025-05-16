package firstprogram;

import java.util.Scanner;

public class CurrenctoUsd {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the currency in Rupees (INR): ");
        float indianRupees = scanner.nextFloat();

        float conversionRate = 83.5f; // 1 USD = 83.5 INR
        float usd = indianRupees / conversionRate;

        System.out.printf("%.2f INR is approximately %.2f USD\n", indianRupees, usd);
    }
}