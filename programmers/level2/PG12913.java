package progammers.level2;


// 땅따먹기
public class PG12913 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}));
        System.out.println(solution(new int[][]{{1, 1, 3, 1}, {2, 3, 2, 2}, {1, 4, 1, 1}}));
        System.out.println(solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 1000}}));
    }

    static int solution(int[][] land) {

        int[][] dp = new int[land.length][4];

        for (int i = 0; i < 4; i++) {
            dp[0][i] = land[0][i];
        }

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                for (int k = 0; k < land[i].length; k++) {
                    if (j != k) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + land[i][j]);
                    }
                }
            }
        }

        int max = 0;
        for (int i = 0; i < 4; i++) {
            max = Math.max(max, dp[land.length - 1][i]);
        }

        return max;
    }
}
