package LinearSearch;

public class Findtheminimumvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Find the minimum value in an given array 
		
		int [] givennumbers = {1,2,4,5,6,7,4,32,2,5,7,54,3,2, -1};
		int minvlaue = 54;
		
		for (int i = 0; i<givennumbers.length; i++) {
			if (givennumbers[i]<minvlaue) {
				minvlaue = givennumbers[i];
				
			}
			System.out.print(i+ " ");
		}
		
		System.out.println("Minimum value is: " + minvlaue);

		System.out.println();
	}

}
