package programmers.level1;

import java.util.*;

// 같은 숫자는 싫어
public class PG12906 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }

        Stack<Integer> numbers = new Stack<>();
        while (!stack.isEmpty()) {
            int num = stack.pop();
            while (true) {
                if(stack.size() == 0 || stack.peek() != num) {
                    numbers.push(num);
                    break;
                }

                if(stack.peek() == num) {
                    stack.pop();
                }
            }
        }

        int[] result = new int[numbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers.pop();
        }
        return result;
    }
}
