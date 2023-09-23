package progammers.level2;

import java.util.Arrays;
import java.util.Stack;

// 뒤에 있는 큰 수 찾기
public class PG154539 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 3, 3, 5})));
        System.out.println(Arrays.toString(solution(new int[]{9, 1, 5, 3, 6, 2})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(solution(new int[]{2, 2, 2, 3})));
        System.out.println(Arrays.toString(solution(new int[]{5, 4, 3, 2, 1})));
    }

    static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                if (stack.peek() > numbers[i]) {
                    answer[i] = stack.peek();
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                answer[i] = -1;
            }

            stack.push(numbers[i]);
        }

        return answer;
    }
}
