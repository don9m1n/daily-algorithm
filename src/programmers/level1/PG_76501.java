package programmers.level1;

import org.junit.Assert;
import org.junit.Test;

// 음양 더하기
public class PG_76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(!signs[i]) {
                absolutes[i] *= -1;
            }

            answer += absolutes[i];
        }
        return answer;
    }

    @Test
    public void test() {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        int result = solution(absolutes, signs);

        Assert.assertEquals(9, result);
    }
}
