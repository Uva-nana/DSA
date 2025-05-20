package binarysearch;

import java.util.Arrays;

public class BasicBinarySearch {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 7, 7, 8, 9, 22, 33, 46, 67, 73};
        int target = 73;

        int ans = findTheTargetUsingBinarySearch(numbers, target);
        System.out.println("Target found at index: " + ans);
    }

    static int findTheTargetUsingBinarySearch(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < numbers[middle]) {
                end = middle - 1;
            } else if (target > numbers[middle]) {
                start = middle + 1;
            } else {
                return middle; // Found
            }
        }

        return -1; // Not found
    }
}
