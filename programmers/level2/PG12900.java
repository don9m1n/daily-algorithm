package progammers.level2;

// 2 x n 타일링 [Dynamic Programming]
public class PG12900 {
    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution(7));
    }

    static int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            // 점화식: dp[i] = dp[i - 1] + dp[i - 2]
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }

        return dp[n];
    }
}
