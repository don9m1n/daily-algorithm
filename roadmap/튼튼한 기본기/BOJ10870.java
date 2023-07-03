package roadmap.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 5
public class BOJ10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int num) {
        if (num == 1) {
            return 1;
        }

        if (num == 0) {
            return 0;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
