package progammers.level0;

import java.util.Arrays;

// 분수의 덧셈
public class PG_120808 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution(5, 4, 5, 4)));
    }

    static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int gcd = gcd(denom1, denom2);
        int lcm = (denom1 * denom2) / gcd;

        int up = (numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2)); // 분자
        int down = lcm; // 분모

        int max = Math.max(up, down);
        int min = Math.min(up, down);
        gcd = gcd(max, min);

        answer[0] = up / gcd;
        answer[1] = down / gcd;

        return answer;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}
