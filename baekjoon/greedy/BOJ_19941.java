package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 햄버거
public class BOJ_19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String[] arr = br.readLine().split("");

        int cnt = 0;
        for(int i=0; i<N; i++) {
            if(!arr[i].equals("P")) {
                continue;
            }

            for(int j=i-K; j<=i+K; j++) {
                if(j >= 0 && j<N && arr[j].equals("H")){
                    arr[j] = "-";
                    // System.out.println(Arrays.toString(arr));
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
