package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 뒤집기
public class BOJ_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = str.split("");
        int zero = 0, one = 0;

        if(arr[0].equals("0")) {
            zero++;
        }else {
            one++;
        }

        for(int i=1; i<arr.length; i++) {
            if(!(arr[i-1].equals(arr[i]))) {
                if (arr[i].equals("0")) {
                    zero++;
                } else {
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero, one));
    }
}
