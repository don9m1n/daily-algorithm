package programmers.level1.success;

import java.util.Arrays;

// 가장 가까운 같은 글자
public class PG142086 {
    public static void main(String[] args) {
        int[] result = solution("aaaaa");
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String s) {
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int index = 'z' - s.charAt(i);
            if (alphabet[index] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - alphabet[index];
            }
            alphabet[index] = i;
        }
        return answer;
    }
}
