package LinearSearch;

import java.util.Arrays;

public class Linearsearchin2D {
	//Question is Find the given target number is exists in the given array = target = 63

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] nums = {{2,3,4,5},{5,6,3},{5,63,3,1,2}}; //We initialized the arrays of integers
		int target = 63;
		
		int [] ans = searchingin2D(nums, target);
		System.out.println(Arrays.toString(ans));
	}
		
		static int [] searchingin2D(int [] [] arrays, int target) {
			for (int row = 0; row<arrays.length; row++) {
				for (int col = 0; col<arrays[row].length; col++) {
					if (arrays[row][col] == target)
					{
						return new int [] {row,col};
					}
				}
			}
			
			 return new int[] { -1, -1 }; // 
		}
		
		
	}

