package programmers.level2.unsolve;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// 전화번호 목록
public class PG_42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        // Set<String> set = new HashSet<>(Arrays.asList(phone_book));
        for(int i = 0; i < phone_book.length-1; i++) {
            String str = phone_book[i];
            for(int j = i + 1; j < phone_book.length; j++) {
                if(phone_book[j].indexOf(str) == 0) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }

    @Test
    public void test() {
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = solution(phone_book);
        Assertions.assertFalse(result);
    }
}