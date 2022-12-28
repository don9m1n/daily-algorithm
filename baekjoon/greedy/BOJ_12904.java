package baekjoon.greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

// A와 B
public class BOJ_12904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // solution: T를 꺼꾸로 돌면서 A이면 A를 제거, B면 B제거 후 문자열을 뒤집어줌
        //           반복하다가 T와 S가 같아지면 return 1, else return 0;
        StringBuilder S = new StringBuilder(br.readLine());
        StringBuilder T = new StringBuilder(br.readLine());

        while(S.length() < T.length()) {
            if(T.charAt(T.length()-1) == 'A') {
                T.deleteCharAt(T.length()-1);
            } else if (T.charAt(T.length() - 1) == 'B') {
                T.deleteCharAt(T.length()-1);
                T.reverse();
            }
        }

        if(S.toString().equals(T.toString())) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
