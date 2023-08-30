package programmers.level1.success;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// 제일 작은 수 제거하기
public class PG12935 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{4, 3, 2, 1});
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] arr) {

        if(arr.length == 1) {
            return new int[] {-1};
        }

        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) continue;
            list.add(arr[i]);
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
