package baekjoon.priorityqueue.silver.tier3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 크리스마스 선물
public class BOJ_14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            if (a > 0) {
                for (int j = 0; j < a; j++) {
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            } else if(a == 0){
                if (pq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
