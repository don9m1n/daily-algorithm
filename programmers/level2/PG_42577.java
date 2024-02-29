package progammers.level2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

// 전화번호 목록
public class PG_42577 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123","456","789"}));
    }

    static boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(i, phone_book[i]);
        }

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (map.get(i + 1).startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }
}
