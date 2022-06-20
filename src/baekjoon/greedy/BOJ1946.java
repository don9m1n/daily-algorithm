package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 신입사원
public class BOJ1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] score = new int[n][2]; // 점수 저장 배열

            StringTokenizer st;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                score[j][0] = Integer.parseInt(st.nextToken());
                score[j][1] = Integer.parseInt(st.nextToken());
            }

            // 순위 오름차순 정렬
            Arrays.sort(score, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });

            int max = success(score);
            System.out.println(max);
        }

    }

    // 신입사원의 최대 수를 반환하는 메서드
    private static int success(int[][] score) {

        int count = 1;
        int min = score[0][1]; // 최고 순위
        for (int i = 1; i < score.length; i++) {
            if(score[i][1] < min) { // 타겟의 점수가 min보다 작다는 말은 순위가 높다는 말과 같기 때문에 count + 1
                min = score[i][1];
                count++;
            }
        }
        return count;

        /* 시간 초과!
        for (int i = 0; i < score.length; i++) {
            if(i == score.length - 1) {
                result++;
                break;
            }

            boolean flag = false;
            for (int j = i + 1; j < score.length; j++) {
                if (score[i][1] > score[j][1]) { // 현재 지원자의 점수보다 높은 점수라면 채용이 불가능
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                result++;
            }
        }
        */
    }
}
