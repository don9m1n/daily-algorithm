package progammers.level1;

import java.util.Arrays;

// x만큼 간격이 있는 n개의 숫자
public class PG12954 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));
    }

    static long[] solution(int x, int n) {
        long[] answer = new long[n];

        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
}
