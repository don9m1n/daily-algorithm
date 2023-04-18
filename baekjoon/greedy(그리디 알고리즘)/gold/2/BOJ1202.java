package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 보석 도둑
public class BOJ1202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Gem[] gems = new Gem[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            gems[i] = new Gem(m, v);
        }

        Arrays.sort(gems, (o1, o2) -> o1.m - o2.m);

        int[] bag = new int[k];
        for (int i = 0; i < k; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bag);

        long sum = 0;
        int index = 0;
        PriorityQueue<Gem> pq = new PriorityQueue<>((o1, o2) -> o2.v - o1.v);
        for(int i = 0; i < k; i++) {
            while(index < n && gems[index].m <= bag[i]) {
                Gem current = gems[index++];
                pq.add(new Gem(current.m, current.v));
            }

            if(!pq.isEmpty()) sum += pq.poll().v;
        }

        System.out.println(sum);

    }

    public static class Gem {
        int m;
        int v;

        public Gem(int m, int v) {
            this.m = m;
            this.v = v;
        }
    }
}
