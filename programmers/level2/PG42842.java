package progammers.level2;

import java.util.Arrays;

// 카펫
public class PG42842 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
        System.out.println(Arrays.toString(solution(8, 1)));
        System.out.println(Arrays.toString(solution(24, 24)));
    }

    static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int i = 1;

        loop:
        while(true) {
            int j = 1;
            while(j <= i) {
                int sum = (i * 2) + (j * 2) - 4;
                if (sum == brown) {
                    if (i * j - brown == yellow) {
                        answer[0] = i;
                        answer[1] = j;
                        break loop;
                    }
                }
                j++;
            }
            i++;
        }

        return answer;
    }
}
