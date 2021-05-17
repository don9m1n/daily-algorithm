package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 신입 사원
public class BOJ_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // Test Case!

        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] score = new int[N][2]; // 점수를 담을 배열

            // 배열 세팅
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                score[j][0] = Integer.parseInt(st.nextToken()); // 서류 심사 성적
                score[j][1] = Integer.parseInt(st.nextToken()); // 면접 성적 순위
            }

            Arrays.sort(score, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });

            int cnt = 1; // 첫 번째 지원자는 무조건 채용됨
            int maxScore = score[0][1];
            for (int j = 1; j < score.length; j++) {
                // 서류 성적 순으로 정렬했기 때문에 면접 순위가 전 사람 보다 좋으면 채용됨
                if(score[j][1] < maxScore) {
                    cnt++;
                    maxScore = score[j][1];
                }
            }
            System.out.println(cnt);

        }
    }
}
