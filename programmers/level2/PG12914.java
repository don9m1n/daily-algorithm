package progammers.level2;

// 멀리뛰기
public class PG12914 {
    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution(3));
        System.out.println(solution(1));
    }

    static long solution(int n) {
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < 2001; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
        }

        return dp[n];
    }
}
