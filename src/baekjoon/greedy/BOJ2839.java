package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 설탕 배달
public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // greedySugar(n);
        int solution = greedySugar2(n);
        System.out.println("solution = " + solution);
    }

    private static int greedySugar2(int n) {
        int cnt = 0;
        while (true) {
            if(n % 5 == 0) {
                cnt += n / 5;
                break;
            }else {
                n -= 3;
                cnt++;
            }

            if(n < 0) {
                return -1;
            }
        }
        return cnt;
    }

    private static void greedySugar(int n) {
        if (n == 4 || n == 7) {
            System.out.println(-1);
        }
        else if (n % 5 == 0) {
            System.out.println(n / 5);
        }
        else if (n % 5 == 1 || n % 5 == 3) {
            System.out.println((n / 5) + 1);
        }
        else if (n % 5 == 2 || n % 5 == 4) {
            System.out.println((n / 5) + 2);
        }
    }
}
