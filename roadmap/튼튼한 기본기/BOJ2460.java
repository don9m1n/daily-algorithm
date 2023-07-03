package roadmap.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 지능형 기차 2
public class BOJ2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int people = 0;
        StringTokenizer st;
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());

            int down = Integer.parseInt(st.nextToken());
            int up = Integer.parseInt(st.nextToken());

            people = people - down + up;
            max = Math.max(max, people);
        }

        System.out.println(max);
    }
}
