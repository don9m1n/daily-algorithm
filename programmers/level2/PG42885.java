package progammers.level2;

import java.util.Arrays;
import java.util.Stack;

// 구명보트
public class PG42885 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{40, 50, 150, 160}, 200));
        System.out.println(solution(new int[]{40, 40}, 100));
        System.out.println(solution(new int[]{40}, 100));
    }

    static int solution(int[] people, int limit) {
        Arrays.sort(people);

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = people.length - 1; i >= 0; i--) {
            if (people[i] > limit / 2) {
                stack.push(people[i]);
                count++;
            } else {
                if (stack.isEmpty()) {
                    stack.push(people[i]);
                    count++;
                } else if (stack.peek() + people[i] <= limit) {
                    stack.pop();
                }else {
                    stack.push(people[i]);
                    count++;
                }
            }
        }

        return count;
    }
}
