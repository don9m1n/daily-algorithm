package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 윷놀이
public class BOJ2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            int[] arr = new int[2]; // 배 등
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 4; j++) {
                arr[Integer.parseInt(st.nextToken())]++;
            }

            if(arr[0] == 1 && arr[1] == 3) {
                System.out.println("A");
            } else if(arr[0] == arr[1]) {
                System.out.println("B");
            } else if(arr[0] == 3 &&  arr[1] == 1) {
                System.out.println("C");
            } else if (arr[0] == 4) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
    }
}
