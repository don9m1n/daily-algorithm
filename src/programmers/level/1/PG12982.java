package programmers.level1;

import java.util.Arrays;

// 예산
public class PG12982 {

    public static void main(String[] args) {
        int solution = solution(new int[]{1,3,2,5,4}, 9);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] d, int budget) {

        Arrays.sort(d);
        int i = 0;
        while (i < d.length) {
            if(budget < d[i]) break;
            budget -= d[i];
            i++;
        }

        return i;
    }
}
