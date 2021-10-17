package programmers.weeklychallenge;

import java.util.Arrays;

// 상호 평가
public class PG83201 {
    public String solution(int[][] scores) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < scores.length; i++) {
            int max = 0;
            int min = 101;
            int sum = 0;
            int divide = scores.length;

            for (int j = 0; j < scores.length; j++) {
                if(i != j) {
                    if(scores[j][i] > max) {
                        max = scores[j][i];
                    }
                    if(scores[j][i] < min) {
                        min = scores[j][i];
                    }
                }
                sum += scores[j][i];
            }

            if(scores[i][i] > max || scores[i][i] < min) {
                sum -= scores[i][i];
                divide--;
            }

            float avg = sum / (float)divide;

            sb.append(avg >= 90 ? "A" : avg >= 80 ? "B" : avg >= 70 ? "C" : avg >= 50 ? "D" : "F");
//            if(avg >= 90) sb.append("A");
//            else if(avg >= 80) sb.append("B");
//            else if(avg >= 70) sb.append("C");
//            else if(avg >= 50) sb.append("D");
//            else sb.append("F");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] scores = {{70,49,90},{68,50,38},{73,31,100}};

        PG83201 pg = new PG83201();
        String solution = pg.solution(scores);
        System.out.println("solution = " + solution);
    }
}
