package programmers.level2.solve;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// 124 나라의 숫자
public class PG_12899 {
    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        StringBuilder answer = new StringBuilder();

        while(n > 0) {
            int num = n % 3;
            n /= 3;

            if(num == 0) n--;

            answer.insert(0, numbers[num]);
        }

        return answer.toString();
    }

    @Test
    public void test(){
        int n = 5;

        String result = solution(n);

        Assertions.assertEquals("12", result);
    }
}