package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

// 국회의원 선거
public class BOJ1417 {

    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        while (true) {

            int max = 0;
            int index = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index = i;
                }
            }

            if (arr[0] <= max) {
                arr[0]++;
                count++;
                arr[index]--;
            }

            if (!isCheck()) {
                break;
            }
        }

        System.out.println(count);
    }

    private static boolean isCheck() {
        for (int i = 1; i < n; i++) {
            if (arr[0] <= arr[i]) {
                return true;
            }
        }
        return false;
    }
}
