package programmers.level1;

import org.junit.Assert;
import org.junit.Test;

// [카카오] 신규 아이디 추천
public class PG_72410__O {
    public String solution(String new_id) {
        // 1단계 - 대문자를 소문자로 변환
        new_id = new_id.toLowerCase();
        StringBuilder sb = new StringBuilder();

        // 2단계
        int i = 0;
        while(i < new_id.length()) {
            char ch = new_id.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') ||ch == '-' || ch == '_' || ch == '.') {
                sb.append(ch);
            }
            i++;
        }

        // 3단계 - 연속적인 "."을 하나로 치환
        int j = 0;
        while (j < sb.length() - 1) {
            char ch = sb.charAt(j);
            char ch2 = sb.charAt(j + 1);
            if (ch == '.' && ch2 == '.') {
                sb.deleteCharAt(j);
            } else {
                j++;
            }
        }

        // 4단계 - 처음이나 끝에 "."이 있으면 제거
        if(sb.length() > 0) {
            if (sb.charAt(0) == '.') {
                sb.deleteCharAt(0);
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        // 5단계 - 빈 문자열이면 "a" 대입
        if (sb.length() == 0) {
            sb.append("a");
        }

        // 6단계 - 아이디의 길이가 16자 이상이면 15자리 까지만 출력
        if(sb.length() >= 16) {
            sb.delete(15, sb.length());
            if(sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        if(sb.length() < 3) {
            char ch = sb.charAt(sb.length() - 1);
            while(sb.length() < 3) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    @Test
    public void test() {
        // given
        String new_id = "........................";

        // when
        String result = solution(new_id);

        // then
        Assert.assertEquals("aaa", result);
    }
}
