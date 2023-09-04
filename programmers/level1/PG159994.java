package progammers.level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 카드 뭉치
public class PG159994 {
    public static void main(String[] args) {
        String solution = solution(
                new String[]{"i", "water", "drink"},
                new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"}
        );

        System.out.println("solution = " + solution);
    }

    static String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));

        boolean flag = true;
        for (int i = 0; i < goal.length; i++) {
            String word = goal[i]; // 체크할 단어

            if (!q1.isEmpty() && q1.peek().equals(word)) {
                q1.poll(); // 뽑는다!
            } else if (!q2.isEmpty() && q2.peek().equals(word)) {
                q2.poll(); // 뽑는다!
            } else {
                flag = false;
                break;
            }
        }
        return flag ? "Yes" : "No";
    }
}
