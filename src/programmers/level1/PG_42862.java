package programmers.level1;

import java.util.Arrays;

// 체육복
public class PG_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];

        for (int j : lost) {
            student[j-1]--;
        }
        for (int j : reserve) {
            student[j-1]++;
        }

        for(int i = 0; i < student.length; i++) {
            if(student[i] < 0) {
                if(i != student.length - 1 && student[i+1] > 0) {
                    student[i]++;
                    student[i+1]--;
                }else if(i != 0 && student[i-1] > 0) {
                    student[i]++;
                    student[i-1]--;
                }
            }
        }

        for (int j : student) {
            if (!(j < 0)) {
                answer++;
            }
        }

        return answer;
    }
}