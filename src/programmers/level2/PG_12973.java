package programmers.level2.unsolve;

import org.junit.Assert;
import org.junit.Test;

// 짝지어 제거하기
public class PG_12973 {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean isCheck = false;

        while(true) {
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.toString().charAt(i) == sb.toString().charAt(i + 1)) {
                    sb.delete(i, i + 2);
                    isCheck = true;
                    break;
                }
            }

            if(!isCheck) {
                return 0;
            }else if(sb.length() == 0) {
                break;
            }
        }

        return 1;
    }

    @Test
    public void test() {
        String s = "baabaa";
        int result = solution(s);
        Assert.assertEquals(1, result);
    }
}
