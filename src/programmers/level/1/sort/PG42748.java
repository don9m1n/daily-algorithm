package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// K번째 수
public class PG42748 {

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println(Arrays.toString(solution));

    }

    public static int[] solution(int[] array, int[][] commands) {

        List<Integer> list = new ArrayList<>();
        int[] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            for(int j = start - 1; j < end; j++) {
                list.add(array[j]);
            }

            Collections.sort(list);
            result[i] = list.get(k - 1);
            list.clear();
        }

        return result;
    }
}
