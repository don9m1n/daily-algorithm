package progammers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 제일 작은 수 제거하기
public class PG_12935 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{10})));
    }

    static public int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != min) list.add(num);
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
