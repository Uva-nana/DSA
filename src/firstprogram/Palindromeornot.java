package firstprogram;

public class Palindromeornot {

    public static void main(String[] args) {
        String s = "Madam";
        String reverse = "";

        // Convert the string to lowercase for case-insensitive comparison
        s = s.toLowerCase();

        // Reverse the string
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        // Check if the original string is equal to its reverse
        if (s.equals(reverse)) {
            System.out.println("The Given String is a Palindrome");
        } else {
            System.out.println("The Given String is not a Palindrome");
        }
    }
}
