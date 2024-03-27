package progammers.level0;

import java.util.Arrays;

// 뒤에서 5등까지
public class PG_181853 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(solution(new int[]{12, 4, 15, 46, 38, 1, 14}))));
    }

    static int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);

        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
