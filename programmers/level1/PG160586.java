package progammers.level1;

import java.util.Arrays;

// 대충 만든 자판
public class PG160586 {
    public static void main(String[] args) {
        System.out.println((Arrays.toString(solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"}))));
        System.out.println(Arrays.toString(solution(new String[]{"AA"}, new String[]{"B"})));
        System.out.println(Arrays.toString(solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"})));
        System.out.println(Arrays.toString(solution(new String[]{"A", "AAAB"}, new String[]{"B"})));
        System.out.println(Arrays.toString(solution(new String[]{"ABCDE", "ABBCE"}, new String[]{"ABBEF"})));
    }

    static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int result = 0;

            String[] arr = targets[i].split("");
            for (int j = 0; j < arr.length; j++) {
                String word = arr[j];
                if(click(word, keymap) == -1){
                    result = -1;
                    break;
                } else {
                    result += click(word, keymap);
                }
            }
            answer[i] = result;
        }

        return answer;
    }

    private static int click(String word, String[] keymap) {
        int min = 101;
        for (int i = 0; i < keymap.length; i++) {
            String[] arr = keymap[i].split("");
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (word.equals(arr[j])) {
                    min = Math.min(min, count);
                } else {
                    count++;
                }
            }
        }
        return min == 101 ? -1 : min;
    }
}
