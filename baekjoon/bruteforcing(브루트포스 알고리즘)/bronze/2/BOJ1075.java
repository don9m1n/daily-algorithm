package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 나누기
public class BOJ1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        int start = n - (n % 100);

        int num = 0;
        for (int i = start; i < start + 100; i++) {
            if(i % f == 0) {
                num = i;
                break;
            }
        }

        int result = num % 100;
        if(result < 10) {
            System.out.println("0" + result);
        }else {
            System.out.println(result);
        }
    }
}
