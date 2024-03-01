package progammers.level2;

import java.util.HashMap;
import java.util.Map;

// 의상
public class PG_42578 {
    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        System.out.println(solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
        System.out.println(solution(new String[][]{{"a", "headgear"}, {"b", "headgear"}, {"c", "eyewear"}, {"d", "eyewear"}, {"e", "face"}, {"f", "face"}}));

    }

    static int solution(String[][] clothes) {

        Map<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        // (a + 1)(b + 1)(c + 1)
        int answer = 1;
        for (String key : map.keySet()) {
            answer *= map.get(key) + 1;
        }

        return --answer;
    }
}
