package progammers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;

// 최솟값 만들기
public class PG12941 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        System.out.println(solution(new int[]{1, 2}, new int[]{3, 4}));
    }

    static int solution(int[] A, int[] B) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        for (int a : A) pq1.add(a);
        for (int b : B) pq2.add(b);

        int sum = 0;
        while (!pq1.isEmpty() || !pq2.isEmpty()) {
            sum += pq1.poll() * pq2.poll();
        }

        return sum;
    }
}
