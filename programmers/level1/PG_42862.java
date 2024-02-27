package progammers.level1;

import java.util.Arrays;

public class PG_42862 {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
    }

    static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        int[] people = new int[n];
        for (int l : lost) {
            people[l - 1]--;
        }

        for (int r : reserve) {
            people[r - 1]++;
        }

        for (int i = 0; i < people.length; i++) {
            // 체육복을 잃어버린 학생인 경우
            if (people[i] == -1) {
                if (i - 1 >= 0 && people[i - 1] == 1) {
                    people[i]++;
                    people[i-1]--;
                } else if (i + 1 < people.length && people[i + 1] == 1) {
                    people[i]++;
                    people[i+1]--;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }
}
