package progammers.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 주식 가격
public class PG_42584 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }

    static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Queue<Integer> queue = new LinkedList<>();
        for (int price : prices) {
            queue.add(price);
        }

        int index = 1;
        while (!queue.isEmpty()) {
            int second = 0;

            int price = queue.poll();
            for (int i = index; i < prices.length; i++) {
                int next = prices[i];

                if (price > next) {
                    second++;
                    break;
                }

                second++;
            }

            answer[index - 1] = second;
            index++;
        }

        return answer;
    }
}
