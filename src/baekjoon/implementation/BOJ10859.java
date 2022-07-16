package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 뒤집어진 소수
public class BOJ10859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if(s.equals("1")) {
            System.out.println("no");
            return;
        }

        // 입력받은 숫자가 소수가 아니라면 바로 no!!
        long num = Long.parseLong(s);
        if (isPrimeNumber(num)) {
            System.out.println("no");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '3' || ch == '4' || ch == '7') {
                System.out.println("no");
                return;
            }else if(ch == '6'){
                sb.append('9');
            } else if (ch == '9') {
                sb.append('6');
            }else {
                sb.append(ch);
            }
        }
        System.out.println(isPrimeNumber(Long.parseLong(sb.toString())) ? "no" : "yes");
    }

    // 소수 판별
    private static boolean isPrimeNumber(long num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return true;
        }
        return false;
    }
}
