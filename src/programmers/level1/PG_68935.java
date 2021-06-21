package programmers.level1;

import org.junit.Assert;
import org.junit.Test;

// 3진법 뒤집기
public class PG_68935 {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        String[] arr = sb.toString().split("");
        for(int i = 0; i < arr.length; i++) {
            answer+= Integer.parseInt(arr[i]) * Math.pow(3, (arr.length-1)-i);
        }

        return answer;
    }

    @Test
    public void test() {
        // given
        int n = 45;

        // when
        int result = solution(n);

        // then
        Assert.assertEquals(7, result);
    }
}
