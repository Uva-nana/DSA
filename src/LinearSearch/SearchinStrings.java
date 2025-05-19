package LinearSearch;

public class SearchinStrings {

	public static void main(String[] args) {
        String name = " ";
        char target = 'u';

        int result = searchinginstrings(name, target);
        System.out.println("Index of '" + target + "': " + result);
    }

    static int searchinginstrings(String str, char target) {
        if (str.length() == 0)
            return -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
                return i;
        }

        return -1;
    }
}