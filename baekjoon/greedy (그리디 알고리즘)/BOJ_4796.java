package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i=0;
        while(true){
            int result = 0;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L == 0 && P == 0 && V == 0) {
                break;
            }

            while(V - P > 0) {
                V -= P;
                result += L;
            }

            if(L >= V) {
                result += V;
            }else {
                result += L;
            }

            System.out.printf("Case %d: %d\n", i+1, result);
            i++;
        }
    }
}