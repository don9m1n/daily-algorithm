package baekjoon.two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 소수의 연속합
public class BOJ1644 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> primeNumber = checkPrimeNumber(n);

        int sum = 0; // 부분합
        int right = 0;
        int cnt = 0;

        int size = primeNumber.size();
        for (int left = 0; left < size; left++) {
            while(sum < n && right < size) {
                sum += primeNumber.get(right++);
            }

            if(sum == n) {
                cnt++;
            }
            sum -= primeNumber.get(left);
        }
        System.out.println(cnt);
    }

    // 소수 출력
    private static List<Integer> checkPrimeNumber(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if(!prime[i]) {
                for (int j = i*i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i < prime.length; i++) {
            if(!prime[i]) list.add(i);
        }
        return list;
    }
}
