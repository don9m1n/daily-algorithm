package baekjoon.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 소트인사이드
public class BOJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String num = String.valueOf(N); // 숫자 길이와 크기가 같은 배열을 만들거임

        int[] nums = new int[num.length()];

        int i=0;
        while(N > 0) {
            nums[i] = N % 10;
            N /= 10;
            i++;
        }
        Integer[] boxed_nums = new Integer[nums.length];

        for(int j=0; j<boxed_nums.length; j++){
            boxed_nums[j] = nums[j];
        }

        Arrays.sort(boxed_nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for(int res : boxed_nums) {
            System.out.print(res);
        }

    }
}
