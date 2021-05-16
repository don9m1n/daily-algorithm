package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// UCPC는 무엇의 약자일까?
public class BOJ_15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = str.split("");
        String[] ucpc = {"U", "C", "P", "C"};
        int index = 0;

        for(int i=0; i<arr.length; i++) {
            if (arr[i].equals(ucpc[index])) {
                index++;
            }

            if(index == 4) {
                System.out.println("I love UCPC");
                return;
            }
        }
        System.out.println("I hate UCPC");
    }
}
