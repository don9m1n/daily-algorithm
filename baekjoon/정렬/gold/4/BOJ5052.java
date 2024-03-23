package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 전화번호 목록
public class BOJ5052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] nums = new String[n];

            for (int i = 0; i < n; i++) {
                nums[i] = br.readLine();
            }

            Arrays.sort(nums);

            String answer = "YES";
            for (int i = 0; i < n - 1; i++) {
                if (nums[i + 1].startsWith(nums[i])) {
                    answer = "NO";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}