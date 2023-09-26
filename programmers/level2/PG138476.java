package progammers.level2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// 귤 고르기
public class PG138476 {
    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(1, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }

    static int solution(int k, int[] tangerine) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();

        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            pq.add(map.get(key));
        }

        int count = 0;
        while (k > 0) {
            if (pq.peek() > k) {
                pq.poll();
                count++;
                break;
            } else {
                k -= pq.poll();
                count++;
            }
        }

        return count;
    }
}
