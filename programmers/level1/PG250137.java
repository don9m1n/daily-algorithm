package progammers.level1;

import java.util.HashMap;
import java.util.Map;

// [PCCP 기출문제] 1번 / 붕대 감기
public class PG250137 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 1, 5}, 30, new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}}));
        System.out.println(solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));

    }

    static int solution(int[] bandage, int health, int[][] attacks) {
        int endTime = 0;
        int currHealth = health;

        Map<Integer, Integer> attackMap = new HashMap<>();
        for (int[] attack : attacks) {
            attackMap.put(attack[0], attack[1]);
            endTime = attack[0];
        }

        int success = 0;

        int index = 0;
        for (int i = 1; i <= endTime; i++) {
            if (attackMap.containsKey(i)) {
                currHealth -= attackMap.get(i);
                success = 0;
            } else {

                currHealth += bandage[1];
                success++;

                if (success == bandage[0]) {
                    currHealth += bandage[2];
                    success = 0;
                }

                if (currHealth > health) {
                    currHealth = health;
                }
            }

            if (currHealth <= 0) {
                return -1;
            }
        }

        return currHealth;
    }
}
