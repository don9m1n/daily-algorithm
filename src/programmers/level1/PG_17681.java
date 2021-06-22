package programmers.level1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

// [카카오] 비밀지도
public class PG_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map1 = getBinary(arr1, n);
        String[] map2 = getBinary(arr2, n);

        return getResult(map1, map2, n);
    }

    public String[] getResult(String[] arr1, String[] arr2, int n) {
        String[] answer = new String[n];
        for(int i =0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            while(j < n) {
                if(arr1[i].charAt(j) == '#' || arr2[i].charAt(j) == '#') {
                    sb.append("#");
                }else {
                    sb.append(" ");
                }
                j++;
            }
            answer[i] = sb.reverse().toString();
        }

        return answer;
    }


    public String[] getBinary(int[] arr, int n) {
        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            while (arr[i] > 0) {
                int num = arr[i] % 2;
                if (num == 1) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
                arr[i] /= 2;
            }

            if (sb.length() < n) {
                while (sb.length() < n) {
                    sb.append(" ");
                }
            }
            result[i] = sb.toString();
        }

        return result;
    }


    @Test
    public void test() {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] result = solution(n, arr1, arr2);

        Assert.assertEquals(Arrays.toString(new String[]{"#####", "# # #", "### #", "# ##", "#####"}), Arrays.toString(result));
    }
}
