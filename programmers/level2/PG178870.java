package progammers.level2;

import java.util.Arrays;

// 연속된 부분 수열의 합
public class PG178870 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(solution(new int[]{2, 2, 2, 2, 2}, 6)));
    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];

        int left = 0;
        int right = 0;

        int min = Integer.MAX_VALUE; // 최소 수열 길이
        int sum = 0;
        while (true) {
            if (sum >= k) {
                sum -= sequence[left++];
            } else if (right >= sequence.length) {
                break;
            } else {
                sum += sequence[right++];
            }

            if (sum == k) {
                int length = right - left;
                if (length < min) {
                    min = length;
                    answer[0] = left;
                    answer[1] = right - 1;
                }
            }
        }
        return answer;
    }
}
