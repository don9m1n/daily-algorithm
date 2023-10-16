package progammers.level2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

// 영어 끝말잇기
public class PG12981 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));

    }

    static int[] solution(int n, String[] words) {
        int[] count = new int[n + 1];
        count[1] = 1;

        Map<String, Boolean> map = new LinkedHashMap<>();
        map.put(words[0], true);

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String curr = words[i];

            count[i % n + 1]++;

            if (prev.charAt(prev.length() - 1) != curr.charAt(0) || map.containsKey(curr)) {
                return new int[]{i % n + 1, count[i % n + 1]};
            } else {
                map.put(words[i], true);
            }
        }

        return new int[]{0, 0};
    }
}
