package progammers.level2;

import java.util.*;

// 기능 개발
public class PG_42586 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 95, 95, 95}, new int[]{4, 3, 2, 1})));

    }

    static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int progress : progresses) {
            queue.add(progress);
        }


        int index = 0;
        Queue<Integer> days = new LinkedList<>();
        while (!queue.isEmpty()) {
            Integer progress = queue.poll();
            int speed = speeds[index];
            int day = 0;

            while (progress < 100) {
                progress += speed;
                day++;
            }

            days.add(day);
            index++;
        }

        List<Integer> answer = new ArrayList<>();
        while (!days.isEmpty()) {
            int curr = days.poll();
            int count = 1;

            while (!days.isEmpty() && curr >= days.peek()) {
                count++;
                days.poll();
            }

            answer.add(count);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
