package progammers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// [PCCE 기출문제] 10번 / 데이터 분석
public class PG250121 {
    public static void main(String[] args) {
        int[][] solution = solution(new int[][]{{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}},
                "date", 20300501, "remain");

        for (int[] s : solution) {
            System.out.println(Arrays.toString(s));
        }
    }

    static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        List<int[]> list = new ArrayList<>();
        int index = -1;
        switch (ext) {
            case "code" -> index = 0;
            case "date" -> index = 1;
            case "maximum" -> index = 2;
            case "remain" -> index = 3;
        }

        for (int[] datum : data) {
            if (datum[index] < val_ext) {
                list.add(datum);
            }
        }

        switch (sort_by) {
            case "code" -> index = 0;
            case "date" -> index = 1;
            case "maximum" -> index = 2;
            case "remain" -> index = 3;
        }


        int sortIndex = index;
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[sortIndex] - o2[sortIndex];
            }
        });

        int[][] answer = new int[list.size()][4];

        for (int i = 0; i < list.size(); i++) {
            answer[i][0] = list.get(i)[0];
            answer[i][1] = list.get(i)[1];
            answer[i][2] = list.get(i)[2];
            answer[i][3] = list.get(i)[3];
        }

        return answer;
    }
}
