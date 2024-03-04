package progammers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;

// 프로세스
public class PG_42587 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }

    static int solution(int[] priorities, int location) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int priority : priorities) {
            pq.add(priority);
        }

        int count = 0;
        loop:
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    if (location == i) {
                        count++;
                        break loop;
                    }
                    pq.poll();
                    count++;
                }

            }
        }

        return count;
    }
}
