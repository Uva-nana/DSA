package conditiondsandloops;

public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 50;
		int temp = a;
		
		System.out.println("Before Swapping : "  + "a is :"  +a + " " + "b is: "+  b);
		
		//a = b;
		//b= temp;
		
		//System.out.println("After Swapping : "  + "a is :" +a+ " " + "b is :" + b);
		
		
		int c = 0;
		
		c= a+b; //60 
		a = c-a; // 60-10 = 50
		b= c-a; // 60-50 = 10
		
		System.out.println("After Swapping : "  + "a is :" +a+ " " + "b is :" + b);
		
		
	}

	
	
}
