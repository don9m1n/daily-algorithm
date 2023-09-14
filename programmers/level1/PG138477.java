package progammers.level1;

import java.util.Arrays;
import java.util.PriorityQueue;

// 명예의 전당 1
public class PG138477 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }

    static int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k) {
                pq.add(score[i]);
            } else {
                if (score[i] > pq.peek()) {
                    pq.poll();
                    pq.add(score[i]);
                }
            }
            answer[i] = pq.peek();
        }

        return answer;
    }
}
