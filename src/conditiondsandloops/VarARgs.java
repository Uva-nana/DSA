package conditiondsandloops;

import java.util.Arrays;

import javax.print.attribute.IntegerSyntax;

public class VarARgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun(2,3,5,6,6,5,54,6);
	}
		static void fun(int... v) {
			System.out.println(Arrays.toString(v));
		}


	}


