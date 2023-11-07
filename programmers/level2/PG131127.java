package progammers.level2;

import java.util.LinkedHashMap;
import java.util.Map;

// 할인 행사
public class PG131127 {
    public static void main(String[] args) {
        System.out.println(solution(
                new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"})
        );

        System.out.println(solution(
                new String[]{"apple"},
                new int[]{10},
                new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"})
        );
    }

    static int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new LinkedHashMap<>();

        int count = 0;
        for (int i = 0; i <= discount.length - 10; i++) {
            for (int j = 0; j < want.length; j++) {
                map.put(want[j], number[j]);
            }

            for (int j = i; j < i + 10; j++) {
                if (!map.containsKey(discount[j]) || map.get(discount[j]) == 0) {
                    break;
                }else {
                    map.put(discount[j], map.get(discount[j]) - 1);
                }
            }

            int sum = 0;
            for (String key : map.keySet()) {
                sum += map.get(key);
            }

            if (sum == 0) {
                count++;
            }
        }

        return count;
    }
}
