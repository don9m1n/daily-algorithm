package programmers.level2.success;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 전화번호 목록
public class PG42577 {
    public static void main(String[] args) {
        boolean solution1 = solution1(new String[]{"119", "97674223", "1195524421"});
        boolean solution2 = solution2(new String[]{"119", "97674223", "1195524421"});
        System.out.println("solution2 = " + solution2);
    }

    // Hash
    private static boolean solution2(String[] phone_book) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }

    // for문
    public static boolean solution1(String[] phone_book) {

        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }
}
