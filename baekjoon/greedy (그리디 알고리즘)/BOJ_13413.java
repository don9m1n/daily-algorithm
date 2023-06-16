package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 오셀로 재배치
public class BOJ_13413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T > 0) {
            int N = Integer.parseInt(br.readLine());

            String[] arr1 = br.readLine().split("");
            String[] arr2 = br.readLine().split("");

            int wbCnt = 0;
            int bwCnt = 0;
            for(int i=0; i<N; i++) {
                if(arr1[i].equals("W") && arr2[i].equals("B")){
                    wbCnt++;
                }else if(arr1[i].equals("B") && arr2[i].equals("W")) {
                    bwCnt++;
                }
            }
            System.out.println(Math.max(wbCnt, bwCnt));
            T--;
        }
    }
}
