package progammers.level2;

import java.util.Arrays;

// 가장 큰 수
public class PG_42746 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));
        System.out.println(solution(new int[]{0, 0, 0}));
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }

    static String solution(int[] numbers) {

        StringBuilder answer = new StringBuilder();

        String[] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(nums, (o1, o2) -> (o2 +o1).compareTo(o1 +o2));

        for (String str : nums) {
            answer.append(str);
        }

        return answer.charAt(0) == '0' ? "0" : answer.toString();
    }
}
