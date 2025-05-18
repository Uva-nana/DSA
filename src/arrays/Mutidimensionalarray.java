package arrays;

import java.util.Arrays;

public class Mutidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[] = {2,3,4,5,6}
		//2D arrray 2 3 4
		//          5 6 7
		//          8 9 10
		// Syntax for 2D array  int [] [] arr = new int [] []
		
		int [] [] arr = {
				{2,3,4},
				{5,6,7},
				{8,9,10}
		};
		
		System.out.println(Arrays.deepToString(arr));
		
		
		for (int[] row : arr) {
		    for (int num : row) {
		        System.out.print(num + " ");
		    }
		    System.out.println(); // New line after each row
		}


	}

}
