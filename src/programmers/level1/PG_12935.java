package programmers.level1.solve;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

// 제일 작은 수 제거하기
public class PG_12935 {
    public int[] solution(int[] arr) {
        // 배열 크키가 1이면 -1 리턴
        if(arr.length == 1) {
            return new int[] {-1};
        }

        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            if (j != min) {
                sb.append(j).append("!");
            }
        }

        int[] answer = new int[arr.length - 1];
        String[] res = sb.toString().split("!");
        for(int i = 0; i < res.length; i++) {
            answer[i] = Integer.parseInt(res[i]);
        }

        return answer;
    }

    @Test
    public void test() {
        int[] arr = {10, 2, 3, 5};

        int[] result = solution(arr);
        Assert.assertEquals(Arrays.toString(new int[]{1, 0, 3, 5}), Arrays.toString(result));
    }
}
