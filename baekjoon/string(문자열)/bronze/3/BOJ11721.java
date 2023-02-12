package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 열 개씩 끊어 출력하기
public class BOJ11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        cutAndPrint(str);
        cutAndPrintSolution(str);
    }

    private static void cutAndPrintSolution(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if(i % 10 == 9) {
                System.out.println();
            }
        }
    }

    private static void cutAndPrint(String str) {
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        int length = str.length();

        while(length > 0) {
            if (length >= 10) {
                sb.append(str.substring(idx, idx + 10)).append("\n");
                idx += 10;
                length -= 10;
            }else {
                sb.append(str.substring(idx)).append("\n");
                length = 0;
            }
        }

        System.out.println(sb.toString());
    }
}
