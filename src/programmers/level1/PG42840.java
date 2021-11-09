package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 모의고사
public class PG42840 {

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] answers) {

        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] score = new int[3]; // 각 학생의 점수를 저장할 배열
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if(answers[j] == patterns[i][j % patterns[i].length]) score[i]++;
            }
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if(score[i] >= max) {
                list.add(i + 1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
