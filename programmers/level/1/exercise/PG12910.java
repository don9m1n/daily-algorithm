package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 나누어 떨어지는 숫자 배열
public class PG12910 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{3, 2, 6}, 10);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if(num % divisor == 0) list.add(num);
        }

        if(list.isEmpty()) {
            return new int[]{-1};
        } else {
            Collections.sort(list);
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
