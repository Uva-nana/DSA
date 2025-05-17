package conditiondsandloops;

public class Functionsandmethods {
	
	static int total;

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        sum(a, b);  // Call the method inside main
        System.out.println("The sum is: " + total);
        
        String name = "Yuvarani";
        String message = changename(name);
        System.out.println(message);
    }

    static void sum(int a , int b) {
        total = a + b;
    }

    static String changename(String naam) {
        naam = "Yuvacutie";
        return naam;
    }
}
