package baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 덩치
// Test Case Print: 2 2 1 2 5
public class BOJ_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] rank = new int[N]; // 덩치랭크 count
        Arrays.fill(rank, 1); // 배열 값은 1로 채움

        int[][] person = new int[N][2]; // 키, 몸무게 value

        // person value setting!
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            person[i][0] = Integer.parseInt(st.nextToken());
            person[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] result = tankRank(person, rank);
        for(int x : result) {
            System.out.print(x + " ");
        }

    }

    // counting method !!
    static int[] tankRank(int[][] person, int[] rank){
        for(int i=0; i<person.length; i++){
            for(int j=0; j<person.length; j++){
                if(person[j][0] > person[i][0] && person[j][1] > person[i][1]){
                    rank[i]++;
                }
            }
        }
        return rank;
    }
}