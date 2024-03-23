package baekjoon.queue.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 카드1
public class BOJ_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(queue.poll()).append(" ");

        while (!queue.isEmpty()) {
            queue.add(queue.poll());
            sb.append(queue.poll()).append(" ");
        }

        System.out.println(sb);
    }
}
