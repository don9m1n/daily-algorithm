package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 덩치
public class BOJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] person = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            person[i][0] = weight;
            person[i][1] = height;
        }

        List<Integer> rank = new ArrayList<>();
        for (int i = 0; i < person.length; i++) {
            int count = 0; // 덩치 등수를 구하기 위한 카운팅 변수
            for (int j = 0; j < person.length; j++) {
                if(i == j) continue; // 자기 자신과는 비교하지 않음
                if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
                    count++;
                }
            }
            rank.add(count + 1);
        }

        for (Integer r : rank) {
            System.out.print(r + " ");
        }
    }
}
