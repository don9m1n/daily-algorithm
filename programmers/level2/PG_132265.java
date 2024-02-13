package progammers.level2;

import java.util.HashMap;
import java.util.Map;

// 롤케이크 자르기
public class PG_132265 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
        System.out.println(solution(new int[]{1, 2, 3, 1, 4}));
    }

    static int solution(int[] topping) {

        int answer = 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int t : topping) {
            map1.put(t, map1.getOrDefault(t, 0) + 1);
        }

        for (int t : topping) {
            map1.put(t, map1.get(t) - 1);
            map2.put(t, map2.getOrDefault(t, 0) + 1);

            if (map1.get(t) == 0) {
                map1.remove(t);
            }

            if (map1.size() == map2.size()) {
                answer++;
            }
        }

        return answer;
    }
}
