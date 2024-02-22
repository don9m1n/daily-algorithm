package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 잃어버린 괄호
public class BOJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("-");

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            if(arr[i].contains("+")) {
                for (String str : arr[i].split("\\+")) {
                    num += Integer.parseInt(str);
                }
            } else {
                num = Integer.parseInt(arr[i]);
            }
            result = i == 0 ? num : result - num;
        }
        System.out.println(result);
    }
}
