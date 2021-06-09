package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 0 = not cute / 1 = cute
public class BOJ_10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            if(Integer.parseInt(br.readLine()) == 1) {
                cnt++;
            }
        }
        if(cnt > N - cnt) {
            System.out.println("Junhee is cute!");
        }else {
            System.out.println("Junhee is not cute!");
        }
    }
}
