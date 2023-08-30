package programmers.level1.success;

import java.util.*;

// 달리기 경주
public class PG178871 {
    public static void main(String[] args) {
        String[] solution = solution(
                new String[]{"mumu", "soe", "poe", "kai", "mine"},
                new String[]{"kai", "kai", "mine", "mine"}
        );

        System.out.println(Arrays.toString(solution));
    }

    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            int index = map.get(callings[i]);

            if (index > 0) {
                String tmp = players[index - 1];
                players[index - 1] = callings[i];
                players[index] = tmp;

                map.put(players[index - 1], index - 1);
                map.put(players[index], index);
            }
        }

        return players;
    }
}
