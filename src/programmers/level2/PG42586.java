package programmers.level2;

import java.util.*;

// 기능 개발 [스택, 큐]
public class PG42586 {

    public static void main(String[] args) {
        int[] solution = solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        System.out.println(Arrays.toString(solution));
    }

    /**
     * 각 기능 개발완료에 필요한 날짜수 구해서 Queue에 저장.
     * 뒤의 개발완료 날짜가 앞의 날짜보다 작으면 개발이 완료되었다는 뜻이므로 같이 카운팅해서 리턴
     */
    public static int[] solution(int[] progresses, int[] speeds) {

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0);
            queue.add(day);
        }

        while (!queue.isEmpty()) {
            int cnt = 1;

            int top = queue.poll();
            while(!queue.isEmpty() && queue.peek() <= top) {
                queue.poll();
                cnt++;
            }
            list.add(cnt);
        }

        int[] solution = new int[list.size()];
        for (int i = 0; i < solution.length; i++) {
            solution[i] = list.get(i);
        }

        return solution;
    }
}
