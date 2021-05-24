package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 과제
public class BOJ_13904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 배열을 과제 점수가 높은 순서대로 정렬 !!
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int[] scores = new int[1001];
        int maxScore = 0; // Result Value

        for(int i=0; i<N; i++) {
            for(int j=arr[i][0]; j>0; j--) {
                if(scores[j] == 0) {
                    scores[j] = arr[i][1];
                    break;
                }
            }
        }

        for(int score : scores) {
            maxScore += score;
        }

        System.out.println(maxScore);



    }
}