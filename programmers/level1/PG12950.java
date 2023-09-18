package progammers.level1;

import java.util.Arrays;

// 행렬의 덧셈
public class PG12950 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})));
        System.out.println(Arrays.deepToString(solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}})));
    }

    static int[][] solution(int[][] arr1, int[][] arr2) {

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }

        return arr1;
    }
}
