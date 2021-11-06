package programmers.level2;

import java.util.Stack;

// 짝지어 제거하기 <2017 팁스타운>
public class PG12973 {

    public static void main(String[] args) {
        int result = solution("baabaa");
        System.out.println("result = " + result);
    }

    public static int solution(String s) {

        String[] word = s.split("");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < word.length; i++) {
            if(!stack.isEmpty() && word[i].equals(stack.peek())) {
                stack.pop();
            }else {
                stack.push(word[i]);
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }
}
