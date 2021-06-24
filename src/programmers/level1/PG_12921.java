package programmers.level1.solve;

import org.junit.Assert;
import org.junit.Test;

// 소수 찾기
public class PG_12921 {
    public int solution(int n) {
        int answer = 0; // 소수 개수 count

        int[] number = new int[n+1];

        // 2 ~ n 까지의 수를 배열에 저장
        for(int i=2; i<=n; i++) {
            number[i] = i;
        }

        // 2부터 시작해서 2의 배수를 0으로 치환
        // 배열을 돌면서 0인 인덱스는 패스하고, 0이 아니라면 0으로 치환
        for(int i = 2; i <= n; i++) {
            if(number[i] == 0) continue;

            for(int j = 2 * i; j <= n; j += i) {
                number[j] = 0;
            }
        }

        // 배열에서 0이 아닌 숫자의 개수가 소수의 개수
        for (int j : number) {
            if (j > 0) {
                answer++;
            }
        }

        return answer;
         /*
        for(int i = 2; i <= n; i++) {
            boolean flag = true;
            for(int j = 2; j < Math.sqrt(i); j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }
       */
    }

    @Test
    public void test(){
        int n = 10;
        int result = solution(n);
        Assert.assertEquals(4, result);
    }
}
