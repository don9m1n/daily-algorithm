package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 연산자 끼워넣기
public class BOJ14888 {

    static int n;
    static int[] nums;
    static int[] operator;
    static long max = Integer.MIN_VALUE;
    static long min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        operator = new int[4];
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        search(nums[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    private static void search(int num, int idx) {
        // 계산이 전부 종료되면 최대값, 최소값 구하기
        if (idx == n) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {

                operator[i]--;

                switch (i) {
                    case 0:
                        search(num + nums[idx], idx + 1);
                        break;
                    case 1:
                        search(num - nums[idx], idx + 1);
                        break;
                    case 2:
                        search(num * nums[idx], idx + 1);
                        break;
                    case 3:
                        search(num / nums[idx], idx + 1);
                        break;
                }

                operator[i]++;
            }
        }
    }
}
