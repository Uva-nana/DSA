package LinearSearch;

import java.util.Arrays;

//Question:Find Numbers with Even Number of Digits 
//Which means ==> if digits count is 2, 4, 6, 8 its even else odd
public class LeetcodeProblem {


	public static void main(String[] args) {
		int[] nums = {12, 345, 2, 6, 7896}; 
		int result = findthenumbers(nums);
		System.out.println("The number of even digits in an given array is :" +result);  // Output: 2
	}

	static int findthenumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}
		return count;
	}
	static int digits(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	static boolean even(int num) {
		int noofdigits = digits(num);
		if (noofdigits % 2 == 0) {
			return true;
		}
		return false; // ✅ Fixed here
	}

	
	}
