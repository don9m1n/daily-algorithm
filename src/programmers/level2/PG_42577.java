package programmers.level2.solve;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// 전화번호 목록
public class PG_42577 {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (String s : phone_book) {
            for (int j = 1; j < s.length(); j++) {
                if (map.containsKey(s.substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void test() {
        String[] phone_book = {"1195524421", "119", "97674223"};
        boolean result = solution(phone_book);
        Assertions.assertFalse(result);
    }
}