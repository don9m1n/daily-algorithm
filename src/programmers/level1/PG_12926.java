package programmers.level1.unsolve;

import org.junit.Assert;
import org.junit.Test;

// 시저 암호
public class PG_12926 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch + n);
                if(ch > 'z') {
                    ch -= 26;
                }
            }else if(ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + n);
                if(ch > 'Z') {
                    ch -= 26;
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    @Test
    public void test() {
        // given
        String s = "YZ";
        int n =2;

        // when
        String result = solution(s, n);

        // then
        Assert.assertEquals("AB", result);
    }
}
