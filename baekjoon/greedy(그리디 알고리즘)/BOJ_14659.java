package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한조서열정리하고옴ㅋㅋ
public class BOJ_14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dragon = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            dragon[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int max = 0;

        for(int i=0; i<N; i++) {
            System.out.println(cnt);
            for(int j=i+1; j<N; j++) {
                if (dragon[i] > dragon[j]) {
                    cnt++;
                } else {
                    break;
                }
            }

            /*
                처음에 cnt = 0을 넣었던 곳...
                cnt > max인 경우에만 cnt가 초기화 되기 때문에 밖에다 빼줘야함
             */
            if(cnt > max) {
                max = cnt;
            }

            cnt = 0;
        }
        System.out.println(max);
    }
}
