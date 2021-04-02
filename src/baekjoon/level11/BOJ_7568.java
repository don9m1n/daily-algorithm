package baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int rank[] = new int[N]; // 덩치랭크 count
        Arrays.fill(rank, 1);

        int[][] person = new int[N][2]; // 키, 몸무게 value

        // person value setting!
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            person[i][0] = Integer.parseInt(st.nextToken());
            person[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] result = tankRank(person, rank);

    }

    // counting method !!
    static int[] tankRank(int[][] person, int[] rank){
        int length = person.length; // 5
        for(int i=0; i<length; i++) {
            for(int j=i+1; j<length; j++) {
                for(int k=0; k<2; k++){
                    System.out.println(person[i][k] + "," + person[j][k]);
                }
            }
        }
        return rank;
    }
}