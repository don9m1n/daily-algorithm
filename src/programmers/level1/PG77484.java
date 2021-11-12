package programmers.level1;

import java.util.Arrays;

// 로또의 최고 순위와 최저 순위 [2021 Dev-Matching: 웹 백엔드 개발자]
public class PG77484 {

    public static void main(String[] args) {
        int[] solution = solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {

        int cnt = 0; // 맞은 번호의 개수
        int zeroCnt = 0;
        for (int lotto : lottos) {
            if(lotto == 0) {
                zeroCnt++;
                continue;
            }
            for (int win_num : win_nums) {
                if(lotto == win_num) cnt++;
            }
        }

        int[] score = new int[2];
        score[0] = getGrade(cnt + zeroCnt);
        score[1] = getGrade(cnt);

        return score;
    }

    private static int getGrade(int n) {
        switch (n) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
