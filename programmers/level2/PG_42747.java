package progammers.level2;

import java.util.Arrays;

// H-Index
public class PG_42747 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
        System.out.println(solution(new int[]{0,0,0,0,1}));
    }

    static int solution(int[] citations) {

        Arrays.sort(citations);

        int answer = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            int min = Math.min(citations[i], citations.length - i);

            if(min > answer) answer = min;
        }

        return answer;
    }
}
