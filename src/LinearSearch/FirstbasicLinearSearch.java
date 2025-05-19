package LinearSearch;

public class FirstbasicLinearSearch {

	public static void main(String[] args) {
		
		int [] nums = {22,4,58,99,17,19,34,25}; //Array of integers 
		//int [] nums = {};
		int target = 19;
		int result = linearSearch(nums, target);
		System.out.println("The Target number 19 is found in the index :" + result);
	}
		
	
	static	int linearSearch(int [] arr, int target)
	{
		if (arr.length==0) {
		System.out.println("The Array of integers have no elements so the index is -1");
		return -1;
			
		}
		for (int i = 0; i<arr.length; i++) {
			int element = arr[i];
			if (element == target) {
				return i;
			}
		
			
		}
		return -1;

	}

}