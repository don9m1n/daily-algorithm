package baekjoon.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] boj = new String[N][3];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            boj[i][0] = st.nextToken();
            boj[i][1] = st.nextToken();
            boj[i][2] = String.valueOf(i); // 가입순서
        }

        Arrays.sort(boj, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].equals(o2[0])) {
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }else {
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }
            }
        });

        for(String[] str : boj) {
            System.out.println(str[0] + " " + str[1]);
        }
    }
}
