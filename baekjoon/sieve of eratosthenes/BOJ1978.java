package baekjoon.sieve_of_eratosthenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// 소수찾기
public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        int m = nums[n - 1];

        boolean[] primes = new boolean[m + 1];
        primes[0] = primes[1] = true;

        for (int i = 2; i <= m; i++) {
            if(!primes[i]) {
                for (int j = 2 * i; j <= m; j += i) {
                    primes[j] = true;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!primes[nums[i]]) cnt++;
        }

        System.out.println(cnt);
    }
}

