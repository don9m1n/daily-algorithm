package programmers.level1.success;

import java.util.*;

// 실패율
public class PG42889 {
    public static void main(String[] args) {
        int[] solution = solution(4, new int[]{1, 1, 1, 1});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    public static int[] solution(int N, int[] stages) {

        Map<Integer, Double> map = new TreeMap<>();

        int level = 1;
        while (level <= N) {
            int upCount = 0; // 분자
            int downCount = 0; // 분모
            for (int stage : stages) {
                if (stage >= level) downCount++;
                if (stage == level) upCount++;
            }

            double failureRate = (upCount + downCount == 0) ? 0 : upCount / (float) downCount;
            map.put(level, failureRate);
            level++;
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                if (o2.getValue().equals(o1.getValue())) {
                    return o1.getKey() - o2.getKey();
                }
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        List<Integer> rank = new ArrayList<>();
        for (Map.Entry<Integer, Double> l : list) {
            rank.add(l.getKey());
        }

        return rank.stream().mapToInt(i -> i).toArray();
    }
}
