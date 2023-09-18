package progammers.level1;

import java.util.Arrays;

// 최대공약수와 최소공배수
public class PG12940 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(18, 24)));
        System.out.println(Arrays.toString(solution(18, 54)));
        System.out.println(Arrays.toString(solution(1, 3)));
        System.out.println(Arrays.toString(solution(1112, 695)));
    }

    static int[] solution(int n, int m) {
        int left = Math.min(n, m);
        int right = Math.max(n, m);

        while (right % left > 0) {
            int tmp = left;
            left = right % left;
            right = tmp;
        }

        int gcd = left;
        int lcm = gcd * (n / gcd) * (m / gcd);

        return new int[]{gcd, lcm};
    }
}
