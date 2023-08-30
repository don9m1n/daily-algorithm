package programmers.level1.success;

import java.util.Arrays;

// 과일 장수
public class PG135808 {
    public static void main(String[] args) {
        int solution = solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println("solution = " + solution);
    }

    public static int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int sum = 0;
        for (int i = score.length; i >= m; i -= m) {
            sum += score[i - m] * m;
        }

        return sum;
    }
}
