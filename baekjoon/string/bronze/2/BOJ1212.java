package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 8진수 2진수
public class BOJ1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split("");

        String solution = transfer(nums);
        System.out.println(solution);
    }

    private static String transfer(String[] nums) {
        StringBuilder sb = new StringBuilder();

        // 1. 8진수 -> 2진수 변환
        for (String s : nums) {
            int num = Integer.parseInt(s);

            int digit = 2; // 자리올림수 [2, 1, 0]
            while (digit >= 0) {
                if (num - (int) Math.pow(2, digit) < 0) {
                    sb.append("0");
                } else {
                    sb.append("1");
                    num -= (int) Math.pow(2, digit);
                }
                digit--;
            }
        }

        // 2. 앞자리에 붙은 '0' 제거
        while (true) {
            if(sb.charAt(0) == '1' || sb.length() == 1) break;
            else sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
