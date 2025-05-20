package LinearSearch;

public class Findrichestmanwealth {

    public static void main(String[] args) {
        int[][] welathinbank = {
            {10000, 200000, 20000},
            {2000, 5000, 2000},
            {800000, 288800, 2999900}
        };
        // 0 1 2 = person index (rows)
        // inside each row = wealth in different banks (columns)

        int maxWealth = maximumwealth(welathinbank);
        System.out.println("Richest person's wealth is: " + maxWealth);
    }

    static int maximumwealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int bank = 0; bank < accounts[person].length; bank++) {
                sum += accounts[person][bank];
            }
            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}
