package baekjoon.level12;

import java.io.*;
import java.util.Arrays;

public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        int[] count = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            count[Integer.parseInt(br.readLine())]++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<10001; i++){
            if(count[i] != 0) {
                for(int j=0; j<count[i]; j++){
                    bw.write(i + "\n");
                }
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }
}