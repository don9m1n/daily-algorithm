package baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분해합
// N이 주어졌을 때, N의 가장 작은 생성자를 구하는 프로그램
// 생성자가 없는 경우에는 return 0
// Test Case: 216 -> 198
public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = magicNumber(N);
        System.out.println(result);
    }

    static int magicNumber(int n) {
        for(int i=1; i<n; i++){
            int result = i;
            int num = i; // while 문에서 사용할 num

            while(num > 0) {
                result += num % 10;
                num /= 10;
            }

            if(result == n) {
                return i;
            }
        }
        return 0;
    }
}
