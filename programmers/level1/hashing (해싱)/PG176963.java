package programmers.level1.success;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

// 추억 점수
public class PG176963 {
    public static void main(String[] args) {
        int[] solution = solution(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}
        );

        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] scores = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    score += map.get(photo[i][j]);
                }
            }
            scores[i] = score;
        }

        return scores;
    }
}
