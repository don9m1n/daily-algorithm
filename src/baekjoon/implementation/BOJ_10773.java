package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 제로
public class BOJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                for(int j=i-1; j>=0; j--) {
                    if(arr[j] != 0) {
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }

        int sum = 0;
        for(int n : arr) {
            sum += n;
        }
        System.out.println(sum);
    }
}
