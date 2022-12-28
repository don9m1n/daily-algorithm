package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 배수와 약수
public class BOJ_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0 && B == 0) {
                break;
            }

            if(B % A == 0) {
                System.out.println("factor");
            }else if(A % B == 0) {
                System.out.println("multiple");
            }else {
                System.out.println("neither");
            }
        }

    }
}
