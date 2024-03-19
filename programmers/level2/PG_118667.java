package progammers.level2;

import java.util.LinkedList;
import java.util.Queue;

// 두 큐 합 같게 만들기
public class PG_118667 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1}));
        System.out.println(solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2}));
        System.out.println(solution(new int[]{1, 1}, new int[]{1, 5}));
    }

    static int solution(int[] queue1, int[] queue2) {

        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long total = 0;
        long totalQueue1 = 0;

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            total += queue1[i] + queue2[i];
            totalQueue1 += queue1[i];
        }

        if (total % 2 != 0) {
            return -1;
        }

        long target = total / 2;
        while (totalQueue1 != target) {
            if (answer > (q1.size() + q2.size()) * 2) {
                return -1;
            }

            if (totalQueue1 > target) {
                totalQueue1 -= q1.peek();
                q2.add(q1.poll());
            } else {
                totalQueue1 += q2.peek();
                q1.add(q2.poll());
            }

            answer++;
        }


        return answer;
    }
}
