package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},
                            {4,4,1},
                            {1,7,3}};

        int[] result = solution(array, commands);
        System.out.println(Arrays.toString(result));

    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i< commands.length; i++) {
            int[] arr2 = new int[commands[i][1] - commands[i][0] + 1];
            System.arraycopy(array, commands[i][0]-1, arr2, 0, commands[i][1] - commands[i][0] + 1);

            Integer[] arr3 = new Integer[arr2.length];
            for(int j=0; j<arr3.length; j++) {
                arr3[j] = arr2[j];
            }

            // sorting!!
            Arrays.sort(arr3, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });

            answer[i] = arr3[commands[i][2] - 1];
        }
        return answer;
    }
}