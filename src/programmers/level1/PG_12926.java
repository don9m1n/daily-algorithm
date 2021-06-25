package programmers.level1.unsolve;

import org.junit.Assert;
import org.junit.Test;

// 시저 암호
public class PG_12926 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);

            if(ch == ' ') {
                sb.append(ch);
            }else {
                if(122 - (ch + n) > 0 || 90 - (ch + n) > 0) {
                    sb.append((char)(ch + n));
                }else {
                    if(ch >= 'a' && ch <= 'z') {
                        sb.append((char)(96 + n));
                    }else if(ch >= 'A' && ch <= 'Z') {
                        sb.append((char)(64 + n));
                    }
                }
            }
        }
        return sb.toString();
    }

    @Test
    public void test() {
        // given
        String s = "zzzzz";
        int n = 2;

        // when
        String result = solution(s, n);

        // then
        Assert.assertEquals("bbbbb", result);
    }
}
