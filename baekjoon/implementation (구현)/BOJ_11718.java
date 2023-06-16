package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그대로 출력하기
public class BOJ_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        // BufferedReader의 EOF
        // EOF(End Of File): 더 이상 데이터가 없음을 알려주고 파일의 끝을 나타내기 위해 사용함
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
