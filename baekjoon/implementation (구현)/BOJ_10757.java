package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 큰 수 A+B
public class BOJ_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // long의 표현 범위: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        // BigInteger를 사용해서 계산
        BigInteger bn1 = new BigInteger(st.nextToken());
        BigInteger bn2 = new BigInteger(st.nextToken());

        System.out.println(bn1.add(bn2));
    }
}
