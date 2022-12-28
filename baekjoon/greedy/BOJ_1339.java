package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 단어 수학
public class BOJ_1339_단어수학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N]; // 문자열을 담을 공간
        int[] alpha = new int[26];  // 알파벳 개수를 담을 배열

        for(int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }

        for(int i=0; i<N; i++) {
            int temp = (int)Math.pow(10, arr[i].length() - 1);
            for(int j=0; j<arr[i].length(); j++) {
                alpha[(int)arr[i].charAt(j)- 65] += temp;
                temp /= 10;
            }
        }

        Arrays.sort(alpha);

        int index = 9;
        int sum = 0;
        for(int i=alpha.length-1; i>0; i--, index--) {
            sum += index * alpha[i];
        }
        System.out.println(sum);

    }
}
