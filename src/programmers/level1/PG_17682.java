package programmers.level1;

import org.junit.Assert;
import org.junit.Test;

// [1차] 다트 게임
public class PG_17682 {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int index = 0;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if(c >= '0' && c <= '9') {
                sb.append(String.valueOf(c));
            }else if(c == 'S' || c == 'D' || c == 'T') {
                int p = Integer.parseInt(sb.toString());

                if(c == 'S') {
                    p = (int) Math.pow(p, 1);
                }else if(c == 'D') {
                    p = (int) Math.pow(p, 2);
                }else {
                    p = (int) Math.pow(p, 3);
                }

                score[index++] = p;
                sb = new StringBuilder();
            }else {
                if(c == '#') {
                    score[index - 1] *= -1;
                }else {
                    score[index - 1] *= 2;
                    if(index - 2 >= 0) {
                        score[index - 2] *= 2;
                    }
                }
            }
        }
        int answer = 0;
        for(int i : score) {
            answer += i;
        }

        return answer;
    }

    @Test
    public void test() {
        String str = "1S2D*3T";
        int result = solution(str);
        Assert.assertEquals(37, result);
    }
}
