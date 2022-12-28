package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// 주식 가격 [스택/큐]
public class PG42584 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 5, 6, 8, 9, 2, 3, 1};
        int[] solution = solution(prices);
        System.out.println(Arrays.toString(solution));
    }

    static int[] solution(int[] prices) {

        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            stack.push(prices[i]);
        }

        System.out.println(stack.toString());

        int start = 1;
        while (!stack.isEmpty()) {
            int price = stack.pop(); // 각 주식별 가격을 스택에서 꺼냄
            int count = 0; // 주식 가격이 떨어지지 않는 시간을 담을 변수
            for (int i = start; i < prices.length; i++) {
                if(price <= prices[i]) {
                    count++;
                } else if(price > prices[i]) {
                    count++;
                    break;
                }
            }
            list.add(count);
            start++; // 시작 위치 + 1
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
