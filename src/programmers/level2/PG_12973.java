package programmers.level2.solve;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

// 짝지어 제거하기
public class PG_12973 {
    public int solution(String s) {
        // Hint: Stack or Queue로 풀면 시간복잡도 O(n)으로 풀 수 있음 -> 반복문으로 풀면 시간초과 남....
        Stack<Character> stack = new Stack<>();

        // toCharArray(): String -> char[]
        for(char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        // stack이 비어있으면(제거완료) 1, stack이 비어있지 않다면(제거실패) 0 return
        return stack.isEmpty() ? 1 : 0;
    }

    @Test
    public void test() {
        String s = "baabaa";
        int result = solution(s);
        Assert.assertEquals(1, result);
    }
}