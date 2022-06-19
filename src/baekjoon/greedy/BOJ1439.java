package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 뒤집기
public class BOJ1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int solution = greedy(s);
        System.out.println("solution = " + solution);
    }

    private static int greedy(String s) {
        String[] arr = s.split("");

        int[] count = new int[2];
        String prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(prev)) { // 현재 문자와 이전 문자가 다르다면 prev에 해당하는 문자의 개수를 +1 하고 prev를 현재 문자로 치환
                count[Integer.parseInt(prev)]++;
                prev = arr[i];
            }

            if (i == arr.length - 1) {
                count[Integer.parseInt(prev)]++;
            }
        }

        return Math.min(count[0], count[1]);
    }

    // 토큰으로 나누어서 크기 판별하는 방식
    private static int token(String s) {
        StringTokenizer zeroToken = new StringTokenizer(s, "0");
        StringTokenizer oneToken = new StringTokenizer(s, "1");

        return Math.min(zeroToken.countTokens(), oneToken.countTokens());
    }
}
