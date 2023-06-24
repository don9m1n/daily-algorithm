package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 라면 사기
public class BOJ18185 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10002];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int price = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i + 1] > arr[i + 2]) {
                int two = Math.min(arr[i], arr[i + 1] - arr[i + 2]);
                price += 5 * two;
                arr[i] -= two;
                arr[i + 1] -= two;

                int three = Math.min(arr[i], Math.min(arr[i + 1], arr[i + 2]));
                price += 7 * three;
                arr[i] -= three;
                arr[i + 1] -= three;
                arr[i + 2] -= three;
            }
            else {
                int three = Math.min(arr[i], Math.min(arr[i + 1], arr[i + 2]));
                price += 7 * three;
                arr[i] -= three;
                arr[i + 1] -= three;
                arr[i + 2] -= three;

                int two = Math.min(arr[i], arr[i + 1]);
                price += 5 * two;
                arr[i] -= two;
                arr[i + 1] -= two;
            }

            price += 3 * arr[i];
        }
        System.out.println(price);
    }
}
