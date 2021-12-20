package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920 {

    static BufferedReader br;
    static StringTokenizer st;
    static int[] a;
    static int[] b;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        a = createArray(n);
        Arrays.sort(a);

        int m = Integer.parseInt(br.readLine());
        b = createArray(m);

        for (int i = 0; i < m; i++) {
            int target = b[i]; // 찾을 값
            int length = a.length; // 이분 탐색을 할 배열의 길이

            System.out.println(checkNumber(target, length));
        }
    }

    /**
     * 이분 탐색 메서드
     */
    private static int checkNumber(int target, int length) {
        int left = 0;
        int right = length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(a[mid] == target) {
                return 1;
            } else if(a[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }

    /**
     * 배열 생성 메서드
     */
    private static int[] createArray(int n) throws IOException {
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt((st.nextToken()));
        }
        return arr;
    }
}
