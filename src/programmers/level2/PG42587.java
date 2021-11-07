package programmers.level2;

import java.util.*;

// 프린터 <Stack, Queue>
public class PG42587 {

    public static void main(String[] args) {
        int solution = solution(new int[]{2, 1, 3, 2}, 2);
        int solution2 = PriorityQueue(new int[]{2, 1, 3, 2}, 2);
        System.out.println("solution2 = " + solution2);
    }

    // 우선순위 큐 사용
    public static int PriorityQueue(int[] priorities, int location){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }

        int koby = 0;
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if(priorities[i] == pq.peek()) {
                    if(location == i) {
                        return ++koby;
                    }
                    pq.poll();
                    koby++;
                }
            }
        }
        return -1;
    }

    // 큐 사용
    public static int solution(int[] priorities, int location) {

        Queue<Task> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            q.add(new Task(i, priorities[i]));
        }

        int now = 0;
        while (!q.isEmpty()) {
            Task current = q.poll();
            boolean flag = false;
            for (Task t : q) {
                if(t.priority > current.priority) { // 현재 문서보다 중요도가 높은 문서가 큐 안에 있다면
                    flag = true;
                }
            }

            if (flag) {
                q.add(current);
            } else {
                now++;
                if(current.location == location) {
                    break;
                }
            }
        }

        return now;
    }

    static class Task {
        int location;
        int priority;

        public Task(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }
}
