package programmers.level2.solve;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

// 기능개발
public class PG_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++) {
            queue.add((int)(Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        List<Integer> answer = new ArrayList<>();
        while(!queue.isEmpty()) {
            int day = queue.poll();
            int cnt = 1;

            while(!queue.isEmpty() && (day >= queue.peek())) {
                cnt++;
                queue.poll();
            }
            answer.add(cnt);
        }

        // Integer.intValue: Integer객체에서 int 타입 값을 뽑아내는 메서드
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void test() {
        // given
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        // when
        int[] result = solution(progresses, speeds);

        // then
        Assertions.assertEquals(Arrays.toString(new int[] {2, 1}), Arrays.toString(result));
    }
}
