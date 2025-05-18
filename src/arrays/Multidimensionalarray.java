package arrays;
import java.util.Scanner;

public class Multidimensionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arrays = new int[3][2];

        System.out.println("Enter 6 numbers:");
        for (int row = 0; row < arrays.length; row++) {
            for (int col = 0; col < arrays[row].length; col++) {
                arrays[row][col] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        for (int row = 0; row < arrays.length; row++) {
            for (int col = 0; col < arrays[row].length; col++) {
                System.out.print(arrays[row][col] + " ");
            }
            System.out.println();
        }
    }
}
