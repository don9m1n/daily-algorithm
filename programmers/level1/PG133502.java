package progammers.level1;

import java.util.Stack;

// 햄버거 만들기
public class PG133502 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
        System.out.println(solution(new int[]{1, 3, 2, 3, 1}));
        System.out.println(solution(new int[]{1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1}));
    }

    static int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();

        int count = 0;
        for (int num : ingredient) {
            stack.push(num);

            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 4) == 1 &&
                        stack.get(stack.size() - 3) == 2 &&
                        stack.get(stack.size() - 2) == 3 &&
                        stack.get(stack.size() - 1) == 1
                ) {

                    count++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return count;
    }
}
