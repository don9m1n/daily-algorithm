package progammers.level1;

import java.util.LinkedHashMap;
import java.util.Map;

// 성격 유형 검사하기
public class PG118666 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"AN", "CF", "MJ", "RT", "NA" }, new int[]{5, 3, 2, 7, 5}));
        System.out.println(solution(new String[]{"TR", "RT", "TR" }, new int[]{7, 1, 3}));
    }

    static String solution(String[] survey, int[] choices) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        for (int i = 0; i < survey.length; i++) {
            String[] arr = survey[i].split("");
            if (choices[i] >= 5) {
                map.put(arr[1], map.getOrDefault(arr[1], 0) + choices[i] - 7 + 3);
            } else {
                map.put(arr[0], map.getOrDefault(arr[0], 0) + 7 - choices[i] - 3);
            }
        }

        StringBuilder sb = new StringBuilder();

        if (map.get("R") >= map.get("T")) {
            sb.append("R");
        } else {
            sb.append("T");
        }

        if (map.get("C") >= map.get("F")) {
            sb.append("C");
        } else {
            sb.append("F");
        }

        if (map.get("J") >= map.get("M")) {
            sb.append("J");
        } else {
            sb.append("M");
        }

        if (map.get("A") >= map.get("N")) {
            sb.append("A");
        } else {
            sb.append("N");
        }

        return sb.toString();
    }
}
