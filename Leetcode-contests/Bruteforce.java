public class Bruteforce {
     static final int MOD = 1_000_000_007;
    static String target;
    static int n;

    public static int numberOfWays(String s, String t, int k) {
        target = t;
        n = s.length();
        return dfs(s, k);
    }

    // Brute force recursion
    private static int dfs(String cur, int k) {
        // Base case
        if (k == 0) {
            return cur.equals(target) ? 1 : 0;
        }

        int ways = 0;

        // Try all suffix lengths from 1 to n-1
        for (int l = 1; l < n; l++) {
            String suffix = cur.substring(n - l);
            String prefix = cur.substring(0, n - l);
            String next = suffix + prefix;

            ways = (ways + dfs(next, k - 1)) % MOD;
        }

        return ways;
    }

    // MAIN FUNCTION WITH HARDCODED EXAMPLES
    public static void main(String[] args) {

        // Example 1
        String s1 = "abcd";
        String t1 = "cdab";
        int k1 = 2;
        int result1 = numberOfWays(s1, t1, k1);
        System.out.println("Example 1 Output: " + result1); // Expected: 2

        // Example 2
        String s2 = "ababab";
        String t2 = "ababab";
        int k2 = 1;
        int result2 = numberOfWays(s2, t2, k2);
        System.out.println("Example 2 Output: " + result2); // Expected: 2
    }
}
/*https://leetcode.com/problems/string-transformation/solutions/6265876/complete-guide-covering-all-topics-with-q583b/ */
