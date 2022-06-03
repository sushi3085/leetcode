public class _474OnesandZeroes {
    public static void main(String[] args) {
        int result = new _474OnesandZeroes().findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 5, 3);
        System.out.println(result);
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int[] count = count(str);
            for (int i = m; i >= count[0]; i--) {
                for (int j = n; j >= count[1]; j--) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - count[0]][j - count[1]]);
                }
            }
        }
        return dp[m][n];
    }

    private int[] count(String str) {
        int[] count = new int[2];
        for (char c : str.toCharArray()) {
            if (c == '0') {
                count[0]++;
            } else {
                count[1]++;
            }
        }
        return count;
    }
}