package progammers.level2;

import java.util.ArrayList;
import java.util.List;

// [카카오 인턴] 수식 최대화
public class PG_67257 {
    public static void main(String[] args) {
        System.out.println(solution("100-200*300-500+20"));
        System.out.println(solution("50*6-3*2"));
    }

    static long solution(String expression) {

        List<Long> nums = new ArrayList<>();
        List<String> exp = new ArrayList<>();

        int numInx = 0;
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            switch (ch) {
                 case '*', '+', '-' -> {
                     exp.add(String.valueOf(ch));
                     nums.add(Long.parseLong(expression.substring(numInx, i)));
                     numInx = i + 1;
                 }
             }
        }

        nums.add(Long.parseLong(expression.substring(numInx)));

        long answer = 0;
        answer = findMax(nums, exp, "*", "+", "-", answer);
        answer = findMax(nums, exp, "*", "-", "+", answer);
        answer = findMax(nums, exp, "+", "*", "-", answer);
        answer = findMax(nums, exp, "-", "*", "+", answer);
        answer = findMax(nums, exp, "-", "+", "*", answer);
        answer = findMax(nums, exp, "+", "-", "*", answer);

        return answer;
    }

    private static long findMax(List<Long> nums, List<String> exp, String s1, String s2, String s3, long answer) {
        long result = 0;

        int idx = 0;
        List<Long> tempNum = new ArrayList<>(nums);
        List<String> tempCal = new ArrayList<>(exp);

        while (!tempCal.isEmpty()) {
            if (tempCal.contains(s1))
                idx = tempCal.indexOf(s1);
            else if (tempCal.contains(s2))
                idx = tempCal.indexOf(s2);
            else
                idx = tempCal.indexOf(s3);

            if(idx == -1) break;

            long f = tempNum.remove(idx);
            long e = tempNum.remove(idx);
            String c = tempCal.remove(idx);

            result = switch (c) {
                case "*" -> f * e;
                case "+" -> f + e;
                case "-" -> f - e;
                default -> result;
            };
            tempNum.add(idx, result);
        }

        result = Math.max(answer, Math.abs(result));
        return result;
    }
}
