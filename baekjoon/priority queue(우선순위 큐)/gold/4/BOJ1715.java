package baekjoon.priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 카드 정렬하기 [골드4]
public class BOJ1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int total = 0;
        while (pq.size() > 1) {
            int sum = pq.poll() + pq.poll();
            total += sum;
            pq.add(sum);
        }

        System.out.println(total);

    }
}
